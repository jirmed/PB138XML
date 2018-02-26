/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pb138.sem07;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author jirka
 */
public abstract class PartTestAbstract {
    
    protected static Document document;
    private Document originalDocument;

    @Before
    public void setUp() throws ParserConfigurationException, SAXException, IOException {
        DOMParser domParser = new DOMParser("src/continent.xml", false, false);
        document = domParser.getDocument();
    }

    @Test
    public abstract void testGetNodeName();

    @Test
    public abstract void testGetName();
    
}
