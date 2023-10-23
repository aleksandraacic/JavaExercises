package Exercises;

public class D83_Aleksandra_Acic_ITBG17007 {
    //Napraviti funkciju koja prima niz Stringova nekih imena i kao rezultat
    // vraca broj duplikata imena(Ukoliko ih ima).
    static int brojDuplikataUnizu(String[] s) {
        int brojDuplikata = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].equalsIgnoreCase(s[j])) {
                    brojDuplikata++;
                    break;
                }
            }
        }
        return brojDuplikata;
    }

}