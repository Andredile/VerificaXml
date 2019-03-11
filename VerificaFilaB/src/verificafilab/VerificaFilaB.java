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
            System.out.println("1)Visualizza inforomazioni");
            System.out.println("2)visualizzare il totale di Vino");
            System.out.println("3)regione ha prodotto piu’ I.G.T");
            System.out.println("4)Quale regione ,in tutto il documento ha il Totale maggiore");
            System.out.println("0)Esci");
            
            scelta = tastiera.nextInt();
            switch(scelta){
                case 1:
                    System.out.println("inserisci giorno");

                    break;
                case 2:
                    System.out.println("inserisci il nome del prof");

                    break;
                case 3:
                    System.out.println("inserisci il nome del prof");

                    break;
                case 4:
                    System.out.println("inserisci il nome del prof");

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
