package Cars;

import java.util.List;

public abstract class  Automobil {
    protected List<Tocak> listaTockova;
    protected int godisteAutomobila;
    protected double cenaAutomobila;

    public Automobil(List<Tocak> listaTockova, int godisteAutomobila, double cenaAutomobila) {
        this.listaTockova = listaTockova;
        this.godisteAutomobila = godisteAutomobila;
        this.cenaAutomobila = cenaAutomobila;
    }

    public Automobil(int godisteAutomobila, double cenaAutomobila) {
        this.godisteAutomobila = godisteAutomobila;
        this.cenaAutomobila = cenaAutomobila;
    }

    public Automobil() {
    }

    public List<Tocak> getListaTockova() {
        return listaTockova;
    }

    public void setListaTockova(List<Tocak> listaTockova) {
        this.listaTockova = listaTockova;
    }

    public int getGodisteAutomobila() {
        return godisteAutomobila;
    }

    public void setGodisteAutomobila(int godisteAutomobila) {
        this.godisteAutomobila = godisteAutomobila;
    }

    public double getCenaAutomobila() {
        return cenaAutomobila;
    }

    public void setCenaAutomobila(double cenaAutomobila) {
        this.cenaAutomobila = cenaAutomobila;
    }
    public abstract boolean vratiOstecenje(Tocak tocak);
    public int cenaTockova(Tocak tocak) {
        return getListaTockova().size() * getCenuTockova();
    }

    public abstract int getCenuTockova();

    public void zameniTocak() {
        for (Tocak tocak: getListaTockova() ) {
            if(vratiOstecenje(tocak)) {
                getListaTockova().remove(tocak);
                Tocak noviTocak= new Tocak(0, getCenuTockova());
                getListaTockova().add(noviTocak);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("Lista tockova: ").append(listaTockova).append("\n");
        sb.append("Godiste automobila: ").append(godisteAutomobila).append("\n");
        sb.append("Cena automobila: ").append(cenaAutomobila);
        return sb.toString();
    }
}
