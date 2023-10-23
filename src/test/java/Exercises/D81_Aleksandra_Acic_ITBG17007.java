package Exercises;

import java.util.Scanner;

public class D81_Aleksandra_Acic_ITBG17007 {

    //1.Napraviti funkciju koja prima dva niza celih brojeva i proverava da li su jednaki.

    static void daLiSuJednakiNizovi(int[] a, int[] b) {
        if (a.length != b.length) {
            System.out.println("nizovi nisu jednaki");
            return;
        }
        boolean brojeviSuJednaki = true;
        for (int i = 0; i < a.length; i++) {
            System.out.println("element prvog: " + a[i] + " " + "element drugog: " + b[i]);

            if (a[i] != b[i]) {
                brojeviSuJednaki = false;
            }
        }

        if (brojeviSuJednaki) {
            System.out.println("nizovi su jednaki");
        } else {
            System.out.println("nizovi nisu jednaki");
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 8, 4, 5};
        int[] b = {1, 2, 3, 4, 5};
        daLiSuJednakiNizovi(a, b);
    }
}
