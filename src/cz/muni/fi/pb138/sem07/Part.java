/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pb138.sem07;

import org.w3c.dom.*;

/**
 *
 * @author jiri21
 */
public abstract class Part {

    protected Element element;

    /**
     *
     * @param element
     */
    protected Part(Element element) {
        setElement(element);
    }

    private void setElement(Element element) {
        this.element =  element;
    }

    public String getNodeName() {
        return this.element.getNodeName();
    }

    public abstract String getName(); 

    protected String getNodeTextValue(String tag) throws DOMException {
        String text = null;
        NodeList nl = element.getChildNodes();
        for (int i = 0; i < nl.getLength(); i++) {
            if (nl.item(i).getNodeName().equals(tag)) {
                text = nl.item(i).getFirstChild().getNodeValue();
                break;
            }
        }
        return text;
    }
    
    public void remove() {
        element.getParentNode().removeChild(element);
        element=null;
    }
            

    @Override
    public String toString() {
        return getName();
    }

}
