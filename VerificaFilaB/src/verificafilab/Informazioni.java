package verificafilab;

/**
 *
 * @author di_lella_andrea
 */

public class Informazioni {
    
    int anno=0;
    String regione="";
    int doc_e_docg=0;
    int igt=0;
    int daTavola = 0;

    public Informazioni() {
    }
    
    public Informazioni(int anno, String regione,int doc_e_docg,int igt,int daTavola){
        this.anno = anno;
        this.regione=regione;
        this.doc_e_docg=doc_e_docg;
        this.igt=igt;
        this.daTavola=daTavola;
    }
    

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getRegione() {
        return regione;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    public int getDoc_e_docg() {
        return doc_e_docg;
    }

    public void setDoc_e_docg(int doc_e_docg) {
        this.doc_e_docg = doc_e_docg;
    }

    public int getIgt() {
        return igt;
    }

    public void setIgt(int igt) {
        this.igt = igt;
    }

    public int getDaTavola() {
        return daTavola;
    }

    public void setDaTavola(int daTavola) {
        this.daTavola = daTavola;
    }
    
    
    
}
