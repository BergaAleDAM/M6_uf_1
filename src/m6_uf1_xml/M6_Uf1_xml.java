package m6_uf1_xml;

import org.w3c.dom.Document;

public class M6_Uf1_xml {

    public static void main(String[] args) {
        
        
        GestioProducte gs = new GestioProducte("C:\\Users\\ALUMNEDAM\\Desktop\\medisina");
        Document dom =  gs.carregarFitxerADOM();
        
        
        
        
        
        
        
    }

}
