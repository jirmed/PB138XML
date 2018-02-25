/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pb138.sem07;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author jirka
 */
public class World extends Part {

    public World(Element documentElement) {
        this.partElement = documentElement;
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {
        return getNodeName();
    }

    public Continent[] getContinents() {
        Continent[] continents = null;
        NodeList continentsNl = this.partElement.getElementsByTagName("continent");
        if (!continentsNl.equals(null)) {
            int continentCount = continentsNl.getLength();
            continents = new Continent[continentCount];
            for (int i = 0; i < continentCount; i++) {
                continents[i] = new Continent((Element) continentsNl.item(i));
            }
        }
        return continents;
    }
    
    public Continent getContinent(String name) {
        Continent result = null;
        Continent[] continents = getContinents();
        for (Continent continent : continents) {
            if (continent.getName().equals(name)) {
                result = continent;
                break;
            }
        }
        return result;
    }
}
