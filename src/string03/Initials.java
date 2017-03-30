package string03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 24.03.2017.
 */
public class Initials {


    public static void main(String[] args) throws IOException {
        System.out.println("Write your full name: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fullname = reader.readLine();
        String[] splitedname = fullname.split(" ");
        StringBuilder initials = new StringBuilder();
        for(String str : splitedname){

            initials.append(str.charAt(0));
        }
        System.out.println("Your initials are: " + initials.toString());
    }
}
