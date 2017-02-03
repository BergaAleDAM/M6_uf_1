package m6_uf1_xml;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class GestioProducte extends GestorXML<Producte> {

    private File archivito;
    //C:\\Users\\ALUMNEDAM\\Desktop\\medisina

    public GestioProducte(String ruta) {
        super(ruta);

        archivito = new File(ruta);
        System.out.println(ruta.length());

    }

    @Override
    public Producte cercarPerCodi(int codigo) {

        try {
            Document doc = cargar();
            NodeList nl = doc.getElementsByTagName("codi");

            for (int i = 0; i < nl.getLength(); i++) {
                Node node = nl.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) node;
                    if (e.getAttribute("codi").equals(String.valueOf(codi))) {
                        String nom = GestioDocuments.getValue("nom", e);
                        String cognom = GestioDocuments.getValue("cognom", e);
                        per = new Persona(codi, nom, cognom);
                        break;
                    }
                }

            }catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(GestioProducte.class.getName()).log(Level.SEVERE, null, ex);
        }

        }

    }
