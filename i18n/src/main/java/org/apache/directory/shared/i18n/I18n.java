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

package org.apache.directory.shared.i18n;


import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;


/**
 * Provides i18n handling of error codes.
 * About formatting see also {@link MessageFormat}
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class I18n
{
    private final static ResourceBundle errBundle = ResourceBundle
        .getBundle( "org/apache/directory/shared/i18n/errors" );
    private final static ResourceBundle msgBundle = ResourceBundle
        .getBundle( "org/apache/directory/shared/i18n/messages" );

	// asn1
	public static final String ERR_00001 = "ERR_00001";
	public static final String ERR_00002 = "ERR_00002";
	public static final String ERR_00003 = "ERR_00003";
	public static final String ERR_00004 = "ERR_00004";
	public static final String ERR_00005 = "ERR_00005";
	public static final String ERR_00006 = "ERR_00006";
	public static final String ERR_00007 = "ERR_00007";
	public static final String ERR_00008 = "ERR_00008";
	public static final String ERR_00009 = "ERR_00009";
	public static final String ERR_00010 = "ERR_00010";
	public static final String ERR_00011 = "ERR_00011";
	public static final String ERR_00012 = "ERR_00012";
	public static final String ERR_00013 = "ERR_00013";
	public static final String ERR_00014 = "ERR_00014";
	public static final String ERR_00015 = "ERR_00015";
	public static final String ERR_00016 = "ERR_00016";
	public static final String ERR_00017 = "ERR_00017";
	public static final String ERR_00018 = "ERR_00018";
	public static final String ERR_00019 = "ERR_00019";
	public static final String ERR_00020 = "ERR_00020";
	public static final String ERR_00021 = "ERR_00021";
	public static final String ERR_00022 = "ERR_00022";
	public static final String ERR_00023 = "ERR_00023";
	public static final String ERR_00024 = "ERR_00024";
	public static final String ERR_00025 = "ERR_00025";
	public static final String ERR_00026 = "ERR_00026";
	public static final String ERR_00027 = "ERR_00027";
	public static final String ERR_00028 = "ERR_00028";
	public static final String ERR_00029 = "ERR_00029";
	public static final String ERR_00030 = "ERR_00030";
	public static final String ERR_00031 = "ERR_00031";
	public static final String ERR_00032 = "ERR_00032";
	public static final String ERR_00033 = "ERR_00033";
	public static final String ERR_00034 = "ERR_00034";
	public static final String ERR_00035 = "ERR_00035";
	public static final String ERR_00036 = "ERR_00036";
	public static final String ERR_00037 = "ERR_00037";
	public static final String ERR_00038 = "ERR_00038";
	public static final String ERR_00039 = "ERR_00039";
	public static final String ERR_00040 = "ERR_00040";
	public static final String ERR_00041 = "ERR_00041";
	
	// asn1-codec
	public static final String ERR_01001 = "ERR_01001";

	// cursor
	public static final String ERR_02001 = "ERR_02001";
	public static final String ERR_02002 = "ERR_02002";
	public static final String ERR_02003 = "ERR_02003";
	public static final String ERR_02004 = "ERR_02004";
	public static final String ERR_02005 = "ERR_02005";
	public static final String ERR_02006 = "ERR_02006";
	public static final String ERR_02007 = "ERR_02007";
	public static final String ERR_02008 = "ERR_02008";
	public static final String ERR_02009 = "ERR_02009";
	public static final String ERR_02010 = "ERR_02010";
	public static final String ERR_02011 = "ERR_02011";
	public static final String ERR_02012 = "ERR_02012";
	public static final String ERR_02013 = "ERR_02013";

	// dsml-parser
	public static final String ERR_03001 = "ERR_03001";
	public static final String ERR_03002 = "ERR_03002";
	public static final String ERR_03003 = "ERR_03003";
	public static final String ERR_03004 = "ERR_03004";
	public static final String ERR_03005 = "ERR_03005";
	public static final String ERR_03006 = "ERR_03006";
	public static final String ERR_03007 = "ERR_03007";
	public static final String ERR_03008 = "ERR_03008";
	public static final String ERR_03009 = "ERR_03009";
	public static final String ERR_03010 = "ERR_03010";
	public static final String ERR_03011 = "ERR_03011";
	public static final String ERR_03012 = "ERR_03012";
	public static final String ERR_03013 = "ERR_03013";
	public static final String ERR_03014 = "ERR_03014";
	public static final String ERR_03015 = "ERR_03015";
	public static final String ERR_03016 = "ERR_03016";
	public static final String ERR_03017 = "ERR_03017";
	public static final String ERR_03018 = "ERR_03018";
	public static final String ERR_03019 = "ERR_03019";
	public static final String ERR_03020 = "ERR_03020";
	public static final String ERR_03021 = "ERR_03021";
	public static final String ERR_03022 = "ERR_03022";
	public static final String ERR_03023 = "ERR_03023";
	public static final String ERR_03024 = "ERR_03024";
	public static final String ERR_03025 = "ERR_00025";
	public static final String ERR_03026 = "ERR_03026";
	public static final String ERR_03027 = "ERR_03027";
	public static final String ERR_03028 = "ERR_03028";
	public static final String ERR_03029 = "ERR_03029";
	public static final String ERR_03030 = "ERR_03030";
	public static final String ERR_03031 = "ERR_03031";
	public static final String ERR_03032 = "ERR_03032";
	public static final String ERR_03033 = "ERR_03033";
	public static final String ERR_03034 = "ERR_03034";
	public static final String ERR_03035 = "ERR_03035";
	public static final String ERR_03036 = "ERR_03036";
	public static final String ERR_03037 = "ERR_03037";
	public static final String ERR_03038 = "ERR_03038";
	public static final String ERR_03039 = "ERR_03039";
	public static final String ERR_03040 = "ERR_03040";

	// ldap
	public static final String ERR_04001 = "ERR_04001";
	public static final String ERR_04002 = "ERR_04002";
	public static final String ERR_04003 = "ERR_04003";
	public static final String ERR_04004 = "ERR_04004";
	public static final String ERR_04005 = "ERR_04005";
	public static final String ERR_04006 = "ERR_04006";
	public static final String ERR_04007 = "ERR_04007";
	public static final String ERR_04008 = "ERR_04008";
	public static final String ERR_04009 = "ERR_04009";
	public static final String ERR_04010 = "ERR_04010";
	public static final String ERR_04011 = "ERR_04011";
	public static final String ERR_04012 = "ERR_04012";
	public static final String ERR_04013 = "ERR_04013";
	public static final String ERR_04014 = "ERR_04014";
	public static final String ERR_04015 = "ERR_04015";
	public static final String ERR_04016 = "ERR_04016";
	public static final String ERR_04017 = "ERR_04017";
	public static final String ERR_04018 = "ERR_04018";
	public static final String ERR_04019 = "ERR_04019";
	public static final String ERR_04020 = "ERR_04020";
	public static final String ERR_04021 = "ERR_04021";
	public static final String ERR_04022 = "ERR_04022";
	public static final String ERR_04023 = "ERR_04023";
	public static final String ERR_04024 = "ERR_04024";
	public static final String ERR_04025 = "ERR_00025";
	public static final String ERR_04026 = "ERR_04026";
	public static final String ERR_04027 = "ERR_04027";
	public static final String ERR_04028 = "ERR_04028";
	public static final String ERR_04029 = "ERR_04029";
	public static final String ERR_04030 = "ERR_04030";
	public static final String ERR_04031 = "ERR_04031";
	public static final String ERR_04032 = "ERR_04032";
	public static final String ERR_04033 = "ERR_04033";
	public static final String ERR_04034 = "ERR_04034";
	public static final String ERR_04035 = "ERR_04035";
	public static final String ERR_04036 = "ERR_04036";
	public static final String ERR_04037 = "ERR_04037";
	public static final String ERR_04038 = "ERR_04038";
	public static final String ERR_04039 = "ERR_04039";
	public static final String ERR_04040 = "ERR_04040";
	public static final String ERR_04041 = "ERR_04041";
	public static final String ERR_04042 = "ERR_04042";
	public static final String ERR_04043 = "ERR_04043";
	public static final String ERR_04044 = "ERR_04044";
	public static final String ERR_04045 = "ERR_04045";
	public static final String ERR_04046 = "ERR_04046";
	public static final String ERR_04047 = "ERR_04047";
	public static final String ERR_04048 = "ERR_04048";
	public static final String ERR_04049 = "ERR_04049";
	public static final String ERR_04050 = "ERR_04050";
	public static final String ERR_04051 = "ERR_04051";
	public static final String ERR_04052 = "ERR_04052";
	public static final String ERR_04053 = "ERR_04053";
	public static final String ERR_04054 = "ERR_04054";
	public static final String ERR_04055 = "ERR_04055";
	public static final String ERR_04056 = "ERR_04056";
	public static final String ERR_04057 = "ERR_04057";
	public static final String ERR_04058 = "ERR_04058";
	public static final String ERR_04059 = "ERR_04059";
	public static final String ERR_04060 = "ERR_04060";
	public static final String ERR_04061 = "ERR_04061";
	public static final String ERR_04062 = "ERR_04062";
	public static final String ERR_04063 = "ERR_04063";
	public static final String ERR_04064 = "ERR_04064";
	public static final String ERR_04065 = "ERR_04065";
	public static final String ERR_04066 = "ERR_04066";
	public static final String ERR_04067 = "ERR_04067";
	public static final String ERR_04068 = "ERR_04068";
	public static final String ERR_04069 = "ERR_04069";
	public static final String ERR_04070 = "ERR_04070";
	public static final String ERR_04071 = "ERR_04071";
	public static final String ERR_04072 = "ERR_04072";
	public static final String ERR_04073 = "ERR_04073";
	public static final String ERR_04074 = "ERR_04074";
	public static final String ERR_04075 = "ERR_04075";
	public static final String ERR_04076 = "ERR_04076";
	public static final String ERR_04077 = "ERR_04077";
	public static final String ERR_04078 = "ERR_04078";
	public static final String ERR_04079 = "ERR_04079";
	public static final String ERR_04080 = "ERR_04080";
	public static final String ERR_04081 = "ERR_04081";
	public static final String ERR_04082 = "ERR_04082";
	public static final String ERR_04083 = "ERR_04083";
	public static final String ERR_04084 = "ERR_04084";
	public static final String ERR_04085 = "ERR_04085";
	public static final String ERR_04086 = "ERR_04086";
	public static final String ERR_04087 = "ERR_04087";
	public static final String ERR_04088 = "ERR_04088";
	public static final String ERR_04089 = "ERR_04089";
	public static final String ERR_04090 = "ERR_04090";
	public static final String ERR_04091 = "ERR_04091";
	public static final String ERR_04092 = "ERR_04092";
	public static final String ERR_04093 = "ERR_04093";
	public static final String ERR_04094 = "ERR_04094";
	public static final String ERR_04095 = "ERR_04095";
	public static final String ERR_04096 = "ERR_04096";
	public static final String ERR_04097 = "ERR_04097";
	public static final String ERR_04098 = "ERR_04098";
	public static final String ERR_04099 = "ERR_04099";
	public static final String ERR_04100 = "ERR_04100";
	public static final String ERR_04101 = "ERR_04101";
	public static final String ERR_04102 = "ERR_04102";
	public static final String ERR_04103 = "ERR_04103";
	public static final String ERR_04104 = "ERR_04104";
	public static final String ERR_04105 = "ERR_04105";
	public static final String ERR_04106 = "ERR_04106";
	public static final String ERR_04107 = "ERR_04107";
	public static final String ERR_04108 = "ERR_04108";
	public static final String ERR_04109 = "ERR_04109";
	public static final String ERR_04110 = "ERR_04110";
	public static final String ERR_04111 = "ERR_04111";
	public static final String ERR_04112 = "ERR_04112";
	public static final String ERR_04113 = "ERR_04113";
	public static final String ERR_04114 = "ERR_04114";
	public static final String ERR_04115 = "ERR_04115";
	public static final String ERR_04116 = "ERR_04116";
	public static final String ERR_04117 = "ERR_04117";
	public static final String ERR_04118 = "ERR_04118";
	public static final String ERR_04119 = "ERR_04119";
	public static final String ERR_04120 = "ERR_04120";
	public static final String ERR_04121 = "ERR_04121";
	public static final String ERR_04122 = "ERR_04122";
	public static final String ERR_04123 = "ERR_04123";
	public static final String ERR_04124 = "ERR_04124";
	public static final String ERR_04125 = "ERR_00025";
	public static final String ERR_04126 = "ERR_04126";
	public static final String ERR_04127 = "ERR_04127";
	public static final String ERR_04128 = "ERR_04128";
	public static final String ERR_04129 = "ERR_04129";
	public static final String ERR_04130 = "ERR_04130";
	public static final String ERR_04131 = "ERR_04131";
	public static final String ERR_04132 = "ERR_04132";
	public static final String ERR_04133 = "ERR_04133";
	public static final String ERR_04134 = "ERR_04134";
	public static final String ERR_04135 = "ERR_04135";
	public static final String ERR_04136 = "ERR_04136";
	public static final String ERR_04137 = "ERR_04137";
	public static final String ERR_04138 = "ERR_04138";
	public static final String ERR_04139 = "ERR_04139";
	public static final String ERR_04140 = "ERR_04140";
	public static final String ERR_04141 = "ERR_04141";
	public static final String ERR_04142 = "ERR_04142";
	public static final String ERR_04143 = "ERR_04143";
	public static final String ERR_04144 = "ERR_04144";
	public static final String ERR_04145 = "ERR_04145";
	public static final String ERR_04146 = "ERR_04146";
	public static final String ERR_04147 = "ERR_04147";
	public static final String ERR_04148 = "ERR_04148";
	public static final String ERR_04149 = "ERR_04149";
	public static final String ERR_04150 = "ERR_04150";
	public static final String ERR_04151 = "ERR_04151";
	public static final String ERR_04152 = "ERR_04152";
	public static final String ERR_04153 = "ERR_04153";
	public static final String ERR_04154 = "ERR_04154";
	public static final String ERR_04155 = "ERR_04155";
	public static final String ERR_04156 = "ERR_04156";
	public static final String ERR_04157 = "ERR_04157";
	public static final String ERR_04158 = "ERR_04158";
	public static final String ERR_04159 = "ERR_04159";
	public static final String ERR_04160 = "ERR_04160";
	public static final String ERR_04161 = "ERR_04161";
	public static final String ERR_04162 = "ERR_04162";
	public static final String ERR_04163 = "ERR_04163";
	public static final String ERR_04164 = "ERR_04164";
	public static final String ERR_04165 = "ERR_04165";
	public static final String ERR_04166 = "ERR_04166";
	public static final String ERR_04167 = "ERR_04167";
	public static final String ERR_04168 = "ERR_04168";
	public static final String ERR_04169 = "ERR_04169";
	public static final String ERR_04170 = "ERR_04170";
	public static final String ERR_04171 = "ERR_04171";
	public static final String ERR_04172 = "ERR_04172";
	public static final String ERR_04173 = "ERR_04173";
	public static final String ERR_04174 = "ERR_04174";
	public static final String ERR_04175 = "ERR_04175";
	public static final String ERR_04176 = "ERR_04176";
	public static final String ERR_04177 = "ERR_04177";
	public static final String ERR_04178 = "ERR_04178";
	public static final String ERR_04179 = "ERR_04179";
	public static final String ERR_04180 = "ERR_04180";
	public static final String ERR_04181 = "ERR_04181";
	public static final String ERR_04182 = "ERR_04182";
	public static final String ERR_04183 = "ERR_04183";
	public static final String ERR_04184 = "ERR_04184";
	public static final String ERR_04185 = "ERR_04185";
	public static final String ERR_04186 = "ERR_04186";
	public static final String ERR_04187 = "ERR_04187";
	public static final String ERR_04188 = "ERR_04188";
	public static final String ERR_04189 = "ERR_04189";
	public static final String ERR_04190 = "ERR_04190";
	public static final String ERR_04191 = "ERR_04191";
	public static final String ERR_04192 = "ERR_04192";
	public static final String ERR_04193 = "ERR_04193";
	public static final String ERR_04194 = "ERR_04194";
	public static final String ERR_04195 = "ERR_04195";
	public static final String ERR_04196 = "ERR_04196";
	public static final String ERR_04197 = "ERR_04197";
	public static final String ERR_04198 = "ERR_04198";
	public static final String ERR_04199 = "ERR_04199";
	public static final String ERR_04200 = "ERR_04200";
	public static final String ERR_04201 = "ERR_04201";
	public static final String ERR_04202 = "ERR_04202";
	public static final String ERR_04203 = "ERR_04203";
	public static final String ERR_04204 = "ERR_04204";
	public static final String ERR_04205 = "ERR_04205";
	public static final String ERR_04206 = "ERR_04206";
	public static final String ERR_04207 = "ERR_04207";
	public static final String ERR_04208 = "ERR_04208";
	public static final String ERR_04209 = "ERR_04209";
	public static final String ERR_04210 = "ERR_04210";
	public static final String ERR_04211 = "ERR_04211";
	public static final String ERR_04212 = "ERR_04212";
	public static final String ERR_04213 = "ERR_04213";
	public static final String ERR_04214 = "ERR_04214";
	public static final String ERR_04215 = "ERR_04215";
	public static final String ERR_04216 = "ERR_04216";
	public static final String ERR_04217 = "ERR_04217";
	public static final String ERR_04218 = "ERR_04218";
	public static final String ERR_04219 = "ERR_04219";
	public static final String ERR_04220 = "ERR_04220";
	public static final String ERR_04221 = "ERR_04221";
	public static final String ERR_04222 = "ERR_04222";
	public static final String ERR_04223 = "ERR_04223";
	public static final String ERR_04224 = "ERR_04224";
	public static final String ERR_04225 = "ERR_00025";
	public static final String ERR_04226 = "ERR_04226";
	public static final String ERR_04227 = "ERR_04227";
	public static final String ERR_04228 = "ERR_04228";
	public static final String ERR_04229 = "ERR_04229";
	public static final String ERR_04230 = "ERR_04230";
	public static final String ERR_04231 = "ERR_04231";
	public static final String ERR_04232 = "ERR_04232";
	public static final String ERR_04233 = "ERR_04233";
	public static final String ERR_04234 = "ERR_04234";
	public static final String ERR_04235 = "ERR_04235";
	public static final String ERR_04236 = "ERR_04236";
	public static final String ERR_04237 = "ERR_04237";
	public static final String ERR_04238 = "ERR_04238";
	public static final String ERR_04239 = "ERR_04239";
	public static final String ERR_04240 = "ERR_04240";
	public static final String ERR_04241 = "ERR_04241";
	public static final String ERR_04242 = "ERR_04242";
	public static final String ERR_04243 = "ERR_04243";
	public static final String ERR_04244 = "ERR_04244";
	public static final String ERR_04245 = "ERR_04245";
	public static final String ERR_04246 = "ERR_04246";
	public static final String ERR_04247 = "ERR_04247";
	public static final String ERR_04248 = "ERR_04248";
	public static final String ERR_04249 = "ERR_04249";
	public static final String ERR_04250 = "ERR_04250";
	public static final String ERR_04251 = "ERR_04251";
	public static final String ERR_04252 = "ERR_04252";
	public static final String ERR_04253 = "ERR_04253";
	public static final String ERR_04254 = "ERR_04254";
	public static final String ERR_04255 = "ERR_04255";
	public static final String ERR_04256 = "ERR_04256";
	public static final String ERR_04257 = "ERR_04257";
	public static final String ERR_04258 = "ERR_04258";
	public static final String ERR_04259 = "ERR_04259";
	public static final String ERR_04260 = "ERR_04260";
	public static final String ERR_04261 = "ERR_04261";
	public static final String ERR_04262 = "ERR_04262";
	public static final String ERR_04263 = "ERR_04263";
	public static final String ERR_04264 = "ERR_04264";
	public static final String ERR_04265 = "ERR_04265";
	public static final String ERR_04266 = "ERR_04266";
	public static final String ERR_04267 = "ERR_04267";
	public static final String ERR_04268 = "ERR_04268";
	public static final String ERR_04269 = "ERR_04269";
	public static final String ERR_04270 = "ERR_04270";
	public static final String ERR_04271 = "ERR_04271";
	public static final String ERR_04272 = "ERR_04272";
	public static final String ERR_04273 = "ERR_04273";
	public static final String ERR_04274 = "ERR_04274";
	public static final String ERR_04275 = "ERR_04275";
	public static final String ERR_04276 = "ERR_04276";
	public static final String ERR_04277 = "ERR_04277";
	public static final String ERR_04278 = "ERR_04278";
	public static final String ERR_04279 = "ERR_04279";
	public static final String ERR_04280 = "ERR_04280";
	public static final String ERR_04281 = "ERR_04281";
	public static final String ERR_04282 = "ERR_04282";
	public static final String ERR_04283 = "ERR_04283";
	public static final String ERR_04284 = "ERR_04284";
	public static final String ERR_04285 = "ERR_04285";
	public static final String ERR_04286 = "ERR_04286";
	public static final String ERR_04287 = "ERR_04287";
	public static final String ERR_04288 = "ERR_04288";
	public static final String ERR_04289 = "ERR_04289";
	public static final String ERR_04290 = "ERR_04290";
	public static final String ERR_04291 = "ERR_04291";
	public static final String ERR_04292 = "ERR_04292";
	public static final String ERR_04293 = "ERR_04293";
	public static final String ERR_04294 = "ERR_04294";
	public static final String ERR_04295 = "ERR_04295";
	public static final String ERR_04296 = "ERR_04296";
	public static final String ERR_04297 = "ERR_04297";
	public static final String ERR_04298 = "ERR_04298";
	public static final String ERR_04299 = "ERR_04299";

	// ldap-constants
	public static final String ERR_05001 = "ERR_05001";
	public static final String ERR_05002 = "ERR_05002";
	public static final String ERR_05003 = "ERR_05003";
	public static final String ERR_05004 = "ERR_05004";
	public static final String ERR_05005 = "ERR_05005";
	public static final String ERR_05006 = "ERR_05006";
	public static final String ERR_05007 = "ERR_05007";
	public static final String ERR_05008 = "ERR_05008";
	public static final String ERR_05009 = "ERR_05009";
	public static final String ERR_05010 = "ERR_05010";
	public static final String ERR_05011 = "ERR_05011";
	public static final String ERR_05012 = "ERR_05012";
	public static final String ERR_05013 = "ERR_05013";
	public static final String ERR_05014 = "ERR_05014";
	public static final String ERR_05015 = "ERR_05015";
	public static final String ERR_05016 = "ERR_05016";
	public static final String ERR_05017 = "ERR_05017";
	public static final String ERR_05018 = "ERR_05018";
	public static final String ERR_05019 = "ERR_05019";
	public static final String ERR_05020 = "ERR_05020";
	public static final String ERR_05021 = "ERR_05021";
	public static final String ERR_05022 = "ERR_05022";
	public static final String ERR_05023 = "ERR_05023";
	public static final String ERR_05024 = "ERR_05024";
	public static final String ERR_05025 = "ERR_00025";
	public static final String ERR_05026 = "ERR_05026";
	public static final String ERR_05027 = "ERR_05027";
	public static final String ERR_05028 = "ERR_05028";
	public static final String ERR_05029 = "ERR_05029";
	public static final String ERR_05030 = "ERR_05030";
	public static final String ERR_05031 = "ERR_05031";
	public static final String ERR_05032 = "ERR_05032";
	public static final String ERR_05033 = "ERR_05033";
	public static final String ERR_05034 = "ERR_05034";
	public static final String ERR_05035 = "ERR_05035";
	public static final String ERR_05036 = "ERR_05036";
	public static final String ERR_05037 = "ERR_05037";
	public static final String ERR_05038 = "ERR_05038";
	public static final String ERR_05039 = "ERR_05039";
	public static final String ERR_05040 = "ERR_05040";

	
    /**
     * 
     * Translate an error code with argument(s)
     *
     * @param err The error code
     * @param args The argument(s)
     * @return
     */
    public static String err( String err, Object... args )
    {
        try
        {
            return err + " " + MessageFormat.format( errBundle.getString( err ), args );
        }
        catch ( Exception e )
        {
            StringBuffer sb = new StringBuffer();
            boolean comma = false;
            for ( Object obj : args )
            {
                if ( comma )
                {
                    sb.append( "," );
                }
                else
                {
                    comma = true;
                }
                sb.append( obj );
            }
            return err + " (" + sb.toString() + ")";
        }
    }


    /**
     * 
     * Translate a message with argument(s)
     *
     * @param msg The message
     * @param args The argument(s)
     * @return
     */
    public static String msg( String msg, Object... args )
    {
        try
        {
            return MessageFormat.format( msgBundle.getString( msg ), args );
        }
        catch ( MissingResourceException mre )
        {
            try
            {
                return MessageFormat.format( msg, args );
            }
            catch ( Exception e )
            {
                StringBuffer sb = new StringBuffer();
                boolean comma = false;
                for ( Object obj : args )
                {
                    if ( comma )
                    {
                        sb.append( "," );
                    }
                    else
                    {
                        comma = true;
                    }
                    sb.append( obj );
                }
                return msg + " (" + sb.toString() + ")";
            }
        }
    }

}
