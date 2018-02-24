package cz.muni.fi.pb138.sem07;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author brossi
 */
public class XML {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {

        DOMParser domParser = new DOMParser("src/continent.xml", false, false);

        doMyXMLTransformations(domParser.getDocument());

        // ... TODO: if you need, you can add more methods here for transformations ...
        
        domParser.saveDocumentToFile("src/continent_out.xml");

    }

    /**
     * TODO: add here your transformations you can add also more methods like
     * this one
     */
    private static void doMyXMLTransformations(Document document) {

        //  Start by getting the root node from org.w3c.dom.Document
    
                
    }

}
