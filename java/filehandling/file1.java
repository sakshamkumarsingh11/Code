package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.SQLOutput;


public class file1{
    public static void main(String[] args) throws Exception {
        System.out.println("The program starts of file handling!!!");
        File file = new File("sample.txt");
        file.createNewFile();           // file create krdi
        // write in the file

        FileWriter fw = new FileWriter(file);
        fw.write("This is the first line in this file. This files contain the practice programming of  file handling ");
        fw.close();// without this written will not be shown

//     FileReader fr = new FileReader("sample.txt");
//        System.out.println(fr.read());      // we will use buffer reader  as text nhi dikh rha hai reason badh me smj lena
        FileReader fr = new FileReader("sample.txt");
        BufferedReader bfr = new BufferedReader(fr);
        System.out.println(bfr.readLine());
    }
}