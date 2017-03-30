package sort02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by nikol on 27.03.2017.
 */
public class Maximum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write your line of numbers");
        String line = reader.readLine();
        ArrayList<Integer> intList = new ArrayList<>();
        String[] stringArray = line.split(" ");
        for (String number: stringArray){
            intList.add(Integer.parseInt(number));
        }
        int maximum = 0;
        for(int i:intList){
            if (maximum<=i){
                maximum = i;
            }
        }

        System.out.println("Maximum of your arrayis: " + maximum);


    }
}
