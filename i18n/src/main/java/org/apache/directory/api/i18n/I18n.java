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

package org.apache.directory.api.i18n;


import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;


/**
 * Provides i18n handling of error codes.
 * About formatting see also {@link MessageFormat}
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public enum I18n
{
    // asn1
    ERR_00001_BAD_TRANSITION_FROM_STATE("ERR_00001_BAD_TRANSITION_FROM_STATE"),
    ERR_00002_BAD_TRANSITION("ERR_00002_BAD_TRANSITION"),
    ERR_00003_CANNOT_PUT_PDU_IN_NULL_BUFFER("ERR_00003_CANNOT_PUT_PDU_IN_NULL_BUFFER"),
    ERR_00004_PDU_BUFFER_SIZE_TOO_SMALL("ERR_00004_PDU_BUFFER_SIZE_TOO_SMALL"),
    ERR_00005_LENGTH_OVERFLOW("ERR_00005_LENGTH_OVERFLOW"),
    ERR_00006_LENGTH_EXTENSION_RESERVED("ERR_00006_LENGTH_EXTENSION_RESERVED"),
    ERR_00007_TLV_NULL("ERR_00007_TLV_NULL"),
    ERR_00008_VALUE_LENGTH_ABOVE_EXPECTED_LENGTH("ERR_00008_VALUE_LENGTH_ABOVE_EXPECTED_LENGTH"),
    ERR_00009_MORE_TLV_EXPECTED("ERR_00009_MORE_TLV_EXPECTED"),
    ERR_00010_TRUNCATED_PDU("ERR_00010_TRUNCATED_PDU"),
    ERR_00011_LENGTH_TOO_LONG_FOR_DEFINITE_FORM("ERR_00011_LENGTH_TOO_LONG_FOR_DEFINITE_FORM"),
    ERR_00013_ODD_NUM_OF_CHARS("ERR_00013_ODD_NUM_OF_CHARS"),
    ERR_00014_ILLEGAL_HEX_CHAR("ERR_00014_ILLEGAL_HEX_CHAR"),
    ERR_00016_END_OF_STREAM("ERR_00016_END_OF_STREAM"),
    ERR_00017_EOF_FOUND_LENGTH_EXPECTED("ERR_00017_EOF_FOUND_LENGTH_EXPECTED"),
    ERR_00018_DER_LENGTH_ABOVE_4_BYTES("ERR_00018_DER_LENGTH_ABOVE_4_BYTES"),
    ERR_00019_EOF_FOUND_IN_LENGTH("ERR_00019_EOF_FOUND_IN_LENGTH"),
    ERR_00020_CORRUPTED_STREAM("ERR_00020_CORRUPTED_STREAM"),
    ERR_00021_EOF_FOUND_IN_OBJECT("ERR_00021_EOF_FOUND_IN_OBJECT"),
    ERR_00022_READ_PAST_END_OF_FILE("ERR_00022_READ_PAST_END_OF_FILE"),
    ERR_00023_UNKNOWN_BER_OBJECT("ERR_00023_UNKNOWN_BER_OBJECT"),
    ERR_00024_OBJECT_NOT_DER_ENCODABLE("ERR_00024_OBJECT_NOT_DER_ENCODABLE"),
    ERR_00025_DER_OCTET_STRING_EXPECTED("ERR_DER_OCTET_STRING_EXPECTED_00025"),
    ERR_00026_CANNOT_CONVERT_OCTETS("ERR_00026_CANNOT_CONVERT_OCTETS"),
    ERR_00027_NOT_IMPLEMENTED("ERR_00027_NOT_IMPLEMENTED"),
    ERR_00028_INTERNAL_ERROR_ENCODING_BITSTRING("ERR_00028_INTERNAL_ERROR_ENCODING_BITSTRING"),
    ERR_00029_NULL_OR_NEG_LENGTH_NOT_ALLOWED("ERR_00029_NULL_OR_NEG_LENGTH_NOT_ALLOWED"),
    ERR_00030_BIT_NUMBER_OUT_OF_BOUND("ERR_00030_BIT_NUMBER_OUT_OF_BOUND"),
    ERR_00031_CANNOT_FIND_BIT("ERR_00031_CANNOT_FIND_BIT"),
    ERR_00032_NULL_OID("ERR_00032_NULL_OID"),
    ERR_00033_INVALID_OID("ERR_00033_INVALID_OID"),
    ERR_00034_0_BYTES_LONG_BOOLEAN("ERR_00034_0_BYTES_LONG_BOOLEAN"),
    ERR_00035_N_BYTES_LONG_BOOLEAN("ERR_00035_N_BYTES_LONG_BOOLEAN"),
    ERR_00036_0_BYTES_LONG_INTEGER("ERR_00036_0_BYTES_LONG_INTEGER"),
    ERR_00037_ABOVE_4_BYTES_INTEGER("ERR_00037_ABOVE_4_BYTES_INTEGER"),
    ERR_00038_VALUE_NOT_IN_RANGE("ERR_00038_VALUE_NOT_IN_RANGE"),
    ERR_00039_0_BYTES_LONG_LONG("ERR_00039_0_BYTES_LONG_LONG"),
    ERR_00041_CURRENT_LENGTH_EXCEED_EXPECTED_LENGTH("ERR_00041_CURRENT_LENGTH_EXCEED_EXPECTED_LENGTH"),
    ERR_00042_PDU_SIZE_TOO_LONG("ERR_00042_PDU_SIZE_TOO_LONG"),
    ERR_00043_REMAINING_BYTES_FOR_DECODED_PDU("ERR_00043_REMAINING_BYTES_FOR_DECODED_PDU"),

    // cursor
    ERR_02001_MONITOR("ERR_02001_MONITOR"),
    ERR_02002_FAILURE_ON_UNDERLYING_CURSOR("ERR_02002_FAILURE_ON_UNDERLYING_CURSOR"),
    ERR_02003_REMOVAL_NOT_SUPPORTED("ERR_02003_REMOVAL_NOT_SUPPORTED"),
    ERR_02004_EMPTY_CURSOR("ERR_02004_EMPTY_CURSOR"),
    ERR_02005_START_INDEX_OUT_OF_RANGE("ERR_02005_START_INDEX_OUT_OF_RANGE"),
    ERR_02006_END_INDEX_OUT_OF_RANGE("ERR_02006_END_INDEX_OUT_OF_RANGE"),
    ERR_02007_START_INDEX_ABOVE_END_INDEX("ERR_02007_START_INDEX_ABOVE_END_INDEX"),
    ERR_02008_LIST_MAY_BE_SORTED("ERR_02008_LIST_MAY_BE_SORTED"),
    ERR_02009_CURSOR_NOT_POSITIONED("ERR_02009_CURSOR_NOT_POSITIONED"),
    ERR_02010_NO_COMPARATOR_CANT_MOVE_BEFORE("ERR_02010_NO_COMPARATOR_CANT_MOVE_BEFORE"),
    ERR_02011_NO_COMPARATOR_CANT_MOVE_AFTER("ERR_02011_NO_COMPARATOR_CANT_MOVE_AFTER"),
    ERR_02012_CANNOT_ACCESS_IF_BEFORE_FIRST("ERR_02012_CANNOT_ACCESS_IF_BEFORE_FIRST"),
    ERR_02013_CANNOT_ACCESS_IF_AFTER_LAST("ERR_02013_CANNOT_ACCESS_IF_AFTER_LAST"),
    ERR_02014_UNSUPPORTED_OPERATION("ERR_02014_UNSUPPORTED_OPERATION"),

    // dsml-parser
    ERR_03001("ERR_03001"),
    ERR_03002("ERR_03002"),
    ERR_03003("ERR_03003"),
    ERR_03004("ERR_03004"),
    ERR_03005("ERR_03005"),
    ERR_03006("ERR_03006"),
    ERR_03007("ERR_03007"),
    ERR_03008("ERR_03008"),
    ERR_03009("ERR_03009"),
    ERR_03010("ERR_03010"),
    ERR_03011("ERR_03011"),
    ERR_03012("ERR_03012"),
    ERR_03013("ERR_03013"),
    ERR_03014("ERR_03014"),
    ERR_03015("ERR_03015"),
    ERR_03016("ERR_03016"),
    ERR_03017("ERR_03017"),
    ERR_03018("ERR_03018"),
    ERR_03019("ERR_03019"),
    ERR_03020("ERR_03020"),
    ERR_03021("ERR_03021"),
    ERR_03022("ERR_03022"),
    ERR_03023("ERR_03023"),
    ERR_03024("ERR_03024"),
    ERR_03025("ERR_00025"),
    ERR_03026("ERR_03026"),
    ERR_03027("ERR_03027"),
    ERR_03028("ERR_03028"),
    ERR_03029("ERR_03029"),
    ERR_03030("ERR_03030"),
    ERR_03031("ERR_03031"),
    ERR_03032("ERR_03032"),
    ERR_03033("ERR_03033"),
    ERR_03034("ERR_03034"),
    ERR_03035("ERR_03035"),
    ERR_03036("ERR_03036"),
    ERR_03037("ERR_03037"),
    ERR_03038("ERR_03038"),
    ERR_03039("ERR_03039"),
    ERR_03040("ERR_03040"),

    // dsml-engine
    ERR_03101_MISSING_CONNECTION_TO("ERR_03101_MISSING_CONNECTION_TO"),

    // ldap
    ERR_04001_NULL_IDENTIFICATION_TAG("ERR_04001_NULL_IDENTIFICATION_TAG"),
    ERR_04002_BAD_PRECENDENCE("ERR_04002_BAD_PRECENDENCE"),
    ERR_04003_NULL_AUTHENTICATION_LEVEL("ERR_04003_NULL_AUTHENTICATION_LEVEL"),
    ERR_04004_PARSER_FAILURE_ACI_ITEM("ERR_04004_PARSER_FAILURE_ACI_ITEM"),
    ERR_04005("ERR_04005"),
    ERR_04006("ERR_04006"),
    ERR_04007("ERR_04007"),
    ERR_04008("ERR_04008"),
    ERR_04009("ERR_04009"),
    ERR_04010("ERR_04010"),
    ERR_04011("ERR_04011"),
    ERR_04012("ERR_04012"),
    ERR_04013("ERR_04013"),
    ERR_04014("ERR_04014"),
    ERR_04015("ERR_04015"),
    ERR_04016("ERR_04016"),
    ERR_04017("ERR_04017"),
    ERR_04018("ERR_04018"),
    ERR_04019("ERR_04019"),
    ERR_04020("ERR_04020"),
    ERR_04021("ERR_04021"),
    ERR_04022("ERR_04022"),
    ERR_04023("ERR_04023"),
    ERR_04024("ERR_04024"),
    ERR_04025("ERR_04025"),
    ERR_04026("ERR_04026"),
    ERR_04027("ERR_04027"),
    ERR_04028("ERR_04028"),
    ERR_04029("ERR_04029"),
    ERR_04030("ERR_04030"),
    ERR_04031("ERR_04031"),
    ERR_04032("ERR_04032"),
    ERR_04033("ERR_04033"),
    ERR_04034("ERR_04034"),
    ERR_04035("ERR_04035"),
    ERR_04036("ERR_04036"),
    ERR_04037("ERR_04037"),
    ERR_04038("ERR_04038"),
    ERR_04039("ERR_04039"),
    ERR_04040("ERR_04040"),
    ERR_04041("ERR_04041"),
    ERR_04042("ERR_04042"),
    ERR_04043("ERR_04043"),
    ERR_04044("ERR_04044"),
    ERR_04045("ERR_04045"),
    ERR_04046("ERR_04046"),
    ERR_04047("ERR_04047"),
    ERR_04048("ERR_04048"),
    ERR_04049("ERR_04049"),
    ERR_04050("ERR_04050"),
    ERR_04051("ERR_04051"),
    ERR_04052("ERR_04052"),
    ERR_04053("ERR_04053"),
    ERR_04054("ERR_04054"),
    ERR_04055("ERR_04055"),
    ERR_04056("ERR_04056"),
    ERR_04057("ERR_04057"),
    ERR_04058("ERR_04058"),
    ERR_04059("ERR_04059"),
    ERR_04060("ERR_04060"),
    ERR_04061("ERR_04061"),
    ERR_04062("ERR_04062"),
    ERR_04063("ERR_04063"),
    ERR_04064("ERR_04064"),
    ERR_04065("ERR_04065"),
    ERR_04066("ERR_04066"),
    ERR_04067("ERR_04067"),
    ERR_04068("ERR_04068"),
    ERR_04069("ERR_04069"),
    ERR_04070("ERR_04070"),
    ERR_04071("ERR_04071"),
    ERR_04072("ERR_04072"),
    ERR_04073("ERR_04073"),
    ERR_04074("ERR_04074"),
    ERR_04075("ERR_04075"),
    ERR_04076("ERR_04076"),
    ERR_04077("ERR_04077"),
    ERR_04078("ERR_04078"),
    ERR_04079("ERR_04079"),
    ERR_04080("ERR_04080"),
    ERR_04081("ERR_04081"),
    ERR_04082("ERR_04082"),
    ERR_04083("ERR_04083"),
    ERR_04084("ERR_04084"),
    ERR_04085("ERR_04085"),
    ERR_04086("ERR_04086"),
    ERR_04087("ERR_04087"),
    ERR_04088("ERR_04088"),
    ERR_04089("ERR_04089"),
    ERR_04090("ERR_04090"),
    ERR_04091("ERR_04091"),
    ERR_04092("ERR_04092"),
    ERR_04093("ERR_04093"),
    ERR_04094("ERR_04094"),
    ERR_04095("ERR_04095"),
    ERR_04096("ERR_04096"),
    ERR_04097("ERR_04097"),
    ERR_04098("ERR_04098"),
    ERR_04099("ERR_04099"),
    ERR_04100("ERR_04100"),
    ERR_04101("ERR_04101"),
    ERR_04102("ERR_04102"),
    ERR_04103("ERR_04103"),
    ERR_04104("ERR_04104"),
    ERR_04105("ERR_04105"),
    ERR_04106("ERR_04106"),
    ERR_04107("ERR_04107"),
    ERR_04108("ERR_04108"),
    ERR_04109("ERR_04109"),
    ERR_04110("ERR_04110"),
    ERR_04111("ERR_04111"),
    ERR_04112("ERR_04112"),
    ERR_04113("ERR_04113"),
    ERR_04114("ERR_04114"),
    ERR_04115("ERR_04115"),
    ERR_04116("ERR_04116"),
    ERR_04117("ERR_04117"),
    ERR_04118("ERR_04118"),
    ERR_04119("ERR_04119"),
    ERR_04120("ERR_04120"),
    ERR_04121("ERR_04121"),
    ERR_04122("ERR_04122"),
    ERR_04123("ERR_04123"),
    ERR_04124("ERR_04124"),
    ERR_04125("ERR_04125"),
    ERR_04126("ERR_04126"),
    ERR_04127("ERR_04127"),
    ERR_04128("ERR_04128"),
    ERR_04129("ERR_04129"),
    ERR_04130("ERR_04130"),
    ERR_04131("ERR_04131"),
    ERR_04132("ERR_04132"),
    ERR_04133("ERR_04133"),
    ERR_04134("ERR_04134"),
    ERR_04135("ERR_04135"),
    ERR_04136("ERR_04136"),
    ERR_04137("ERR_04137"),
    ERR_04138("ERR_04138"),
    ERR_04139("ERR_04139"),
    ERR_04140_UNACCEPTABLE_RESULT_CODE("ERR_04140_UNACCEPTABLE_RESULT_CODE"),
    ERR_04141("ERR_04141"),
    ERR_04142("ERR_04142"),
    ERR_04143("ERR_04143"),
    ERR_04144("ERR_04144"),
    ERR_04145("ERR_04145"),
    ERR_04146("ERR_04146"),
    ERR_04147("ERR_04147"),
    ERR_04148("ERR_04148"),
    ERR_04149("ERR_04149"),
    ERR_04150("ERR_04150"),
    ERR_04151("ERR_04151"),
    ERR_04152("ERR_04152"),
    ERR_04153("ERR_04153"),
    ERR_04154("ERR_04154"),
    ERR_04155("ERR_04155"),
    ERR_04156("ERR_04156"),
    ERR_04157("ERR_04157"),
    ERR_04158("ERR_04158"),
    ERR_04159("ERR_04159"),
    ERR_04160("ERR_04160"),
    ERR_04161("ERR_04161"),
    ERR_04162("ERR_04162"),
    ERR_04163("ERR_04163"),
    ERR_04164("ERR_04164"),
    ERR_04165("ERR_04165"),
    ERR_04166("ERR_04166"),
    ERR_04167("ERR_04167"),
    ERR_04168("ERR_04168"),
    ERR_04169("ERR_04169"),
    ERR_04170("ERR_04170"),
    ERR_04171("ERR_04171"),
    ERR_04172("ERR_04172"),
    ERR_04173("ERR_04173"),
    ERR_04174("ERR_04174"),
    ERR_04175("ERR_04175"),
    ERR_04176("ERR_04176"),
    ERR_04177("ERR_04177"),
    ERR_04178("ERR_04178"),
    ERR_04179("ERR_04179"),
    ERR_04180("ERR_04180"),
    ERR_04181("ERR_04181"),
    ERR_04182("ERR_04182"),
    ERR_04183("ERR_04183"),
    ERR_04184("ERR_04184"),
    ERR_04185("ERR_04185"),
    ERR_04186("ERR_04186"),
    ERR_04187("ERR_04187"),
    ERR_04188("ERR_04188"),
    ERR_04189("ERR_04189"),
    ERR_04190("ERR_04190"),
    ERR_04191("ERR_04191"),
    ERR_04192("ERR_04192"),
    ERR_04193("ERR_04193"),
    ERR_04194("ERR_04194"),
    ERR_04195("ERR_04195"),
    ERR_04196("ERR_04196"),
    ERR_04197("ERR_04197"),
    ERR_04198("ERR_04198"),
    ERR_04199("ERR_04199"),
    ERR_04200("ERR_04200"),
    ERR_04201("ERR_04201"),
    ERR_04202("ERR_04202"),
    ERR_04203("ERR_04203"),
    ERR_04204("ERR_04204"),
    ERR_04205("ERR_04205"),
    ERR_04206("ERR_04206"),
    ERR_04207("ERR_04207"),
    ERR_04208("ERR_04208"),
    ERR_04209_EMPTY_TYPE_NOT_ALLOWED("ERR_04209_EMPTY_TYPE_NOT_ALLOWED"),
    ERR_04210("ERR_04210"),
    ERR_04211("ERR_04211"),
    ERR_04212("ERR_04212"),
    ERR_04213("ERR_04213"),
    ERR_04214("ERR_04214"),
    ERR_04215("ERR_04215"),
    ERR_04216("ERR_04216"),
    ERR_04217("ERR_04217"),
    ERR_04218("ERR_04218"),
    ERR_04219_ARGUMENT1_NULL("ERR_04219_ARGUMENT1_NULL"),
    ERR_04220_ARGUMENT2_NULL("ERR_04220_ARGUMENT2_NULL"),
    ERR_04221("ERR_04221"),
    ERR_04222("ERR_04222"),
    ERR_04223("ERR_04223"),
    ERR_04224("ERR_04224"),
    ERR_04225("ERR_04225"),
    ERR_04226("ERR_04226"),
    ERR_04227("ERR_04227"),
    ERR_04228("ERR_04228"),
    ERR_04229("ERR_04229"),
    ERR_04230("ERR_04230"),
    ERR_04231("ERR_04231"),
    ERR_04232("ERR_04232"),
    ERR_04233("ERR_04233"),
    ERR_04234("ERR_04234"),
    ERR_04235("ERR_04235"),
    ERR_04236("ERR_04236"),
    ERR_04237("ERR_04237"),
    ERR_04238("ERR_04238"),
    ERR_04239("ERR_04239"),
    ERR_04240("ERR_04240"),
    ERR_04241("ERR_04241"),
    ERR_04242("ERR_04242"),
    ERR_04243("ERR_04243"),
    ERR_04244("ERR_04244"),
    ERR_04245("ERR_04245"),
    ERR_04246("ERR_04246"),
    ERR_04247("ERR_04247"),
    ERR_04248("ERR_04248"),
    ERR_04249("ERR_04249"),
    ERR_04250("ERR_04250"),
    ERR_04251("ERR_04251"),
    ERR_04252("ERR_04252"),
    ERR_04253("ERR_04253"),
    ERR_04254("ERR_04254"),
    ERR_04255("ERR_04255"),
    ERR_04256("ERR_04256"),
    ERR_04257("ERR_04257"),
    ERR_04258("ERR_04258"),
    ERR_04259("ERR_04259"),
    ERR_04260("ERR_04260"),
    ERR_04261("ERR_04261"),
    ERR_04262("ERR_04262"),
    ERR_04263("ERR_04263"),
    ERR_04264("ERR_04264"),
    ERR_04265("ERR_04265"),
    ERR_04266("ERR_04266"),
    ERR_04267("ERR_04267"),
    ERR_04268_OID_NOT_FOUND("ERR_04268_OID_NOT_FOUND"),
    ERR_04269("ERR_04269"),
    ERR_04270("ERR_04270"),
    ERR_04271("ERR_04271"),
    ERR_04272("ERR_04272"),
    ERR_04273("ERR_04273"),
    ERR_04274("ERR_04274"),
    ERR_04275("ERR_04275"),
    ERR_04276("ERR_04276"),
    ERR_04277("ERR_04277"),
    ERR_04278("ERR_04278"),
    ERR_04279("ERR_04279"),
    ERR_04280("ERR_04280"),
    ERR_04281("ERR_04281"),
    ERR_04282("ERR_04282"),
    ERR_04283("ERR_04283"),
    ERR_04284("ERR_04284"),
    ERR_04285("ERR_04285"),
    ERR_04286("ERR_04286"),
    ERR_04287("ERR_04287"),
    ERR_04288("ERR_04288"),
    ERR_04289("ERR_04289"),
    ERR_04290("ERR_04290"),
    ERR_04291("ERR_04291"),
    ERR_04292("ERR_04292"),
    ERR_04293("ERR_04293"),
    ERR_04294("ERR_04294"),
    ERR_04295("ERR_04295"),
    ERR_04296("ERR_04296"),
    ERR_04297("ERR_04297"),
    ERR_04298("ERR_04298"),
    ERR_04299("ERR_04299"),
    ERR_04300("ERR_04300"),
    ERR_04301("ERR_04301"),
    ERR_04302("ERR_04302"),
    ERR_04303("ERR_04303"),
    ERR_04304("ERR_04304"),
    ERR_04305("ERR_04305"),
    ERR_04306("ERR_04306"),
    ERR_04307("ERR_04307"),
    ERR_04308("ERR_04308"),
    ERR_04309("ERR_04309"),
    ERR_04310("ERR_04310"),
    ERR_04311("ERR_04311"),
    ERR_04312("ERR_04312"),
    ERR_04313("ERR_04313"),
    ERR_04314("ERR_04314"),
    ERR_04315("ERR_04315"),
    ERR_04316("ERR_04316"),
    ERR_04317("ERR_04317"),
    ERR_04318("ERR_04318"),
    ERR_04319("ERR_04319"),
    ERR_04320("ERR_04320"),
    ERR_04321("ERR_04321"),
    ERR_04322("ERR_04322"),
    ERR_04323("ERR_04323"),
    ERR_04324("ERR_04324"),
    ERR_04325("ERR_04325"),
    ERR_04326("ERR_04326"),
    ERR_04327("ERR_04327"),
    ERR_04328("ERR_04328"),
    ERR_04329("ERR_04329"),
    ERR_04330("ERR_04330"),
    ERR_04331("ERR_04331"),
    ERR_04332("ERR_04332"),
    ERR_04333("ERR_04333"),
    ERR_04334("ERR_04334"),
    ERR_04335("ERR_04335"),
    ERR_04336("ERR_04336"),
    ERR_04337("ERR_04337"),
    ERR_04338("ERR_04338"),
    ERR_04339("ERR_04339"),
    ERR_04340("ERR_04340"),
    ERR_04341("ERR_04341"),
    ERR_04342("ERR_04342"),
    ERR_04343("ERR_04343"),
    ERR_04344("ERR_04344"),
    ERR_04345("ERR_04345"),
    ERR_04346("ERR_04346"),
    ERR_04347("ERR_04347"),
    ERR_04348("ERR_04348"),
    ERR_04349("ERR_04349"),
    ERR_04350("ERR_04350"),
    ERR_04351("ERR_04351"),
    ERR_04352("ERR_04352"),
    ERR_04353("ERR_04353"),
    ERR_04354("ERR_04354"),
    ERR_04355("ERR_04355"),
    ERR_04356("ERR_04356"),
    ERR_04357("ERR_04357"),
    ERR_04358("ERR_04358"),
    ERR_04359("ERR_04359"),
    ERR_04360("ERR_04360"),
    ERR_04361("ERR_04361"),
    ERR_04362("ERR_04362"),
    ERR_04363("ERR_04363"),
    ERR_04364("ERR_04364"),
    ERR_04365("ERR_04365"),
    ERR_04366("ERR_04366"),
    ERR_04367("ERR_04367"),
    ERR_04368("ERR_04368"),
    ERR_04369("ERR_04369"),
    ERR_04370("ERR_04370"),
    ERR_04371("ERR_04371"),
    ERR_04372("ERR_04372"),
    ERR_04373("ERR_04373"),
    ERR_04374("ERR_04374"),
    ERR_04375("ERR_04375"),
    ERR_04376("ERR_04376"),
    ERR_04377("ERR_04377"),
    ERR_04378("ERR_04378"),
    ERR_04379("ERR_04379"),
    ERR_04380("ERR_04380"),
    ERR_04381("ERR_04381"),
    ERR_04382("ERR_04382"),
    ERR_04383("ERR_04383"),
    ERR_04384("ERR_04384"),
    ERR_04385("ERR_04385"),
    ERR_04386("ERR_04386"),
    ERR_04387("ERR_04387"),
    ERR_04388("ERR_04388"),
    ERR_04389("ERR_04389"),
    ERR_04390("ERR_04390"),
    ERR_04391("ERR_04391"),
    ERR_04392("ERR_04392"),
    ERR_04393("ERR_04393"),
    ERR_04394("ERR_04394"),
    ERR_04395("ERR_04395"),
    ERR_04396("ERR_04396"),
    ERR_04397("ERR_04397"),
    ERR_04398("ERR_04398"),
    ERR_04399("ERR_04399"),
    ERR_04400("ERR_04400"),
    ERR_04401("ERR_04401"),
    ERR_04402("ERR_04402"),
    ERR_04403("ERR_04403"),
    ERR_04404("ERR_04404"),
    ERR_04405("ERR_04405"),
    ERR_04406("ERR_04406"),
    ERR_04407("ERR_04407"),
    ERR_04408("ERR_04408"),
    ERR_04409("ERR_04409"),
    ERR_04410("ERR_04410"),
    ERR_04411("ERR_04411"),
    ERR_04412("ERR_04412"),
    ERR_04413("ERR_04413"),
    ERR_04414("ERR_04414"),
    ERR_04415("ERR_04415"),
    ERR_04416("ERR_04416"),
    ERR_04417("ERR_04417"),
    ERR_04418("ERR_04418"),
    ERR_04419("ERR_04419"),
    ERR_04420("ERR_04420"),
    ERR_04421("ERR_04421"),
    ERR_04422("ERR_04422"),
    ERR_04423("ERR_04423"),
    ERR_04424("ERR_04424"),
    ERR_04425("ERR_04425"),
    ERR_04426("ERR_04426"),
    ERR_04427("ERR_04427"),
    ERR_04428("ERR_04428"),
    ERR_04429("ERR_04429"),
    ERR_04430("ERR_04430"),
    ERR_04431("ERR_04431"),
    ERR_04432("ERR_04432"),
    ERR_04433("ERR_04433"),
    ERR_04434("ERR_04434"),
    ERR_04435("ERR_04435"),
    ERR_04436("ERR_04436"),
    ERR_04437("ERR_04437"),
    ERR_04438("ERR_04438"),
    ERR_04439("ERR_04439"),
    ERR_04440("ERR_04440"),
    ERR_04441("ERR_04441"),
    ERR_04442_NOT_EXISTING_ATRIBUTE_TYPE("ERR_04442_NOT_EXISTING_ATRIBUTE_TYPE"),
    ERR_04443("ERR_04443"),
    ERR_04444("ERR_04444"),
    ERR_04445("ERR_04445"),
    ERR_04446("ERR_04446"),
    ERR_04447_CANNOT_NORMALIZE_VALUE("ERR_04447_CANNOT_NORMALIZE_VALUE"),
    ERR_04448("ERR_04448"),
    ERR_04449("ERR_04449"),
    ERR_04450("ERR_04450"),
    ERR_04451("ERR_04451"),
    ERR_04452("ERR_04452"),
    ERR_04453("ERR_04453"),
    ERR_04454("ERR_04454"),
    ERR_04455("ERR_04455"),
    ERR_04456("ERR_04456"),
    ERR_04457_NULL_ATTRIBUTE_ID("ERR_04457_NULL_ATTRIBUTE_ID"),
    ERR_04458("ERR_04458"),
    ERR_04459("ERR_04459"),
    ERR_04460_ATTRIBUTE_TYPE_NULL_NOT_ALLOWED("ERR_04460_ATTRIBUTE_TYPE_NULL_NOT_ALLOWED"),
    ERR_04461("ERR_04461"),
    ERR_04462("ERR_04462"),
    ERR_04463("ERR_04463"),
    ERR_04464("ERR_04464"),
    ERR_04465("ERR_04465"),
    ERR_04466("ERR_04466"),
    ERR_04467("ERR_04467"),
    ERR_04468("ERR_04468"),
    ERR_04469("ERR_04469"),
    ERR_04470("ERR_04470"),
    ERR_04471("ERR_04471"),
    ERR_04472("ERR_04472"),
    ERR_04473_NOT_VALID_VALUE("ERR_04473_NOT_VALID_VALUE"),
    ERR_04474("ERR_04474"),
    ERR_04475("ERR_04475"),
    ERR_04476("ERR_04476"),
    ERR_04477_NO_VALID_AT_FOR_THIS_ID("ERR_04477_NO_VALID_AT_FOR_THIS_ID"),
    ERR_04478_NO_VALUE_NOT_ALLOWED("ERR_04478_NO_VALUE_NOT_ALLOWED"),
    ERR_04479_INVALID_SYNTAX_VALUE("ERR_04479_INVALID_SYNTAX_VALUE"),
    ERR_04480_END_OF_STREAM("ERR_04480_END_OF_STREAM"),
    ERR_04481_ENTRY_NULL_VALUE("ERR_04481_ENTRY_NULL_VALUE"),
    ERR_04482_CANNOT_SUBTYPE_COLLECTIVE("ERR_04482_CANNOT_SUBTYPE_COLLECTIVE"),
    ERR_04483_COLLECTIVE_NOT_MULTI_VALUED("ERR_04483_COLLECTIVE_NOT_MULTI_VALUED"),
    ERR_04484_COLLECTIVE_NOT_ALLOWED_IN_MUST("ERR_04484_COLLECTIVE_NOT_ALLOWED_IN_MUST"),
    ERR_04485_COLLECTIVE_NOT_ALLOWED_IN_MAY("ERR_04485_COLLECTIVE_NOT_ALLOWED_IN_MAY"),
    ERR_04486_VALUE_ALREADY_EXISTS("ERR_04486_VALUE_ALREADY_EXISTS"),
    ERR_04487_ATTRIBUTE_IS_SINGLE_VALUED("ERR_04487_ATTRIBUTE_IS_SINGLE_VALUED"),
    ERR_04488_SYNTAX_INVALID("ERR_04488_SYNTAX_INVALID"),
    
    // ldap-constants
    ERR_05001_UNKNOWN_AUTHENT_LEVEL("ERR_05001_UNKNOWN_AUTHENT_LEVEL"),

    // ldap-converter
    ERR_06001_EMPTY_OR_NULL_SCHEMA_OBJECT("ERR_06001_EMPTY_OR_NULL_SCHEMA_OBJECT"),
    ERR_06002_PARSER_FAILURE("ERR_06002_PARSER_FAILURE"),
    ERR_06003_NO_NAME("ERR_06003_NO_NAME"),
    ERR_06004_CANNOT_GENERATE_SOURCES("ERR_06004_CANNOT_GENERATE_SOURCES"),
    ERR_06005_NULL_SCHEMA("ERR_06005_NULL_SCHEMA"),
    ERR_06006_NO_PROPERTY("ERR_06006_NO_PROPERTY"),

    // ldap-jndi
    // no exceptions to translate

    // ldap-schema
    ERR_08001("ERR_08001"),
    ERR_08002("ERR_08002"),
    ERR_08003("ERR_08003"),
    ERR_08004("ERR_08004"),
    ERR_08005("ERR_08005"),
    ERR_08006("ERR_08006"),

    // ldap-schema
    ERR_09001_DIRECTORY_CREATION_FAILED("ERR_09001_DIRECTORY_CREATION_FAILED"),

    // ldap-schema-loader
    ERR_10001("ERR_10001"),
    ERR_10002("ERR_10002"),
    ERR_10003("ERR_10003"),
    ERR_10004("ERR_10004"),
    ERR_10005("ERR_10005"),
    ERR_10006("ERR_10006"),
    ERR_10007("ERR_10007"),
    ERR_10008("ERR_10008"),
    ERR_10009("ERR_10009"),
    ERR_10010("ERR_10010"),
    ERR_10011("ERR_10011"),
    ERR_10012("ERR_10012"),
    ERR_10013("ERR_10013"),
    ERR_10014("ERR_10014"),
    ERR_10015("ERR_10015"),
    ERR_10016("ERR_10016"),
    ERR_10017("ERR_10017"),
    ERR_10018("ERR_10018"),
    ERR_10019("ERR_10019"),
    ERR_10020("ERR_10020"),
    ERR_10021("ERR_10021"),
    ERR_10022("ERR_10022"),
    ERR_10023("ERR_10023"),
    ERR_10024("ERR_10024"),
    ERR_10025("ERR_10025"),
    ERR_10026("ERR_10026"),
    ERR_10027("ERR_10027"),
    ERR_10028("ERR_10028"),

    // ldap-schema-manager
    ERR_11001("ERR_11001"),
    ERR_11002("ERR_11002"),
    ERR_11003("ERR_11003"),
    ERR_11004("ERR_11004"),
    ERR_11005("ERR_11005"),
    ERR_11006("ERR_11006"),
    ERR_11007("ERR_11007"),
    ERR_11008("ERR_11008"),
    ERR_11009("ERR_11009"),
    ERR_11010("ERR_11010"),
    ERR_11011("ERR_11011"),
    ERR_11012("ERR_11012"),
    ERR_11013("ERR_11013"),

    // ldap-schema-manager
    ERR_12001_UNKNOWN_CHANGE_TYPE("ERR_12001_UNKNOWN_CHANGE_TYPE"),
    ERR_12002_ENTRY_WITH_TWO_DNS("ERR_12002_ENTRY_WITH_TWO_DNS"),
    ERR_12003_LDIF_ENTRY_WITH_TWO_DNS("ERR_12003_LDIF_ENTRY_WITH_TWO_DNS"),
    ERR_12004_CHANGE_NOT_ALLOWED("ERR_12004_CHANGE_NOT_ALLOWED"),
    ERR_12005_NO_CHANGE("ERR_12005_NO_CHANGE"),
    ERR_12006_EXPECTING_ATTRIBUTE_TYPE("ERR_12006_EXPECTING_ATTRIBUTE_TYPE"),
    ERR_12007_BAD_ATTRIBUTE("ERR_12007_BAD_ATTRIBUTE"),
    ERR_12008_CANNOT_PARSE_LDIF_BUFFER("ERR_12008_CANNOT_PARSE_LDIF_BUFFER"),
    ERR_12009_ERROR_PARSING_LDIF_BUFFER("ERR_12009_ERROR_PARSING_LDIF_BUFFER"),
    ERR_12010_CANNOT_FIND_FILE("ERR_12010_CANNOT_FIND_FILE"),
    ERR_12011_CANNOT_READ_FILE("ERR_12011_CANNOT_READ_FILE"),
    ERR_12012_EMPTY_DN_NOT_ALLOWED("ERR_12012_EMPTY_DN_NOT_ALLOWED"),
    ERR_12013_NO_DN("ERR_12013_NO_DN"),
    ERR_12014_BASE64_DN_EXPECTED("ERR_12014_BASE64_DN_EXPECTED"),
    ERR_12015_INVALID_BASE64_DN("ERR_12015_INVALID_BASE64_DN"),
    ERR_12016_DN_EXPECTED("ERR_12016_DN_EXPECTED"),
    ERR_12017_INVALID_DN("ERR_12017_INVALID_DN"),
    ERR_12018_FILE_NOT_FOUND("ERR_12018_FILE_NOT_FOUND"),
    ERR_12019_BAD_URL_FILE_NOT_FOUND("ERR_12019_BAD_URL_FILE_NOT_FOUND"),
    ERR_12020_FILE_TOO_BIG("ERR_12020_FILE_TOO_BIG"),
    ERR_12022_ERROR_READING_FILE("ERR_12022_ERROR_READING_FILE"),
    ERR_12023_ERROR_READING_BAD_URL("ERR_12023_ERROR_READING_BAD_URL"),
    ERR_12024_CANNOT_CLOSE_FILE("ERR_12024_CANNOT_CLOSE_FILE"),
    ERR_12025_BAD_PROTOCOL("ERR_12025_BAD_PROTOCOL"),
    ERR_12026_UNSUPPORTED_PROTOCOL("ERR_12026_UNSUPPORTED_PROTOCOL"),
    ERR_12027_BAD_URL("ERR_12027_BAD_URL"),
    ERR_12029_CONTROL_WITHOUT_OID("ERR_12029_CONTROL_WITHOUT_OID"),
    ERR_12031_INVALID_OID("ERR_12031_INVALID_OID"),
    ERR_12033_INVALID_CRITICALITY("ERR_12033_INVALID_CRITICALITY"),
    ERR_12035_BAD_MODRDN_OPERATION("ERR_12035_BAD_MODRDN_OPERATION"),
    ERR_12038_NO_DELETEOLDRDN("ERR_12038_NO_DELETEOLDRDN"),
    ERR_12040_BAD_MODIFY_SEPARATOR("ERR_12040_BAD_MODIFY_SEPARATOR"),
    ERR_12042_BAD_MODIFY_SEPARATOR_2("ERR_12042_BAD_MODIFY_SEPARATOR_2"),
    ERR_12044("ERR_12044"),
    ERR_12045("ERR_12045"),
    ERR_12046("ERR_12046"),
    ERR_12047("ERR_12047"),
    ERR_12048("ERR_12048"),
    ERR_12049("ERR_12049"),
    ERR_12050("ERR_12050"),
    ERR_12051("ERR_12051"),
    ERR_12052("ERR_12052"),
    ERR_12053("ERR_12053"),
    ERR_12054("ERR_12054"),
    ERR_12055("ERR_12055"),
    ERR_12056("ERR_12056"),
    ERR_12057_BAD_ATTRIBUTE("ERR_12057_BAD_ATTRIBUTE"),
    ERR_12058_UNKNOWN_ENTRY_TYPE("ERR_12058_UNKNOWN_ENTRY_TYPE"),
    ERR_12059_UNKNOWN_ENTRY("ERR_12059_UNKNOWN_ENTRY"),
    ERR_12060_VERSION_NOT_A_NUMBER("ERR_12060_VERSION_NOT_A_NUMBER"),
    ERR_12061_LDIF_PARSING_ERROR("ERR_12061_LDIF_PARSING_ERROR"),
    ERR_12062_EMPTY_CONTINUATION_LINE("ERR_12062_EMPTY_CONTINUATION_LINE"),
    ERR_12063_ERROR_WHILE_READING_LDIF_LINE("ERR_12063_ERROR_WHILE_READING_LDIF_LINE"),
    ERR_12064_EMPTY_FILE_NAME("ERR_12064_EMPTY_FILE_NAME"),
    ERR_12066("ERR_12066"),
    ERR_12067("ERR_12067"),
    ERR_12068("ERR_12068"),
    ERR_12069("ERR_12069"),
    ERR_12070("ERR_12070"),
    ERR_12071("ERR_12071"),
    ERR_12072("ERR_12072"),
    ERR_12073("ERR_12073"),
    ERR_12074("ERR_12074"),
    ERR_12075("ERR_12075"),
    ERR_12076("ERR_12076"),
    ERR_12077("ERR_12077"),
    ERR_12078("ERR_12078"),
    ERR_12079("ERR_12079"),
    ERR_12080("ERR_12080"),
    ERR_12081("ERR_12081"),
    ERR_12082("ERR_12082"),
    ERR_12083("ERR_12083"),
    ERR_12084("ERR_12084"),
    ERR_12085("ERR_12085"),
    ERR_12086("ERR_12086"),
    ERR_12087("ERR_12087"),

    // The messages
    MSG_04489_SYNTAX_VALID( "MSG_04489_SYNTAX_VALID" );
    
    /** The error code */
    private String errorCode;

    /** The file containing the errors */
    private static final ResourceBundle ERR_BUNDLE = ResourceBundle
        .getBundle( "org/apache/directory/api/i18n/errors", Locale.ROOT );

    /** The file containing the messages */
    private static final ResourceBundle MSG_BUNDLE = ResourceBundle
        .getBundle( "org/apache/directory/api/i18n/messages", Locale.ROOT );

    /**
     * Creates a new instance of I18n.
     * 
     * @param errorCode the error code
     */
    I18n( String errorCode )
    {
        this.errorCode = errorCode;
    }


    /**
     * Getter for the field <code>errorCode</code>.
     *
     * @return the errorCode
     * @since 0.9.20
     */
    public String getErrorCode()
    {
        return errorCode;
    }


    /**
     *
     * Translate an error code with argument(s)
     *
     * @param err The error code
     * @param args The argument(s)
     * @return The translated error
     */
    public static String err( I18n err, Object... args )
    {
        try
        {
            return err + " " + format( ERR_BUNDLE.getString( err.getErrorCode() ), args );
        }
        catch ( Exception e )
        {
            StringBuilder sb = new StringBuilder();
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
     * Translate a message code with argument(s)
     *
     * @param msg The message code
     * @param args The argument(s)
     * @return The translated error
     */
    public static String msg( I18n msg, Object... args )
    {
        try
        {
            return msg + " " + format( ERR_BUNDLE.getString( msg.getErrorCode() ), args );
        }
        catch ( Exception e )
        {
            StringBuilder sb = new StringBuilder();
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


    /**
     *
     * Translate a message with argument(s)
     *
     * @param msg The message
     * @param args The argument(s)
     * @return The translated error
     */
    public static String msg( String msg, Object... args )
    {
        try
        {
            return format( MSG_BUNDLE.getString( msg ), args );
        }
        catch ( MissingResourceException mre )
        {
            try
            {
                return format( msg, args );
            }
            catch ( Exception e )
            {
                StringBuilder sb = new StringBuilder();
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

    /**
     * Format a message injecting some parameters in the pattern.
     * 
     * @param pattern The message pattern
     * @param args The arguments to inject in the pattern
     * @return The resulting messages
     */
    public static String format( String pattern, Object... args )
    {
        return new MessageFormat( pattern, Locale.ROOT ).format( args );
    }
}
