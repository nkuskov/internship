package sort05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nikol on 27.03.2017.
 */
public class CompareArrays {
    private static int compare(int[] arr_1, int[] arr_2){
        if (arr_1.length < arr_2.length) return -1;
        if (arr_1.length > arr_2.length) return 1;
        if (arr_1.length == arr_2.length) return 0;
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write your first array:");
        String line = reader.readLine();
        String[] stringArray_1 = line.split(" ");
        int[] arr_1 = new int[stringArray_1.length];
        System.out.println("Write your second array:");
        line = reader.readLine();
        String[] stringArray_2 = line.split(" ");
        int[] arr_2 = new int[stringArray_2.length];
        for (int i = 0; i < stringArray_1.length; i++) {
            arr_1[i] = Integer.parseInt(stringArray_1[i]);

        }

        for (int i = 0; i < stringArray_2.length; i++) {
            arr_2[i] = Integer.parseInt(stringArray_2[i]);
        }

        System.out.println("Result is: " + compare(arr_1,arr_2));
    }
}
