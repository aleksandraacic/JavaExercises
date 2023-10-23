package Cars;

public class Tocak {
    private int trajanjeTocka;
    private int cenaTocka;

    public Tocak(int trajanjeTocka, int cenaTocka) {
        this.trajanjeTocka = trajanjeTocka;
        this.cenaTocka = cenaTocka;
    }

    public Tocak() {
    }

    public int getTrajanjeTocka() {
        return trajanjeTocka;
    }

    public void setTrajanjeTocka(int trajanjeTocka) {
        this.trajanjeTocka = trajanjeTocka;
    }

    public int getCenaTocka() {
        return cenaTocka;
    }

    public void setCenaTocka(int cenaTocka) {
        this.cenaTocka = cenaTocka;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trajanje tocka: ").append(trajanjeTocka).append("\n");
        sb.append("Cena tocka: ").append(cenaTocka);
        return sb.toString();

    }
}
