/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pb138.sem07;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.w3c.dom.Element;

/**
 *
 * @author jirka
 */
public class ContinentTest extends PartTestAbstract{

    private Continent continent;

    @Override
    public void setUp() {
        continent = new Continent((Element)document.getElementsByTagName("continent").item(0));
    }

    @Override
    public void tearDown() {
    }

    @Override
    public void testGetNodeName() {
        assertThat(continent.getNodeName(), is("continent"));
    }

    @Override
    public void testGetName() {
        assertThat(continent.getName(), is("asia"));
    }
    
}
