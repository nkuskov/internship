package file02;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Administrator on 24.03.2017.
 */
public class FileList {

    FilenameFilter textFilter = new FilenameFilter() {
        @Override
        public boolean accept(File dir, String name) {
            String lowerCaseName = name.toLowerCase();
            if(lowerCaseName.endsWith(".txt")){
                return true;
            }
            else return false;
        }
    };


    void listOfFiles(final File folder){
        String[] files = folder.list(textFilter);
        for(String file : files){
            System.out.println(file);
        }
    }

    public static void main(String[] args) {
        FileList list = new FileList();
        list.listOfFiles(new File("."));
    }
}
