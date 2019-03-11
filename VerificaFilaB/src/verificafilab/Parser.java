package verificafilab;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author di_lella_andrea
 */

public class Parser {
    private List<Informazioni> informazione;
    String file;
    
    public Parser() {
        informazione = new ArrayList();
        file = "";
    }
    
    public Parser(String file){
        this.file = file;
        informazione = new ArrayList();
    }
    
    public List<Informazioni> parseDocument(int annoInserito,String regioneInserita)
            throws ParserConfigurationException, SAXException, IOException {
        List<Informazioni> lista = new ArrayList();
       
        valorizzaLista();
        for(Informazioni i : informazione){
            if(i.regione.equals(regioneInserita)){
                if(i.anno == annoInserito){
                    lista.add(i);
                }
            }
        }
        return lista;
    }
    
    public int parseTotale(int annoInserito)
            throws ParserConfigurationException, SAXException, IOException {
        int tot =0;
       
        valorizzaLista();
        for(Informazioni i : informazione){
            if(annoInserito==i.anno){
                tot = tot + i.daTavola;
            }
        }
        return tot;
    }
    
    public String RegioneProduttiva(){
        String nome="";
        for(Informazioni i : informazione){

        }
        return nome;
    }
    
    
       public void valorizzaLista()
            throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory;
        DocumentBuilder builder;
        Document document;
        Element root, element;
        NodeList nodelist;
        
        // creazione dell’albero DOM dal documento XML
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse(file);
        root = document.getDocumentElement();
        
        int anno=0;
        String regione="";
        int doc_e_docg=0;
        int igt=0;
        int daTavola=0;
        
        nodelist = root.getElementsByTagName("rows");
        
        if(nodelist != null && nodelist.getLength() > 0){
            for (int i = 0; i < nodelist.getLength(); i++) {
                element = (Element) nodelist.item(i);
                NodeList nl = element.getElementsByTagName("row");
                if(nl != null && nl.getLength() > 0){
                    for(int o = 0; o < nl.getLength(); o++){
                        element = (Element)nl.item(o);
                        if(!element.getTextContent().equals(null)){
                            switch(o){
                                case 0:
                                    anno = Integer.parseInt(element.getTextContent());
                                    break;
                                case 1:
                                    regione = element.getTextContent();
                                    break;
                                case 2:
                                    doc_e_docg = Integer.parseInt(element.getTextContent());
                                    break;
                                case 3:
                                    igt = Integer.parseInt(element.getTextContent());
                                    break;
                                case 4:
                                    daTavola = Integer.parseInt(element.getTextContent());
                            }
                        }
                    }
                    Informazioni info = new Informazioni(anno, regione, doc_e_docg, igt, daTavola);
                    informazione.add(info);
                }
            }
        }
        
    }
}
