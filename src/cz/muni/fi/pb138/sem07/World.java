/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pb138.sem07;

import org.w3c.dom.Element;

/**
 *
 * @author jirka
 */
public class World {
    private Element element;

    public World(Element documentElement) {
        this.element = documentElement;
    }
    
    /**
     *
     * @return
     */
    public String getName() {
        return getNodeName();
    }

    protected String getNodeName() {
        return element.getNodeName();
    }
    
}
