package School;

import java.util.ArrayList;

public class Ucenik {
    String imePrezime;
    ArrayList<Predmet> listaPredmeta;
    int godinaSkolovanja;

    public Ucenik() {
    }

    public Ucenik(ArrayList<Predmet> listaP, int godinaS) {
        this.listaPredmeta = listaP;
        this.godinaSkolovanja = godinaS;
    }

    public Ucenik(ArrayList<Predmet> listaP, int godinaS, String iP) {
        this.listaPredmeta = listaP;
        this.godinaSkolovanja = godinaS;
        this.imePrezime = iP;
    }
    public ArrayList<Predmet> getListaPredmeta() {
        return listaPredmeta;
    }

    public int getGodinaSkolovanja() {
        return godinaSkolovanja;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setListaPredmeta(ArrayList<Predmet> listaP) {
        this.listaPredmeta = listaP;
    }

    public void setGodinaSkolovanja(int godinaS) {
        this.godinaSkolovanja = godinaS;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.imePrezime + "\n");
        sb.append(this.godinaSkolovanja + "\n");
        for (Predmet p: listaPredmeta){
            sb.append(p.toString() + "\n");

        }
        return sb.toString();
    }

    public double izracunajProsek (){
        double prosek = 0.0;
        int zbir = 0;
        for (Predmet element: listaPredmeta) {
            zbir += element.getOcena();
        }
        prosek = zbir/listaPredmeta.size();
        return prosek;}
}
