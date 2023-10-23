package Exercises;

import java.util.Scanner;

public class D4_Aleksandra_Acic_ITBG17007 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1.Zadatak

       /* System.out.println("Unesite broj vasih godina: ");
        int brojGodina = sc.nextInt();

        if (brojGodina >= 18) {
            System.out.println( "Punoletni ste i smete da konzumirate alkohol.");
        } else {
            System.out.println("Nije Vam dozvoljeno da konzumirate alkohol jer imate manje od 18 god.");
        }


        // 2.Zadatak

        System.out.println( "Unesite neki ceo broj: ");
        int broj = sc.nextInt();



        if (broj % 2 == 0) {
            broj++;
            System.out.println("Neparan: " + broj );
        } else {
            System.out.println("Uneli ste neparan broj.");
        }

         //ili

        switch ( broj % 2 ) {
            case 0:
                broj++;
                System.out.println("Neparan: " + broj );
                break;
            case 1:
                System.out.println( "Broj koji ste uneli je neparan.");
                break;
        }


        // 3.Zadatak*/

        System.out.println( "Unesite dva realna broja: ");
        double prviBroj = sc.nextDouble();
        double drugiBroj = sc.nextDouble();
        sc.nextLine();

        System.out.println( "Unesite naziv operacije koju zelite da izvrsite nad unetim brojevima (sabiranje, oduzimanje, mnozenje, deljenje): ");
        String operacija = sc.nextLine();


        switch (operacija) {
            case "sabiranje":
                System.out.println( "Zbir dva uneta broja je: " + ( prviBroj + drugiBroj ) );
                break;
            case "oduzimanje":
                System.out.println( "Razlika dva uneta broja je: " + ( prviBroj - drugiBroj ) );
                break;
            case "mnozenje":
                System.out.println( "Proizvod dva uneta broja je: "+ ( prviBroj * drugiBroj ) );
                break;
            case "deljenje":
                    System.out.println( "Kolicnik dva uneta broja je: "+ ( prviBroj / drugiBroj ) );
                break;
        }
        // ili
        switch (operacija) {
            case "sabiranje":
                System.out.println( "Zbir dva uneta broja je: " + ( prviBroj + drugiBroj ) );
                break;
            case "oduzimanje":
                System.out.println( "Razlika dva uneta broja je: " + ( prviBroj - drugiBroj ) );
                break;
            case "mnozenje":
                System.out.println( "Proizvod dva uneta broja je: "+ ( prviBroj * drugiBroj ) );
                break;
            case "deljenje":
                if (drugiBroj == 0) {
                    System.out.println("Uneli ste nulu i nije moguce izvrsiti deljenje. Unesite drugi broj.");
                } else {
                    System.out.println( "Kolicnik dva uneta broja je: "+ ( prviBroj / drugiBroj ) );}
                break;
        }


    }
}
