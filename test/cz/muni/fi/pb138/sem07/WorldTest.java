/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pb138.sem07;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author jirka
 */
public class WorldTest {

    private World world;

    public WorldTest() {
    }
    
    private static Document document;

    @BeforeClass
    public static void setUpClass() throws ParserConfigurationException, SAXException, IOException {
        DOMParser domParser = new DOMParser("src/continent.xml", false, false);
        WorldTest.document = domParser.getDocument();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.world = new World(document.getDocumentElement());
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetNodeNameShouldBeWorld() {
        World testWorld = this.world;
        assertThat(testWorld.getNodeName(), is("world"));
    }

    
    @Test
    public void testGetNameShouldReturnWorld() {
        World testWorld = this.world;
        assertThat(testWorld.getName(), is("world"));
    }


}
