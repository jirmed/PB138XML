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
public class Part {

    protected Node node;

    /**
     *
     * @param node
     */
    protected Part(Node node) {
        setNode(node);
    }

    private void setNode(Node node) {
        this.node = node;
    }

    public String getNodeName() {
        return this.node.getNodeName();
    }

    public String getTextName() {
        return getNodeTextValue("name");
    }

    private String getNodeTextValue(String tag) throws DOMException {
        String text = null;
        NodeList nl = node.getChildNodes();
        for (int i = 0; i < nl.getLength(); i++) {
            if (nl.item(i).getNodeName() == tag) {
                text = nl.item(i).getFirstChild().getNodeValue();
                break;
            }
        }
        return text;
    }

    @Override
    public String toString() {
        return getNodeName();
    }

}
