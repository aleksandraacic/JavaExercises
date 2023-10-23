package Cars;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        List<Tocak> listaTockovaAudi = new ArrayList<Tocak>();
        listaTockovaAudi.add(new Tocak(70, 110));
        listaTockovaAudi.add(new Tocak(50, 110));
        listaTockovaAudi.add(new Tocak(30, 110));
        listaTockovaAudi.add(new Tocak(10, 110));

        Audi a3 = new Audi(listaTockovaAudi, 1998, 3000);

        a3.vratiOstecenje(listaTockovaAudi.get(1));

        Mercedes amg= new Mercedes(2015, 1000);
        BMW x6= new BMW(2020, 100000);


        List<Automobil> listaNekihAutomobila = new ArrayList<>();
        listaNekihAutomobila.add(amg);
        listaNekihAutomobila.add(x6);
        listaNekihAutomobila.add(a3);

        Salon salon = new Salon(listaNekihAutomobila);
        salon.vratiNajskuplji();
        salon.vratiNajstariji();










    }
}
