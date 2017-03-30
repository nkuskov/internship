package string01;

import java.io.*;

/**
 * Created by Administrator on 24.03.2017.
 */

public class Checker {
    String s = "Hello World!";

    char chindex(int i){
        return s.charAt(i);
    }



    public static void main(String[] args) throws IOException {
        Checker ch = new Checker();
        System.out.println("Your String is: " + ch.s );
        System.out.println("Write index of character:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();



    int index = Integer.parseInt(str);


        System.out.println("Character with index: " + str + " is: " + ch.chindex(index));

    }
}


