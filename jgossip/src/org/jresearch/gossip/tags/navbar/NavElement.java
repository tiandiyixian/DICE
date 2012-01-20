/*
 * $$Id$$
 *
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
 *              Dmitry Belov <bel@jresearch.org>
 *        
 * ***** END LICENSE BLOCK ***** */
/*
 * Created on Oct 7, 2003
 *
 */
package org.jresearch.gossip.tags.navbar;

import org.jresearch.gossip.IConst;

/**
 * DOCUMENT ME!
 * 
 * @author Bel
 */
public class NavElement {
	private String link = IConst.VALUES.FALSE;

	private String title;

	/**
	 * DOCUMENT ME!
	 * 
	 * @return
	 */
	public String getLink() {
		return link;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param string
	 */
	public void setLink(String string) {
		link = string;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param string
	 */
	public void setTitle(String string) {
		title = string;
	}
}