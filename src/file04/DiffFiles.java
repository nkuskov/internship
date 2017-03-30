package file04;

import java.io.*;

/**
 * Created by Administrator on 24.03.2017.
 */
public class DiffFiles {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write name of your file: ");
        String fileName = reader.readLine();
        File file = new File(fileName);
        long fileSize = file.length();
        long percent30 = (long) (fileSize*0.3);
        long percent70 = fileSize-percent30;
        char[] fileBuf = new char[(int) fileSize];
        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName))){
            fileReader.read(fileBuf,0, (int) fileSize);

        }
        catch (IOException e){
            System.out.println(e);
        }
        try(BufferedWriter fileWriter30 = new BufferedWriter(new FileWriter("file30.txt"))){
            fileWriter30.write(fileBuf,0,(int)percent30);

        }
        catch (IOException e){
            System.out.println(e);
        }
        try(BufferedWriter fileWriter70 = new BufferedWriter(new FileWriter("file70.txt"))){
            fileWriter70.write(fileBuf,(int)percent30,(int)percent70 );
        }
        catch (IOException e){
            System.out.println(e);
        }

    }
}
