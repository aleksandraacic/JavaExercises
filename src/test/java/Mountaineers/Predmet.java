package Mountaineers;

public class Predmet {
    int ocena;
    String nazivPredmeta;

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public Predmet(int ocena, String nazivPredmeta) {
        this.ocena = ocena;
        this.nazivPredmeta = nazivPredmeta;
    }

    public Predmet() {
    }
}
