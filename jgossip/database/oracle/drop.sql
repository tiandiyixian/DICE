/*$$Id$$
 * ***** BEGIN LICENSE BLOCK *****
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in 
 * compliance with the License. You may obtain a copy of the License 
 * at http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
 * the License for the specific language governing rights and 
 * limitations under the License.
 *
 * The Original Code is JGossip forum code.
 *
 * The Initial Developer of the Original Code is the JResearch, Org. 
 * Portions created by the Initial Developer are Copyright (C) 2004 
 * the Initial Developer. All Rights Reserved. 
 * 
 * Contributor(s): 
 *              Alexey Pavlov <alexnet@users.sourceforge.net>
 *        
 * ***** END LICENSE BLOCK ***** */
ALTER TABLE JRF_ATTACH DROP PRIMARY KEY CASCADE
/
DROP TABLE JRF_ATTACH CASCADE CONSTRAINTS
/

DROP TABLE JRF_AUDIT_LOG CASCADE CONSTRAINTS
/

ALTER TABLE JRF_BAN DROP PRIMARY KEY CASCADE
/
DROP TABLE JRF_BAN CASCADE CONSTRAINTS
/

ALTER TABLE JRF_BAN_TYPE DROP PRIMARY KEY CASCADE
/
DROP TABLE JRF_BAN_TYPE CASCADE CONSTRAINTS
/

ALTER TABLE JRF_CONSTANTS DROP PRIMARY KEY CASCADE
/
DROP TABLE JRF_CONSTANTS CASCADE CONSTRAINTS
/

ALTER TABLE JRF_FORUM DROP PRIMARY KEY CASCADE
/
DROP TABLE JRF_FORUM CASCADE CONSTRAINTS
/

ALTER TABLE JRF_GROUP DROP PRIMARY KEY CASCADE
/
DROP TABLE JRF_GROUP CASCADE CONSTRAINTS
/

ALTER TABLE JRF_KEY_KEEPER DROP PRIMARY KEY CASCADE
/
DROP TABLE JRF_KEY_KEEPER CASCADE CONSTRAINTS
/

ALTER TABLE JRF_MESSAGE DROP PRIMARY KEY CASCADE
/
DROP TABLE JRF_MESSAGE CASCADE CONSTRAINTS
/

DROP TABLE JRF_MOD CASCADE CONSTRAINTS
/

ALTER TABLE JRF_PENDING_USER DROP PRIMARY KEY CASCADE
/
DROP TABLE JRF_PENDING_USER CASCADE CONSTRAINTS
/

ALTER TABLE JRF_RANK DROP PRIMARY KEY CASCADE
/
DROP TABLE JRF_RANK CASCADE CONSTRAINTS
/

ALTER TABLE JRF_SKINS DROP PRIMARY KEY CASCADE
/
DROP TABLE JRF_SKINS CASCADE CONSTRAINTS
/

ALTER TABLE JRF_SKIN_PARAMS DROP PRIMARY KEY CASCADE
/
DROP TABLE JRF_SKIN_PARAMS CASCADE CONSTRAINTS
/

DROP TABLE JRF_SUBSCRIBE CASCADE CONSTRAINTS
/

ALTER TABLE JRF_THREAD DROP PRIMARY KEY CASCADE
/
DROP TABLE JRF_THREAD CASCADE CONSTRAINTS
/

ALTER TABLE JRF_USER DROP PRIMARY KEY CASCADE
/
DROP TABLE JRF_USER CASCADE CONSTRAINTS
/

ALTER TABLE JRF_USER_STATUS DROP PRIMARY KEY CASCADE
/
DROP TABLE JRF_USER_STATUS CASCADE CONSTRAINTS
/

ALTER TABLE JRF_WHOIS DROP PRIMARY KEY CASCADE
/
DROP TABLE JRF_WHOIS CASCADE CONSTRAINTS
/