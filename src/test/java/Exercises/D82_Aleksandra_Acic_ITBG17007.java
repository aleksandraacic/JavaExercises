package Exercises;

public class D82_Aleksandra_Acic_ITBG17007 {
    //2.Napraviti funkciju koja prima dva niza celih brojeva jednake duzine i
    // kao rezultat vraca zbir svih elemenata na istoj poziciji.
    static int racunanjeZbiraElNaIstimPoz (int[]a, int[]b){
        int i=0;
        int rezultat = a[i] + b[i];
        if(a.length==b.length){
            for (i = 0; i < a.length; i++) {
                System.out.println("element prvog: " + a[i] + " " + "element drugog: " + b[i]);
            }
        }else {
            System.out.println("nizovi nisu jednake duzine");
        }
        for (int j = 0; j < a.length ; j++) {
            rezultat = a[j] + b[j];
            System.out.println(rezultat);

        }
        return rezultat;

    }

    public static void main(String[] args) {
        int [] a={10, 2, 3, 4, 2};
        int [] b={9, 7, 4, 9, 5};
        racunanjeZbiraElNaIstimPoz(a,b);
    }

}
