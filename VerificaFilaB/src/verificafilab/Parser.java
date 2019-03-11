package verificafilab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author di_lella_andrea
 */
public class Parser {
    private List<Informazioni> info;
    String file;
    
    public Parser() {
        info = new ArrayList();
        file = "";
    }
    
    public Parser(String file){
        this.file = file;
        info = new ArrayList();
    }
}
