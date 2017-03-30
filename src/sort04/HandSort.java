package sort04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by nikol on 27.03.2017.
 */
public class HandSort {
    private static int[] sortMerge(int[] arr){
        int len = arr.length;
        if(len < 2) return arr;
        int middle = len/2;
        return merge(sortMerge(Arrays.copyOfRange(arr,0,middle)), sortMerge(Arrays.copyOfRange(arr,middle,len)));

    }

    private static int[] merge(int[] arr_1, int[] arr_2){
        int len_1 = arr_1.length,
            len_2 = arr_2.length;
        int a = 0,
            b = 0,
            len = len_1+len_2;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            if(b < len_2 && a < len_1){
                if(arr_1[a] > arr_2[b]){
                    result[i] = arr_2[b++];

                }
                else result[i] = arr_1[a++];
            }
            else if(b<len_2){
                result[i] = arr_2[b++];
            }
            else if(a<len_1){
                result[i] = arr_1[a++];
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write your line of numbers");
        String line = reader.readLine();
        String[] stringArray = line.split(" ");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);

        }

        for (int i : sortMerge(intArray)){
            System.out.printf(i + "\t");
        }

    }
}
