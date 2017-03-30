package arrays04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/**
 * Created by nikol on 27.03.2017.
 */
public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write your line of numbers");
        int average = 0;
        String line = reader.readLine();
        ArrayList<Integer> intList = new ArrayList<>();
        String[] stringArray = line.split(" ");
        for (String number: stringArray){
            intList.add(Integer.parseInt(number));
        }

        for (Integer number: intList){
            average += number;

        }
        System.out.println("Your average is: " + average/intList.size());

    }
}
