package string04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 24.03.2017.
 */
public class AnagramChecker {
    String s1 = null;
    String s2 = null;
    AnagramChecker(String s1, String s2){
        this.s1 = s1;
        this.s2 = s2;
    }



    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    int product(String s){
        char [] ch =s.toCharArray();
        int prod = 1;
        for (char c: ch){
            prod *= (alphabet.indexOf(c)+1);
        }
        return prod;
    }

    boolean check(){
        s1 = s1.toLowerCase().trim();
        s2 = s2.toLowerCase().trim();
        return product(s1)==product(s2);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write your String: ");
        String s1 = reader.readLine();
        System.out.println("Write Anagram: ");
        String s2 = reader.readLine();

        AnagramChecker anagramChecker = new AnagramChecker(s1,s1);

        if (anagramChecker.check()){
            System.out.println("Your String and Anagram are equals!!");
        }


    }
}
