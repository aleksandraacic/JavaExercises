package Cars;

import java.util.List;

public class Audi extends Automobil{
    public Audi(List<Tocak> listaTockova, int godisteAutomobila, double cenaAutomobila) {
        super(listaTockova, godisteAutomobila, cenaAutomobila);
    }

    public Audi(int godisteAutomobila, double cenaAutomobila) {
        super(godisteAutomobila, cenaAutomobila);
    }

    @Override
    public boolean vratiOstecenje(Tocak tocak) {
        if(tocak.getTrajanjeTocka() > 60) {
           return true;
        }
        return false;
    }

    @Override
    public int getCenuTockova() {
        return 110;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "godisteAutomobila=" + godisteAutomobila +
                ", cenaAutomobila=" + cenaAutomobila +
                '}';
    }
}
