package Cars;

import java.util.List;

public class Mercedes extends Automobil{
    public Mercedes(List<Tocak> listaTockova, int godisteAutomobila, double cenaAutomobila) {
        super(listaTockova, godisteAutomobila, cenaAutomobila);
    }

    public Mercedes(int godisteAutomobila, double cenaAutomobila) {
        super(godisteAutomobila, cenaAutomobila);
    }

    public Mercedes() {
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
        return 120;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "godisteAutomobila=" + godisteAutomobila +
                ", cenaAutomobila=" + cenaAutomobila +
                '}';
    }
}
