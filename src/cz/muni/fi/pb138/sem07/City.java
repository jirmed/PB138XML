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
public class City extends Part {

    City(Element cityElement) {
        this.partElement = cityElement;
    }

    @Override
    public String getName() {
        return getChildNodeText("name");
    }

    public int getPopulation() {
        return Integer.parseInt(getChildNodeText("population"));
    }

    public String getPullution() {
        return getChildNodeText("pollution");
    }

}
