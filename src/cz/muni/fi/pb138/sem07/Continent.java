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
public class Continent extends Part{
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

    @Override
    public String getName() {
        return element.getAttribute("name");
    }
    
}
