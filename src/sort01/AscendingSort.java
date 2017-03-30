package sort01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nikol on 27.03.2017.
 */
public class AscendingSort {

    final static void sorting(int a, int b, int c){
        int d;
        if(a>=b){
            d=b;
            b=a;
            a=d;
        }
        if(a>=c){
            d=c;
            c=a;
            a=d;
        }
        if(b>=c){
            d=c;
            c=b;
            b=d;
        }

        System.out.println(a+ "\t" + b + "\t" + c);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write three numbers:");
        System.out.printf("a: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.printf("b: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.printf("c: ");
        int c = Integer.parseInt(reader.readLine());

        sorting(a,b,c);
    }
}
