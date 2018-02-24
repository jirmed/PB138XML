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
public class Continent extends Part {

    protected Continent(Element element) {
        super(element);
    }

    /**
     *
     * @param element
     * @return
     */
    public static Continent factory(Element element) {
        return new Continent(element);
    }

    public City[] getCities() {
        City[] cities;
        cities = null;
        NodeList citiesNl = element.getElementsByTagName("city");
        if (!citiesNl.equals(null)) {
            cities = new City[citiesNl.getLength()];
            for (int i = 0; i < citiesNl.getLength(); i++) {
                cities[i] = City.factory((Element) citiesNl.item(i));
            }
        }
        return cities;
    }

    public City getCity(String name) {
        City[] cities = getCities();
        City result = null;
        for (City city : cities) {
            if (city.getName().equals(name)) {
                result = city;
                break;
            }
        }
        return result;
    }

    public City getLargestCity() {
        City largestCity;
        largestCity = null;
        City[] cities = getCities();
        for (City city : cities) {
            if (largestCity == null || largestCity.getPopulation() < city.getPopulation()) {
                largestCity = city;
            }
        }
        return largestCity;
    }
    
    public void setName(String name) {
        element.setAttribute("name", name);
    }
    
    public City createCity(String name, int population, String pollution) {
        Element cityElement = element.getOwnerDocument().createElement("name");
        appendChildTextElement("name", name, cityElement);
        appendChildTextElement("population", ""+population, cityElement);
        appendChildTextElement("pollution", pollution, cityElement);
        element.getElementsByTagName("cities").item(0).appendChild(cityElement);
        City result = City.factory(cityElement);
        return result;
    }

    protected void appendChildTextElement(String tag, String name, Element cityElement) throws DOMException {
        Element newElement = element.getOwnerDocument().createElement(tag);
        newElement.setTextContent(name);
        cityElement.appendChild(newElement);
    }

    @Override
    public String getName() {
        return element.getAttribute("name");
    }

}
