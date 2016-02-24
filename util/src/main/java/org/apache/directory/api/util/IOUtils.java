/*
 *   Licensed to the Apache Software Foundation (ASF) under one
 *   or more contributor license agreements.  See the NOTICE file
 *   distributed with this work for additional information
 *   regarding copyright ownership.  The ASF licenses this file
 *   to you under the Apache License, Version 2.0 (the
 *   "License"); you may not use this file except in compliance
 *   with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 *
 */

package org.apache.directory.api.util;


import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;


/**
 * This code comes from Apache commons.io library.
 * 
 * Origin of code: Excalibur, Alexandria, Tomcat, Commons-Utils.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public final class IOUtils
{
    /**
     * The default buffer size ({@value}) to use for
     * {@link #copyLarge(InputStream, OutputStream)}
     * and
     * {@link #copyLarge(Reader, Writer)}
     */
    private static final int DEFAULT_BUFFER_SIZE = 1024 * 4;

    /** The end of file */
    private static final int EOF = -1;


    /**
     * Creates a new instance of FileUtils.
     */
    private IOUtils()
    {
        // Nothing to do.
    }


    /**
    * Closes an <code>InputStream</code> unconditionally.
    * <p>
    * Equivalent to {@link InputStream#close()}, except any exceptions will be ignored.
    * This is typically used in finally blocks.
    * <p>
    * Example code:
    * <pre>
    *   byte[] data = new byte[1024];
    *   InputStream in = null;
    *   try {
    *       in = new FileInputStream("foo.txt");
    *       in.read(data);
    *       in.close(); //close errors are handled
    *   } catch (Exception e) {
    *       // error handling
    *   } finally {
    *       IOUtils.closeQuietly(in);
    *   }
    * </pre>
    *
    * @param input  the InputStream to close, may be null or already closed
    */
    public static void closeQuietly( InputStream input )
    {
        closeQuietly( ( Closeable ) input );
    }


    /**
     * Closes a <code>Closeable</code> unconditionally.
     * <p>
     * Equivalent to {@link Closeable#close()}, except any exceptions will be ignored. This is typically used in
     * finally blocks.
     * <p>
     * Example code:
     * 
     * <pre>
     * Closeable closeable = null;
     * try {
     *     closeable = new FileReader(&quot;foo.txt&quot;);
     *     // process closeable
     *     closeable.close();
     * } catch (Exception e) {
     *     // error handling
     * } finally {
     *     IOUtils.closeQuietly(closeable);
     * }
     * </pre>
     * 
     * Closing all streams:
     * 
     * <pre>
     * try {
     *     return IOUtils.copy(inputStream, outputStream);
     * } finally {
     *     IOUtils.closeQuietly(inputStream);
     *     IOUtils.closeQuietly(outputStream);
     * }
     * </pre>
     * 
     * @param closeable
     *            the objects to close, may be null or already closed
     * @since 2.0
     */
    public static void closeQuietly( Closeable closeable )
    {
        try
        {
            if ( closeable != null )
            {
                closeable.close();
            }
        }
        catch ( IOException ioe )
        {
            // ignore
        }
    }


    /**
    * Gets the contents of an <code>InputStream</code> as a String
    * using the specified character encoding.
    * <p>
    * This method buffers the input internally, so there is no need to use a
    * <code>BufferedInputStream</code>.
    * </p>
    * @param input  the <code>InputStream</code> to read from
    * @param encoding  the encoding to use, null means platform default
    * @return the requested String
    * @throws NullPointerException if the input is null
    * @throws IOException if an I/O error occurs
    * @since 2.3
    */
    public static String toString( InputStream input, Charset encoding ) throws IOException
    {
        StringBuilderWriter sw = new StringBuilderWriter();
        copy( input, sw, encoding );

        return sw.toString();
    }


    /**
     * Returns the given Charset or the default Charset if the given Charset is null.
     * 
     * @param charset A charset or null.
     * @return the given Charset or the default Charset if the given Charset is null
     */
    public static Charset toCharset( Charset charset )
    {
        return charset == null ? Charset.defaultCharset() : charset;
    }


    /**
     * Copies bytes from an <code>InputStream</code> to chars on a
     * <code>Writer</code> using the specified character encoding.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * <code>BufferedInputStream</code>.
     * <p>
     * This method uses {@link InputStreamReader}.
     *
     * @param input  the <code>InputStream</code> to read from
     * @param output  the <code>Writer</code> to write to
     * @param inputEncoding  the encoding to use for the input stream, null means platform default
     * @throws NullPointerException if the input or output is null
     * @throws IOException if an I/O error occurs
     * @since 2.3
     */
    public static void copy( InputStream input, Writer output, Charset inputEncoding ) throws IOException
    {
        InputStreamReader in = new InputStreamReader( input, toCharset( inputEncoding ) );
        copy( in, output );
    }


    /**
     * Copies chars from a <code>Reader</code> to a <code>Writer</code>.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * <code>BufferedReader</code>.
     * <p>
     * Large streams (over 2GB) will return a chars copied value of
     * <code>-1</code> after the copy has completed since the correct
     * number of chars cannot be returned as an int. For large streams
     * use the <code>copyLarge(Reader, Writer)</code> method.
     *
     * @param input  the <code>Reader</code> to read from
     * @param output  the <code>Writer</code> to write to
     * @return the number of characters copied, or -1 if &gt; Integer.MAX_VALUE
     * @throws NullPointerException if the input or output is null
     * @throws IOException if an I/O error occurs
     * @since 1.1
     */
    public static int copy( Reader input, Writer output ) throws IOException
    {
        long count = copyLarge( input, output );

        if ( count > Integer.MAX_VALUE )
        {
            return -1;
        }

        return ( int ) count;
    }


    /**
     * Copies chars from a large (over 2GB) <code>Reader</code> to a <code>Writer</code>.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * <code>BufferedReader</code>.
     * <p>
     * The buffer size is given by {@link #DEFAULT_BUFFER_SIZE}.
     *
     * @param input  the <code>Reader</code> to read from
     * @param output  the <code>Writer</code> to write to
     * @return the number of characters copied
     * @throws NullPointerException if the input or output is null
     * @throws IOException if an I/O error occurs
     * @since 1.3
     */
    public static long copyLarge( Reader input, Writer output ) throws IOException
    {
        return copyLarge( input, output, new char[DEFAULT_BUFFER_SIZE] );
    }


    /**
     * Copies chars from a large (over 2GB) <code>Reader</code> to a <code>Writer</code>.
     * <p>
     * This method uses the provided buffer, so there is no need to use a
     * <code>BufferedReader</code>.
     * <p>
     *
     * @param input  the <code>Reader</code> to read from
     * @param output  the <code>Writer</code> to write to
     * @param buffer the buffer to be used for the copy
     * @return the number of characters copied
     * @throws NullPointerException if the input or output is null
     * @throws IOException if an I/O error occurs
     * @since 2.2
     */
    public static long copyLarge( Reader input, Writer output, char[] buffer ) throws IOException
    {
        long count = 0;
        int n = 0;

        while ( EOF != ( n = input.read( buffer ) ) )
        {
            output.write( buffer, 0, n );
            count += n;
        }

        return count;
    }
    
    
    /**
     * Writes chars from a <code>String</code> to bytes on an
     * <code>OutputStream</code> using the specified character encoding.
     * <p>
     * This method uses {@link String#getBytes(String)}.
     *
     * @param data  the <code>String</code> to write, null ignored
     * @param output  the <code>OutputStream</code> to write to
     * @param encoding  the encoding to use, null means platform default
     * @throws NullPointerException if output is null
     * @throws IOException if an I/O error occurs
     * @since 2.3
     */
    public static void write( String data, OutputStream output, Charset encoding ) throws IOException 
    {
        if ( data != null ) 
        {
            output.write( data.getBytes( toCharset( encoding ) ) );
        }
    }
}