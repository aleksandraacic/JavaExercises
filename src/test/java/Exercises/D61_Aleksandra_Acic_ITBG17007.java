package Exercises;

import java.util.Scanner;

public class D61_Aleksandra_Acic_ITBG17007 {
    public static void main(String[] args) {
        //Napraviti niz brojeva kroz koji cete proci i istampati samo neparne brojeve.
        Scanner sc = new Scanner(System.in);
        int [] niz= {1,2 ,3, 4, 5, 6,7 ,8, 9, -1,-4};


        for (int i = 0; i < niz.length ; i++) {
            int element=niz[i];
            System.out.println("Element: "+element);
        }

        for ( int i = 0; i < niz.length; i++) {

            int element=niz[i];

            if (element%2!=0 && (element>0 || element<0)){

                System.out.println("Neparan broj: "+ element);
            }


        }

    }
}
