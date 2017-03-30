package file05;

import java.io.*;

/**
 * Created by nikol on 24.03.2017.
 */
public class LowToUpp {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write filename:");
        String fileName = reader.readLine();
        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("file05.txt"))){

            String line;
            while ((line = fileReader.readLine())!=null){
                line = line.toUpperCase().replaceAll(" ","  ");
                fileWriter.write(line);
                fileWriter.newLine();
            }

        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
