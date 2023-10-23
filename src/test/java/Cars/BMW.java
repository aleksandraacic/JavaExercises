package Cars;

import java.util.List;

public class BMW extends Automobil {
    public BMW(List<Tocak> listaTockova, int godisteAutomobila, double cenaAutomobila) {
        super(listaTockova, godisteAutomobila, cenaAutomobila);
    }

    public BMW(int godisteAutomobila, double cenaAutomobila) {
        super(godisteAutomobila, cenaAutomobila);
    }

    @Override
    public boolean vratiOstecenje(Tocak tocak) {
        if(tocak.getTrajanjeTocka() > 100) {
            return true;
        }
        return false;
    }

    @Override
    public int getCenuTockova() {
        return 100;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "godisteAutomobila=" + godisteAutomobila +
                ", cenaAutomobila=" + cenaAutomobila +
                '}';
    }
}
