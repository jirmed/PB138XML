/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pb138.sem07;

import org.w3c.dom.DOMException;
import org.w3c.dom.Element;

/**
 *
 * @author jirka
 */
public abstract class Part {
    
    protected Element partElement;

    public Part() {
    }

    /**
     *
     * @return
     */
    public abstract String getName();

    protected String getNodeName() {
        return partElement.getNodeName();
    }

    protected String getChildNodeText(String tag) throws DOMException {
        return partElement.getElementsByTagName(tag).item(0).getTextContent();
    }
    
}
