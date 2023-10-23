package Mountaineers;

import java.util.ArrayList;
import java.util.List;

public class Rekreativac extends Planinar{
    public Rekreativac(String imePlaninara, List<Planina> listaPlanina, double maxVisinaZaPenjanje) {
        super(imePlaninara, listaPlanina, maxVisinaZaPenjanje);
        setMaxVisinaZaPenjanje(2000);
    }

    public Rekreativac() {
        super();
    }

    @Override
    public String getImePlaninara() {
        return super.getImePlaninara();
    }

    @Override
    public void setImePlaninara(String imePlaninara) {
        super.setImePlaninara(imePlaninara);
    }

    @Override
    public List<Planina> getListaPlanina() {
        return super.getListaPlanina();
    }

    @Override
    public void setListaPlanina(List<Planina> listaPlanina) {
        super.setListaPlanina(listaPlanina);
    }

    @Override
    public double getMaxVisinaZaPenjanje() {
        return super.getMaxVisinaZaPenjanje();
    }

    @Override
    public void setMaxVisinaZaPenjanje(double maxVisinaZaPenjanje) {
        super.setMaxVisinaZaPenjanje(maxVisinaZaPenjanje);
    }

    @Override
    public void popniSe(Planina p) {

        for (Planina planina: getListaPlanina()) {
            if(!(getListaPlanina().contains(p)) && p.getVisinaPlanine()<=getMaxVisinaZaPenjanje()){
                getListaPlanina().add(p);
            }
        }

    }

    @Override
    public List crnaLista() {
        List<Planina> crnaLista= new ArrayList<>();
        for (Planina planina:getListaPlanina()) {
            if(getMaxVisinaZaPenjanje() < planina.getVisinaPlanine()){
                crnaLista.add(planina);
            }
        }
        return crnaLista;
    }

    @Override
    public double ukupnoMetara() {
        double sum=0;
        for (Planina p: getListaPlanina()) {

            if (p.getVisinaPlanine()<= getMaxVisinaZaPenjanje()){
                sum+=p.getVisinaPlanine();
            }

        }
        return sum;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
