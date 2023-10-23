package School;

import java.util.ArrayList;

public class Skola {
    ArrayList<Ucenik> ucenici;

    public Skola() {
    }

    public Skola(ArrayList<Ucenik> ucenici) {
        this.ucenici= ucenici;
    }

    public ArrayList<Ucenik> getUcenici() {
        return ucenici ;
    }

    public void setUcenici(ArrayList<Ucenik> ucenici) {
        this. ucenici= ucenici;
    }

    public String toString (){
        StringBuilder sb = new StringBuilder();
        for (Ucenik u: ucenici){
            sb.append(u.getImePrezime() + "\n");
        }
        return sb.toString();
    }

    public double vratitiProsekSvihUcenikaUtojGodini (int godinaSkolovanja){
        double prosek = 0.0;
        double zbirProsekaSvihUcenika = 0.0;
        int brojUcenikaUtojGodini = 0;
        for (Ucenik u: ucenici){
            if(u.getGodinaSkolovanja() == godinaSkolovanja){
                zbirProsekaSvihUcenika += u.izracunajProsek();
                brojUcenikaUtojGodini++;
            }
        }
        prosek = zbirProsekaSvihUcenika / brojUcenikaUtojGodini;
        return prosek;
    }

    public double vratiProsekSvihUcenikaIstogPredmeta (Predmet pr){
        double prosek = 0.0;
        double zbirProsekaSvihUcenikaDatogPredmeta = 0.0;
        int brojUcenikaDatogPredmeta = 0;
        for (Ucenik u: ucenici){
            if(u.getListaPredmeta().contains(pr.getNazivPredmeta())){
                zbirProsekaSvihUcenikaDatogPredmeta += u.izracunajProsek();
                brojUcenikaDatogPredmeta++;
            }
        }
        prosek = zbirProsekaSvihUcenikaDatogPredmeta / brojUcenikaDatogPredmeta;
        return prosek;
    }

    public Ucenik vratiUcenikaSaNajmanjimProsekom (){

        Ucenik ucenikSaNajmanjimProsekom = new Ucenik();
        double najmanjiProsek = Double.POSITIVE_INFINITY;
        for (Ucenik u: ucenici){
            if(u.izracunajProsek() < najmanjiProsek){
                najmanjiProsek = u.izracunajProsek();
                ucenikSaNajmanjimProsekom = u;
            }

        }
        return ucenikSaNajmanjimProsekom;
    }
}
