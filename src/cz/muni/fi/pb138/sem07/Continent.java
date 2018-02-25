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
public class Continent extends Part {

    Continent(Element continentElement) {
        this.partElement = continentElement;
    }

    @Override
    public String getName() {
        return partElement.getAttribute("name");
    }

    City getLargestCity() {
        City result = null;
        City[] cities = getCities();
        for (City city : cities) {
            if (result == null || result.getPopulation() < city.getPopulation()) {
                result = city;
            }

        }
        return result;
    }

    City[] getCities() {
        City[] cities = null;
        NodeList citiesNl = partElement.getElementsByTagName("city");
        if (!citiesNl.equals(null)) {
            int citiesCount = citiesNl.getLength();
            cities = new City[citiesCount];
            for (int i = 0; i < citiesCount; i++) {
                cities[i] = new City((Element) citiesNl.item(i));
            }
        }
        return cities;
    }

}
