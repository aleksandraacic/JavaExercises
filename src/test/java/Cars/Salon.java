package Cars;

import java.util.List;

public class Salon {
    protected List<Automobil> listaAutomobila;

    public Salon(List<Automobil> listaAutomobila) {
        this.listaAutomobila = listaAutomobila;
    }

    public Salon() {
    }

    public List<Automobil> getListaAutomobila() {
        return listaAutomobila;
    }

    public void setListaAutomobila(List<Automobil> listaAutomobila) {
        this.listaAutomobila = listaAutomobila;
    }
    public Automobil vratiNajstariji() {
        Automobil najstarijiAuto = listaAutomobila.get(0);
        for (Automobil automobil:listaAutomobila) {
            if (automobil.getGodisteAutomobila() < najstarijiAuto.getGodisteAutomobila()){
                najstarijiAuto = automobil;
            }
        }
        return najstarijiAuto;
    }
    public Automobil vratiNajskuplji() {
        Automobil najskupljiAuto = listaAutomobila.get(0);
        for (Automobil automobil:listaAutomobila) {
            if (automobil.getCenaAutomobila() > najskupljiAuto.getCenaAutomobila()){
                najskupljiAuto = automobil;
            }
        }
        return najskupljiAuto;
    }

    @Override
    public String toString() {
        return "Salon{" +
                "listaAutomobila=" + listaAutomobila +
                '}';
    }
}
