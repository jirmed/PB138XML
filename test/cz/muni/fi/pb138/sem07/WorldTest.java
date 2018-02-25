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
public class WorldTest extends PartTestAbstract {

    private World world;

    public WorldTest() {
    }

    @Before
    public void setUp() {
        this.world = new World(document.getDocumentElement());
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetNodeName() {
        World testWorld = this.world;
        assertThat(testWorld.getNodeName(), is("world"));
    }

    @Test
    public void testGetName() {
        World testWorld = this.world;
        assertThat(testWorld.getName(), is("world"));
    }

    @Test
    public void testGetContinents() {
        assertThat(world.getContinents().length, is(4));
    }
}
