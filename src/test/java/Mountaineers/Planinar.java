package Mountaineers;

import java.util.ArrayList;
import java.util.List;

public abstract class Planinar {

    /*
    * Kreirati apstraktnu klasu Planinar koja ima atribute za ime planinara, listu planina i maksimalnu visinu
* na koju planinar moze da se popne. Ova klasa takodje ima metode:
-popniSe(Planina p) - Ukoliko planina nije previse visoka za planinara i nije u njegovoj listi, dodati je.
-crnaLista() - Vraca listu planina iz planinarovog spiska, na koje on ne moze da se popne.
-ukupnoMetara() - Vraca ukupnu visinu svih planina na koje se planinar popeo.
    *
    * */
    private String imePlaninara;
    private List<Planina> listaPlanina;
    private double maxVisinaZaPenjanje;

    public Planinar(String imePlaninara, List<Planina> listaPlanina, double maxVisinaZaPenjanje) {
        this.imePlaninara = imePlaninara;
        this.listaPlanina = listaPlanina;
        this.maxVisinaZaPenjanje = maxVisinaZaPenjanje;
    }

    public Planinar() {
    }

    public String getImePlaninara() {
        return imePlaninara;
    }

    public void setImePlaninara(String imePlaninara) {
        this.imePlaninara = imePlaninara;
    }

    public List<Planina> getListaPlanina() {
        return listaPlanina;
    }

    public void setListaPlanina(List<Planina> listaPlanina) {
        this.listaPlanina = listaPlanina;
    }

    public double getMaxVisinaZaPenjanje() {
        return maxVisinaZaPenjanje;
    }

    public void setMaxVisinaZaPenjanje(double maxVisinaZaPenjanje) {
        this.maxVisinaZaPenjanje = maxVisinaZaPenjanje;
    }


    public abstract void popniSe(Planina p);

    public abstract List crnaLista();

     public abstract double ukupnoMetara();



    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append(imePlaninara).append(" ").append(maxVisinaZaPenjanje).append("\n");
       sb.append(listaPlanina);
       return sb.toString();
    }
}
