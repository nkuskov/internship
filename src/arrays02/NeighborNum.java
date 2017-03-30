package arrays02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nikol on 25.03.2017.
 */
public class NeighborNum {

    final static int indexof(int[] intArray){
        int min = 9;
        int index = 0;
        for (int i = 0; i < intArray.length-1; i++) {
                int distance = Math.abs(intArray[i]-intArray[i+1]);
                if (distance<=min){
                    min = distance;
                    index = i;
                }


        }

        return index;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write your array:");
        String line = reader.readLine();
        char[] charArray;
        int[] intArray;
        charArray = line.toCharArray();
        intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
        }

        System.out.println(indexof(intArray));


    }
}
