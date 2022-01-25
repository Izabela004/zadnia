
package okrag;


public class NewClass {
    public int punkt;
    public int promien;
    double powierzchnia, srednica, wsrodku;

    public NewClass(int punkt, int promien, double powierzchnia, double srednica, double wsrodku) {
        this.punkt = punkt;
        this.promien = promien;
        this.powierzchnia = powierzchnia;
        this.srednica = srednica;
        this.wsrodku = wsrodku;
    }



    public int getPromien() {
        return promien;
    }

    public double getPowierzchnia() {
        return powierzchnia = (2*3.14*promien);
    }

    public double setSrednica() {
        return srednica = 2*promien;
        
    }
    
    public boolean isPunkt(){
    if (punkt <= promien)
            return true;
        else 
            return false;
    }
    
    
}

