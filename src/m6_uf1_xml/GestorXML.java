package m6_uf1_xml;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;


public abstract class GestorXML<T> {

    protected File fitxerXML;

    public GestorXML(String ruta) {

        this.fitxerXML = new File(ruta);

    }

    public Document desarDocument(Document doc) throws TransformerException {
        Transformer trns = TransformerFactory.newInstance().newTransformer();
        StreamResult result = new StreamResult(fitxerXML);
        DOMSource source = new DOMSource(doc);
         
        trns.transform(source, result);
        
        return doc;
    }

    ;
            
    public Document cargar() throws ParserConfigurationException, SAXException, IOException {

        DocumentBuilderFactory docBuFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(fitxerXML);
        return doc;
    }

    //los dos de arriba se hacen aqui porque son independientes
    public abstract void afegirObjecte();

    public abstract T cercarPerCodi(int codigo);

    //               modificar i eliminiar
}
