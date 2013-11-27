/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *  
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License. 
 *  
 */
package org.apache.directory.api.ldap.model.schema;


import java.util.List;
import java.util.Map;


/**
 * Utility class used to generate schema object specifications. Some of the
 * latest work coming out of the LDAPBIS working body adds optional extensions
 * to these syntaxes. Descriptions can be generated for
 * the following objects:
 * <ul>
 * <li><a href="./AttributeType.html">AttributeType</a></li>
 * <li><a href="./DitContentRule.html">DitContentRule</a></li>
 * <li><a href="./DitContentRule.html">DitStructureRule</a></li>
 * <li><a href="./LdapComparator.html">Syntax</a></li>
 * <li><a href="./MatchingRule.html">MatchingRule</a></li>
 * <li><a href="./MatchingRuleUse.html">MatchingRuleUse</a></li>
 * <li><a href="./NameForm.html">NameForm</a></li>
 * <li><a href="./Normalizer.html">Syntax</a></li>
 * <li><a href="./ObjectClass.html">ObjectClass</a></li>
 * <li><a href="./LdapSyntax.html">Syntax</a></li>
 * <li><a href="./SyntaxChecker.html">Syntax</a></li>
 * </ul>
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public final class DescriptionUtils
{
    /**
     * Private constructor.
     */
    private DescriptionUtils()
    {
    }


    /**
     * Generates the ComparatorDescription for a LdapComparator. Only the right 
     * hand side of the description starting at the opening parenthesis is 
     * generated: that is 'ComparatorDescription = ' is not generated.
     * 
     * <pre>
     * ComparatorDescription = &quot;(&quot;
     *     numericoid                          
     *     [&quot;DESC&quot; qdstring ]
     *     &quot;FQCN&quot; whsp fqcn
     *     [&quot;BYTECODE&quot; whsp base64  ]
     *     extensions 
     *     &quot;)&quot;
     * </pre>
     * 
     * @param comparator
     *            the Comparator to generate the description for
     * @return the ComparatorDescription string
     */
    public static String getDescription( LdapComparator<?> comparator )
    {
        return getLoadableDescription( comparator );
    }


    /**
     * Generates the DITContentRuleDescription for a DitContentRule as defined
     * by the syntax: 1.3.6.1.4.1.1466.115.121.1.16. Only the right hand side of
     * the description starting at the opening parenthesis is generated: that
     * is 'DITContentRuleDescription = ' is not generated.
     * 
     * <pre>
     *   DITContentRuleDescription = &quot;(&quot;
     *       numericoid         ; Structural ObjectClass identifier
     *       [ &quot;NAME&quot; qdescrs ]
     *       [ &quot;DESC&quot; qdstring ]
     *       [ &quot;OBSOLETE&quot; ]
     *       [ &quot;AUX&quot; oids ]     ; Auxiliary ObjectClasses
     *       [ &quot;MUST&quot; oids ]    ; AttributeType identifiers
     *       [ &quot;MAY&quot; oids ]     ; AttributeType identifiers
     *       [ &quot;NOT&quot; oids ]     ; AttributeType identifiers
     *      &quot;)&quot;
     * </pre>
     * 
     * @param dITContentRule
     *            the DIT content rule specification
     * @return the specification according to the DITContentRuleDescription
     *         syntax
     */
    public static String getDescription( DitContentRule dITContentRule )
    {
        StringBuilder buf = new StringBuilder( "( " );
        buf.append( dITContentRule.getOid() );
        buf.append( '\n' );

        if ( dITContentRule.getNames() != null )
        {
            buf.append( " NAME " );
            getQDescrs( buf, dITContentRule.getNames() );
            buf.append( '\n' );
        }

        if ( dITContentRule.getDescription() != null )
        {
            buf.append( " DESC " );
            buf.append( dITContentRule.getDescription() );
            buf.append( '\n' );
        }

        if ( dITContentRule.isObsolete() )
        {
            buf.append( " OBSOLETE\n" );
        }

        // print out all the auxiliary object class oids
        List<ObjectClass> aux = dITContentRule.getAuxObjectClasses();

        if ( ( aux != null ) && ( aux.size() > 0 ) )
        {
            buf.append( " AUX " );
            getQDStrings( buf, aux );
        }

        List<AttributeType> must = dITContentRule.getMustAttributeTypes();

        if ( ( must != null ) && ( must.size() > 0 ) )
        {
            buf.append( " MUST " );
            getQDStrings( buf, must );
        }

        List<AttributeType> may = dITContentRule.getMayAttributeTypes();

        if ( ( may != null ) && ( may.size() > 0 ) )
        {
            buf.append( " MAY " );
            getQDStrings( buf, may );
        }

        List<AttributeType> not = dITContentRule.getNotAttributeTypes();

        if ( ( not != null ) && ( not.size() > 0 ) )
        {
            buf.append( " NOT " );
            getQDStrings( buf, not );
        }

        if ( dITContentRule.getExtensions() != null )
        {
            getExtensions( buf, dITContentRule.getExtensions() );
        }

        buf.append( " )\n" );
        return buf.toString();
    }


    /**
     * Generates the DITStructureRuleDescription for a DitStructureRule as
     * defined by the syntax: 1.3.6.1.4.1.1466.115.121.1.17. Only the right hand
     * side of the description starting at the opening parenthesis is
     * generated: that is 'DITStructureRuleDescription = ' is not generated.
     * 
     * <pre>
     *   DITStructureRuleDescription = &quot;(&quot; whsp
     *       ruleid                     ; rule identifier
     *       [ SP "NAME" SP qdescrs ]   ; short names (descriptors)
     *       [ SP "DESC" SP qdstring ]  ; description
     *       [ SP "OBSOLETE" ]          ; not active
     *       SP "FORM" SP oid           ; NameForm
     *       [ SP "SUP" ruleids ]       ; superior rules
     *       extensions WSP             ; extensions
     *       &quot;)&quot;
     * </pre>
     * 
     * @param ditStructureRule
     *            the DitStructureRule to generate the description for
     * @return the description in the DITStructureRuleDescription syntax
     */
    public static String getDescription( DitStructureRule ditStructureRule )
    {
        StringBuilder buf = new StringBuilder( "( " );
        buf.append( ditStructureRule.getOid() );
        buf.append( '\n' );

        if ( ditStructureRule.getNames() != null )
        {
            buf.append( " NAME " );
            getQDescrs( buf, ditStructureRule.getNames() );
        }

        if ( ditStructureRule.getDescription() != null )
        {
            buf.append( " DESC " );
            buf.append( ditStructureRule.getDescription() );
            buf.append( '\n' );
        }

        if ( ditStructureRule.isObsolete() )
        {
            buf.append( " OBSOLETE\n" );
        }

        buf.append( " FORM " );
        buf.append( ditStructureRule.getForm() );
        buf.append( '\n' );

        // TODO : Shouldn't we get the ruleId OID ? 
        List<Integer> sups = ditStructureRule.getSuperRules();

        if ( ( sups != null ) && ( sups.size() > 0 ) )
        {
            buf.append( " SUP\n" );

            if ( sups.size() == 1 )
            {
                buf.append( sups.get( 0 ) );
            }
            else
            {
                boolean isFirst = true;
                buf.append( "( " );

                for ( int sup : sups )
                {
                    if ( isFirst )
                    {
                        isFirst = false;
                    }
                    else
                    {
                        buf.append( " " );
                    }

                    buf.append( sup );
                }

                buf.append( " )" );
            }

            buf.append( '\n' );
        }

        buf.append( " )\n" );

        return buf.toString();
    }


    /**
     * Generates the NameFormDescription for a NameForm as defined by the
     * syntax: 1.3.6.1.4.1.1466.115.121.1.35. Only the right hand side of the
     * description starting at the opening parenthesis is generated: that is
     * 'NameFormDescription = ' is not generated.
     * 
     * <pre>
     *  NameFormDescription = &quot;(&quot; whsp
     *      numericoid whsp               ; NameForm identifier
     *      [ &quot;NAME&quot; qdescrs ]
     *      [ &quot;DESC&quot; qdstring ]
     *      [ &quot;OBSOLETE&quot; whsp ]
     *      &quot;OC&quot; woid                     ; Structural ObjectClass
     *      &quot;MUST&quot; oids                   ; AttributeTypes
     *      [ &quot;MAY&quot; oids ]                ; AttributeTypes
     *  whsp &quot;)&quot;
     * </pre>
     * 
     * @param nameForm
     *            the NameForm to generate the description for
     * @return the NameFormDescription string
     */
    public static String getDescription( NameForm nameForm )
    {
        StringBuilder buf = new StringBuilder( "( " );
        buf.append( nameForm.getOid() );
        buf.append( '\n' );

        if ( nameForm.getNames() != null )
        {
            buf.append( " NAME " );
            getQDescrs( buf, nameForm.getNames() );
        }

        if ( nameForm.getDescription() != null )
        {
            buf.append( " DESC " );
            buf.append( nameForm.getDescription() );
            buf.append( '\n' );
        }

        if ( nameForm.isObsolete() )
        {
            buf.append( " OBSOLETE\n" );
        }

        buf.append( " OC " );
        buf.append( nameForm.getStructuralObjectClassOid() );
        buf.append( '\n' );

        buf.append( " MUST\n" );
        List<AttributeType> must = nameForm.getMustAttributeTypes();

        getQDStrings( buf, must );

        List<AttributeType> may = nameForm.getMayAttributeTypes();

        if ( ( may != null ) && ( may.size() > 0 ) )
        {
            buf.append( " MAY\n" );
            getQDStrings( buf, may );
        }

        if ( nameForm.getExtensions() != null )
        {
            getExtensions( buf, nameForm.getExtensions() );
        }

        buf.append( " )\n" );
        return buf.toString();
    }


    /**
     * Generates the NormalizerDescription for a Normalizer. Only the right 
     * hand side of the description starting at the opening parenthesis is 
     * generated: that is 'NormalizerDescription = ' is not generated.
     * 
     * <pre>
     * NormalizerDescription = &quot;(&quot;
     *     numericoid                          
     *     [&quot;DESC&quot; qdstring ]
     *     &quot;FQCN&quot; whsp fqcn
     *     [&quot;BYTECODE&quot; whsp base64  ]
     *     extensions 
     *     &quot;)&quot;
     * </pre>
     * 
     * @param normalizer
     *            the Normalizer to generate the description for
     * @return the NormalizerDescription string
     */
    public static String getDescription( Normalizer normalizer )
    {
        return getLoadableDescription( normalizer );
    }


    /**
     * Generates the SyntaxCheckerDescription for a SyntaxChecker. Only the right 
     * hand side of the description starting at the opening parenthesis is 
     * generated: that is 'SyntaxCheckerDescription = ' is not generated.
     * 
     * <pre>
     * SyntaxCheckerDescription = &quot;(&quot;
     *     numericoid                          
     *     [&quot;DESC&quot; qdstring ]
     *     &quot;FQCN&quot; whsp fqcn
     *     [&quot;BYTECODE&quot; whsp base64  ]
     *     extensions 
     *     &quot;)&quot;
     * </pre>
     * 
     * @param syntaxChecker
     *            the SyntaxChecker to generate the description for
     * @return the SyntaxCheckerDescription string
     */
    public static String getDescription( SyntaxChecker syntaxChecker )
    {
        return getLoadableDescription( syntaxChecker );
    }


    private static void getExtensions( StringBuilder sb, Map<String, List<String>> extensions )
    {
        for ( Map.Entry<String, List<String>> extension : extensions.entrySet() )
        {
            sb.append( " " + extension.getKey() ).append( " " );

            List<String> values = extension.getValue();

            if ( ( values != null ) && ( values.size() != 0 ) )
            {
                if ( values.size() == 1 )
                {
                    sb.append( values.get( 0 ) );
                }
                else
                {
                    boolean isFirst = true;
                    sb.append( "( " );

                    for ( String value : values )
                    {
                        if ( isFirst )
                        {
                            isFirst = false;
                        }
                        else
                        {
                            sb.append( " " );
                        }

                        sb.append( value );
                    }

                    sb.append( " )" );
                }
            }

            sb.append( '\n' );
        }
    }


    private static void getQDStrings( StringBuilder sb, List<? extends SchemaObject> schemaObjects )
    {
        if ( ( schemaObjects != null ) && ( schemaObjects.size() != 0 ) )
        {
            if ( schemaObjects.size() == 1 )
            {
                sb.append( '\'' ).append( schemaObjects.get( 0 ).getName() ).append( '\'' );
            }
            else
            {
                boolean isFirst = true;
                sb.append( "( " );

                for ( SchemaObject schemaObject : schemaObjects )
                {
                    if ( isFirst )
                    {
                        isFirst = false;
                    }
                    else
                    {
                        sb.append( " $ " );
                    }

                    sb.append( '\'' ).append( schemaObject.getName() ).append( '\'' );
                }

                sb.append( " )" );
            }
        }

        sb.append( '\n' );
    }


    private static void getQDescrs( StringBuilder sb, List<String> names )
    {
        if ( ( names != null ) && ( names.size() != 0 ) )
        {
            if ( names.size() == 1 )
            {
                sb.append( '\'' ).append( names.get( 0 ) ).append( '\'' );
            }
            else
            {
                boolean isFirst = true;
                sb.append( "( " );

                for ( String name : names )
                {
                    if ( isFirst )
                    {
                        isFirst = false;
                    }
                    else
                    {
                        sb.append( " " );
                    }

                    sb.append( '\'' ).append( name ).append( '\'' );
                }

                sb.append( " )" );
            }
        }

        sb.append( '\n' );
    }


    /**
     * Generate the description for Comparators, Normalizers and SyntaxCheckers.
     */
    private static String getLoadableDescription( LoadableSchemaObject schemaObject )
    {
        StringBuilder buf = new StringBuilder( "( " );
        buf.append( schemaObject.getOid() );
        buf.append( '\n' );

        if ( schemaObject.getDescription() != null )
        {
            buf.append( " DESC " );
            buf.append( schemaObject.getDescription() );
            buf.append( '\n' );
        }

        if ( schemaObject.getFqcn() != null )
        {
            buf.append( " FQCN " );
            buf.append( schemaObject.getFqcn() );
            buf.append( '\n' );
        }

        if ( schemaObject.getBytecode() != null )
        {
            buf.append( " BYTECODE " );

            // We will dump only the 16 first bytes
            if ( schemaObject.getBytecode().length() > 16 )
            {
                buf.append( schemaObject.getBytecode().substring( 0, 16 ) );
            }
            else
            {
                buf.append( schemaObject.getBytecode() );
            }

            buf.append( '\n' );
        }

        if ( schemaObject.getExtensions() != null )
        {
            getExtensions( buf, schemaObject.getExtensions() );
        }

        buf.append( " ) " );

        return buf.toString();
    }
}
