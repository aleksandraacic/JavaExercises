package Exercises;

import java.util.Scanner;

public class D71_Aleksandra_Acic_ITBG17007 {
    //Napisati funkciju koja ce za prosledjeni String da vrati
    // broj samoglasnika u tom Stringu (Koristiti .charAt(index) da
    // pristupite svakom pojedinacnom karakteru iz Stringa).
    static int kolikoSamoglasnika (String unesenaRec){
        int brojSamoglasnika=0;

        for (int i = 0; i <unesenaRec.length() ; i++) {

           if (unesenaRec.charAt(i)=='a'|| unesenaRec.charAt(i)=='A'){
               brojSamoglasnika++;
           } else if (unesenaRec.charAt(i)=='e'|| unesenaRec.charAt(i)=='E') {
               brojSamoglasnika++;
           } else if (unesenaRec.charAt(i)=='i' || unesenaRec.charAt(i)=='I') {
               brojSamoglasnika++;
           }else if (unesenaRec.charAt(i)=='o' || unesenaRec.charAt(i)=='O'){
               brojSamoglasnika++;
           }else if (unesenaRec.charAt(i)=='u' || unesenaRec.charAt(i)=='U' ){
               brojSamoglasnika++;
           }
        }

        return brojSamoglasnika;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite rec koju zelite: ");

        String unesenaRec= sc.nextLine();
        int ukupanBrojSamoglasnika= kolikoSamoglasnika(unesenaRec);



        System.out.println("Broj samoglasnika u unetoj reci je: "+ ukupanBrojSamoglasnika);


    }
}
