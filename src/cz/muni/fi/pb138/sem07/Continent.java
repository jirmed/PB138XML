/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pb138.sem07;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
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

    void setName(String name) {
        partElement.setAttribute("name", name);
    }

    City createCity(String name, int population, String pollution) {
        City newCity;
        Document doc = partElement.getOwnerDocument();
        Element citiesElement = (Element)partElement.getElementsByTagName("cities").item(0);
        Element cityElement = doc.createElement("city");
        String tag = "name";
        appendChildTextElement(doc, "name", name, cityElement);
        appendChildTextElement(doc, "population", ""+population, cityElement);
        appendChildTextElement(doc, "pollution", pollution, cityElement);
        
        citiesElement.appendChild(cityElement);
        newCity = new City(cityElement);
        return newCity;
    }

    protected void appendChildTextElement(Document doc, String tag, String name, Element parentElement) throws DOMException {
        Document document = partElement.getOwnerDocument();
        Element textElement = doc.createElement(tag);
        textElement.setTextContent(name);
        parentElement.appendChild((Node)textElement);
    }

    
}
