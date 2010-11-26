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

package org.apache.directory.shared.dsmlv2.reponse;


import org.apache.directory.shared.ldap.codec.MessageTypeEnum;
import org.apache.directory.shared.ldap.message.SearchResultDone;
import org.apache.directory.shared.ldap.message.SearchResultDoneImpl;
import org.dom4j.Element;


/**
 * DSML Decorator for SearchResultDone
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class SearchResultDoneDsml extends AbstractResponseDsml
{
    /**
     * Creates a new instance of SearchResultDoneDsml.
     */
    public SearchResultDoneDsml()
    {
        super( new SearchResultDoneImpl() );
    }


    /**
     * Creates a new instance of SearchResultDoneDsml.
     *
     * @param ldapMessage
     *      the message to decorate
     */
    public SearchResultDoneDsml( SearchResultDone ldapMessage )
    {
        super( ldapMessage );
    }


    /**
     * {@inheritDoc}
     */
    public MessageTypeEnum getType()
    {
        return instance.getType();
    }


    /**
     * {@inheritDoc}
     */
    public Element toDsml( Element root )
    {
        Element element = root.addElement( "searchResultDone" );

        LdapResultDsml ldapResultDsml = new LdapResultDsml( ( ( SearchResultDone ) instance ).getLdapResult(), instance );
        if ( ldapResultDsml != null )
        {
            ldapResultDsml.toDsml( element );
        }

        return element;
    }
}