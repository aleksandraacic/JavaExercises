package Exercises;

import java.util.Scanner;

public class D53_Aleksandra_Acic_ITBG17007 {

    public static void main(String[] args) {
        //Napraviti program gde cete unositi neki tekst sve dok se ne unese tacka("."),
        // cim se unese tacka program se zavrsava i vraca prethodno unete tekstove.

        Scanner sc = new Scanner(System.in);
        String tekst2="";


        while (true){
            String tekst = sc.nextLine();

            if (tekst.equals("."))
                break;

           tekst2 = tekst2.concat(" " + tekst);
        }
        System.out.println(tekst2);

        }











    }




    

