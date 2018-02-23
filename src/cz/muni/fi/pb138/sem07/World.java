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
public class World extends Part {

    /**
     *
     * @param node
     */
    protected World(Node node) {
        super(node);
    }

    public static World factory(Node node) {
        return new World(node);
    }

    public Continent[] getContinents() {
//        NodeList continentsNl;
        Continent[] continents = null;
        NodeList continentsNl = ((Element)node).getElementsByTagName("continent");
        if (continentsNl.getLength() > 0) {
            continents = new Continent[continentsNl.getLength()];
            for (int i = 0; i < continentsNl.getLength(); i++) {
                continents[i] = Continent.factory(continentsNl.item(i));
            }
        }
        return continents;
    }
}
