package arrays01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nikol on 24.03.2017.
 */
public class DigitsSum {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write char array: ");
        String line = reader.readLine();
        char[] charArray = line.toCharArray();
        int sum = 0;
        for (char ch : charArray){
            sum += Character.getNumericValue(ch);
        }
        System.out.println("Your sum is: " + sum);
    }
}
