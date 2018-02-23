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
     * @param element
     */
    protected World(Element element) {
        super(element);
    }

    public static World factory(Element element) {
        return new World(element);
    }

    public Continent[] getContinents() {
        Continent[] continents = null;
        NodeList continentsNl = element.getElementsByTagName("continent");
        if (! continentsNl.equals(null)) {
            continents = new Continent[continentsNl.getLength()];
            for (int i = 0; i < continentsNl.getLength(); i++) {
                continents[i] = Continent.factory((Element) continentsNl.item(i));
            }
        }
        return continents;
    }

    public Continent getContinent(String name) {
        Continent[] continents = getContinents();
        Continent result = null;
        for (Continent continent : continents) {
            if (continent.getName().equals(name)) {
                result = continent;
                break;
            }
        }
        return result;
    }

    @Override
    public String getName() {
        return getNodeName();
    }
}
