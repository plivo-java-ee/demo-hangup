/*
 * Copyright 2014 plivo-java-ee.org.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.plivo.ee.demo.hangup.servlet;

import javax.servlet.annotation.WebServlet;

import org.plivo.ee.helper.exception.PlivoException;
import org.plivo.ee.helper.xml.elements.PlivoResponse;
import org.plivo.ee.web.servlet.XmlServlet;

@WebServlet(urlPatterns = { "/HangupServlet", "/hangup" })
public class HangupServlet extends XmlServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public PlivoResponse getPlivoResponse() throws PlivoException {
		return null;
	}

	@Override
	public boolean isLogParameters() {
		return true;
	}
}