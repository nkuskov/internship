package file03;

import java.io.*;

/**
 * Created by Administrator on 24.03.2017.
 */
public class FileCopy {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write name of file1: ");
        String file1 = reader.readLine();
        System.out.println("Write name of file2: ");
        String file2 = reader.readLine();
        BufferedReader readf = new BufferedReader(new FileReader(file1));
        BufferedWriter writef = new BufferedWriter(new FileWriter(file2));
        String line;
        try {
            while ((line = readf.readLine())!=null){
                writef.write(line);
                writef.newLine();

            }
            readf.close();
            writef.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }

    }
}
