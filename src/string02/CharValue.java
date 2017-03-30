package string02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 24.03.2017.
 */
public class CharValue {


    public static void main(String[] args) throws IOException {
        System.out.println("Write your String: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println("Write sequence of char values: ");
        String ch = reader.readLine();
        if(s.contains(ch)){
            System.out.println("Your String:\"" + s + "\" contains chars sequence:\"" + ch +"\"");
        }
        else {
            System.out.println("Your String:\"" + s + "\" doesn't contain chars sequence:\"" + ch +"\"");
        }

    }
}
