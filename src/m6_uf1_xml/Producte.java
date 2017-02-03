package m6_uf1_xml;


public class Producte {

    int codi;
    String nom;
    double preu;
    int unitats;

    public Producte(int codi, String nom, double preu, int unitats) {
        this.codi = codi;
        this.nom = nom;
        this.preu = preu;
        this.unitats = unitats;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public int getUnitats() {
        return unitats;
    }

    public void setUnitats(int unitats) {
        this.unitats = unitats;
    }
    
    

    
}
