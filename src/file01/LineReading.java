package file01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Created by Administrator on 24.03.2017.
 */
public class LineReading {



    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        String line;
        LinkedList<String> list = new LinkedList<>();
        while ((line = reader.readLine()) != null){
            list.add(line);
        }

        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.println(list.get(i));
        }

    }

}
