package arrays03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nikol on 25.03.2017.
 */
public class MultiTable {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write a number for multiplication table:");
        int number = Integer.parseInt(reader.readLine());
        for (int i = 1; i < number+1; i++) {
            for (int j = 1; j < number+1; j++) {
                System.out.printf(i*j+"\t");
            }
            System.out.printf("\n");
        }
    }
}
