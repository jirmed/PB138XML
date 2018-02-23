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
    protected Continent(Node node) {
        super(node);
    }
    
    /**
     *
     * @param element
     * @return
     */
    public static Continent factory(Node node) {
        return new Continent(node);
    }
    
}
