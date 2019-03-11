package verificafilab;

/*
1) chiedere all’utente anno e regione per visualizzare tutte le informazioni presenti.
2) Chiedere all’utente l’anno , visualizzare il totale di Vino da tavola prodotto in italia.
3)in tutto il documento quale regione ha prodotto piu’ I.G.T.
4)Quale regione ,in tutto il documento ha il Totale maggiore
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author di_lella_andrea
 */

public class VerificaFilaB {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int scelta = -1;
        Scanner tastiera = new Scanner(System.in);
        
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        Parser dom = new Parser("100592_Produzione-di-vino-per-marchio-di-qualita--.xml");
        List<Informazioni> lista = null;
        
        try {
            while(scelta!=0){
            System.out.println("1)Visualizza informazioni");
            System.out.println("2)visualizzare il totale di Vino");
            System.out.println("3)regione ha prodotto piu’ I.G.T");
            System.out.println("4)Quale regione ,in tutto il documento ha il Totale maggiore");
            System.out.println("0)Esci");
            
            scelta = tastiera.nextInt();
            switch(scelta){
                case 1:
                    System.out.println("inserisci anno");
                    int anno = tastiera.nextInt();
                    System.out.println("inserisci regione");
                    String regione = tastiera.next();
                    lista = dom.parseDocument(anno,regione);
                    
                    for(Informazioni i : lista){
                        System.out.print(i.getAnno());
                        System.out.print(i.getRegione());
                        System.out.print(i.getDoc_e_docg());
                        System.out.print(i.getIgt());
                        System.out.print(i.getDaTavola());
                    }
                    break;
                case 2:
                    System.out.println("inserisci anno");
                    int anno1 = tastiera.nextInt();
                    int tot = dom.parseTotale(anno1);
                    System.out.println("il totale da tavola per l'anno " + anno1 + " è " + tot);
                    break;
                case 3:
                    String regioneMaggiore = dom.RegioneProduttiva();
                    System.out.println("la regione che ha prodotto piu igp è" + regioneMaggiore);
                    break;
                case 4:
                    

                    break;    
                case 0:
                    break;
                default:
                    System.out.println("Scelta effettuata inesistente"); 
            }
        }
        } catch (Exception e) {
        }
    }
}
