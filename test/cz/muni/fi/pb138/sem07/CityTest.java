/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pb138.sem07;

import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 *
 * @author jirka
 */
public class CityTest extends PartTestAbstract{

    private City city;

    public CityTest() {
    }
    
    /**
     *
     */
    @Before
    @Override
    public void setUp() {
        this.city = new City((Element)document.getElementsByTagName("city").item(0));
    }
    
    @After
    @Override
    public void tearDown() {
    }

    /**
     * Test of getName method, of class City.
     */
    @Test
    @Override
    public void testGetName() {
        assertThat(city.getName(), is("Tokio"));
    }

    @Override
    public void testGetNodeName() {
        assertThat(city.getNodeName(), is("city"));
    }

    @Test
    public void testGetPopulation() {
        assertThat(city.getPopulation(), is(13513734));
    }

    @Test
    public void testGetPollution() {
        assertThat(city.getPullution(), is("medium"));
    }
    
    
}
