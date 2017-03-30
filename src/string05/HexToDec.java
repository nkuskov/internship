package string05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 24.03.2017.
 */
public class HexToDec {

    String hexa = "0123456789abcdef";


    int toDec(String s){
        int dec = 0;
        s = new StringBuilder(s).reverse().toString();
        char[] string = (s.toLowerCase().trim()).toCharArray();
        for (int i = 0; i < s.length(); i++) {
            dec += Math.pow(16,i)*hexa.indexOf(string[i]);


        }

        return dec;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write your hexadecimal String:");
        String hexadecimalString = reader.readLine();
        HexToDec hexToDec = new HexToDec();
        System.out.println("Your String in decimal form is: " + hexToDec.toDec(hexadecimalString));
    }
}
