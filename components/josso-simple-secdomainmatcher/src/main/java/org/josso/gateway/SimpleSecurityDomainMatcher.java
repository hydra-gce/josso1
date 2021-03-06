/*
 * JOSSO: Java Open Single Sign-On
 *
 * Copyright 2004-2009, Atricore, Inc.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 *
 */

package org.josso.gateway;

/**
 * @org.apache.xbean.XBean element="simple-matcher"
 *
 * A simple matcher that always returs true, usefull when only one security domain is configured.
 *
 * @author <a href="mailto:sgonzalez@atricore.org">Sebastian Gonzalez Oyuela</a>
 * @version $Rev: 591 $ $Date: 2008-08-13 10:29:48 -0300 (Wed, 13 Aug 2008) $
 */
public class SimpleSecurityDomainMatcher implements SecurityDomainMatcher {

    public void init() {
        // Nothing to do
    }

    /**
     * This always returs true.
     */
    public boolean match(SSORequest req) {
        return true;
    }
}
