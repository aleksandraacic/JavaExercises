package Exercises;

import java.util.Scanner;

public class D62_Aleksandra_Acic_ITBG17007 {
    public static void main(String[] args) {

        //Napraviti niz brojeva i kao rezultat vratiti sumu svih parnih brojeva iz tog niza.

        //Scanner sc = new Scanner(System.in);
        int [] niz= {1, 2, 3, 5, 6 ,7 ,8, 18,19,-5, -6};
        int zbir=0;

        for (int i = 0; i < niz.length ; i++) {
            int element= niz[i];
            System.out.println("Element: "+ element);
        }
        for (int i = 0; i < niz.length; i++) {
            int element = niz[i];
            if (element%2==0){
                zbir += element;
            }
        }
        System.out.println("Zbir parnih elemenata je: "+ zbir);

    }
}
