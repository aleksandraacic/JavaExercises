package Exercises;

import java.util.Scanner;

public class D72_Aleksandra_Acic_ITBG17007 {

    //Napisati funkciju koja ce primiti niz celih brojeva, i broj koji zelimo da lociramo unutar tog niza.
    // Ukoliko prolaskom kroz niz naidjemo na pogresan broj, ispisati poruku da je pogresan element,
    // cim naidjemo na zadati element,
    // ispisati poruku da je pronadjen i zavrsiti funkciju
    // (Cim naidje na taj element, ne treba da ga trazi dalje).
    static int lociranjeBroja (int[]niz, int brojKojiZelisDaLociras){


        for (int i = 0; i < niz.length; i++) {
            if (niz[i]==brojKojiZelisDaLociras){
                System.out.println("Element se nalazi u nizu!");
                break;
            } else if (niz[i]!= brojKojiZelisDaLociras) {
                System.out.println("Pogresan element!");

            }

        }
        return niz[6];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int[]niz={3,4,5,6,7,45,5};

       for (int i = 0; i < niz.length; i++) {

            System.out.println("Element "+i + ": " + niz[i]);
        }
        //System.out.println("Unesite broj iz niza koji zelite da locirate: ");
        int brojKojiZelisDaLociras= 5;
        lociranjeBroja(niz, brojKojiZelisDaLociras);




    }
}
