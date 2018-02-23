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
public class City extends Part {

    public static City factory(Element element) {
        return new City(element);
    }

    protected City(Element element) {
        super(element);
    }

    @Override

    public String getName() {
        return getNodeTextValue("name");
    }

    public String getPollution() {
        return getNodeTextValue("pollution");
    }

    public int getPopulation() {
        String populationString = getNodeTextValue("population");
        int result = 0;
        if (!populationString.equals(null)) {
            result = Integer.parseInt(populationString);
        }
        return result;
    }

    @Override
    public String toString() {
        return getName() + 
                " Population: " + getPopulation() +
                " Pollution: " + getPollution(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
