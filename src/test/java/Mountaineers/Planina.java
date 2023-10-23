package Mountaineers;

public class Planina {
    private String nazivPlanine;
    private  double visinaPlanine;

    public Planina(String nazivPlanine, double visinaPlanine) {
        this.nazivPlanine = nazivPlanine;
        this.visinaPlanine = visinaPlanine;
    }

    public Planina() {
    }

    public String getNazivPlanine() {
        return nazivPlanine;
    }

    public void setNazivPlanine(String nazivPlanine) {
        this.nazivPlanine = nazivPlanine;
    }

    public double getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(double visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(nazivPlanine).append(" ").append(visinaPlanine);
        return sb.toString();
    }
}
