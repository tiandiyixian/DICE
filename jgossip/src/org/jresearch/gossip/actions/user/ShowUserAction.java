/*
 * $$Id: ShowUserAction.java,v 1.3 2005/06/07 12:32:29 bel70 Exp $$
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
 * Created on Oct 5, 2003
 *
 */
package org.jresearch.gossip.actions.user;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.jresearch.gossip.IConst;
import org.jresearch.gossip.actions.BaseAction;
import org.jresearch.gossip.beans.user.User;
import org.jresearch.gossip.dao.ForumDAO;
import org.jresearch.gossip.dao.UserDAO;
import org.jresearch.gossip.exception.SystemException;
import org.jresearch.gossip.forms.ProcessUserForm;

/**
 * DOCUMENT ME!
 * 
 * @author Bel
 */
public class ShowUserAction extends BaseAction {
	/**
	 * DOCUMENT ME!
	 * 
	 * @param mapping
	 *            DOCUMENT ME!
	 * @param form
	 *            DOCUMENT ME!
	 * @param request
	 *            DOCUMENT ME!
	 * @param response
	 *            DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public ActionForward process(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws SystemException {
		UserDAO userdao = UserDAO.getInstance();
		ForumDAO forumdao = ForumDAO.getInstance();
		ProcessUserForm puForm = (ProcessUserForm) form;
		try {

			User userToShow = userdao.getUserInfo(puForm.getUid());
			request.setAttribute(IConst.REQUEST.USER_TO_SHOW, userToShow);

			ArrayList userModForums = forumdao.getUserModForums(userToShow
					.getName());

			if (userModForums.size() > 0) {
				request.setAttribute(IConst.REQUEST.USER_MOD_FORUMS,
						userModForums);
			}

			ArrayList forumsForMod = forumdao.getForumsForMod();

			request.setAttribute(IConst.REQUEST.FORUMS_FOR_MOD, forumsForMod);
		} catch (SQLException sqle) {
			getServlet().log("Connection.process", sqle);
			throw new SystemException(sqle);
		}

		return (mapping.findForward("showUser"));
	}
}