package Exercises;

import java.util.Scanner;

public class D52_Aleksandra_Acic_ITBG17007 {
    public static void main(String[] args) {
        //2.Napraviti program koji ce za uneti ceo broj vratiti njegov faktorijel (3! = 3*2*1).
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj i izracunajte njegov faktorijel: ");

        int broj=sc.nextInt();
        int faktorijel= 1;
        for (int i = 1; i <= broj ; i++) {

            faktorijel = faktorijel *i;
        }
        System.out.println("Faktorijel unetog broja je: "+ faktorijel);


    }
}
