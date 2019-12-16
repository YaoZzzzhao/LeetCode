package Practice;

import java.io.*;
import java.util.Scanner;

/**
 * File handle practice like file creation, write something into a file and read and print the text in a file;
 */

public class FileHandle {
    // create a file to local in a specific path
    public void fileCreate(String path){
        try {
            File file = new File(path);
            if(file.createNewFile())
                System.out.format("A new file %s has been created successfully!\n",file.getName());
            else
                System.out.println("A file in this path is exist!");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    // write a file using file.write method
    public void fileWriteIn(String path, String text) {
//        BufferedWriter bw = null;

        try {
            File file = new File(path);
//            if(file.exists()){
            FileWriter fw = new FileWriter(path,true);
//            bw = new BufferedWriter(fw);
            fw.write(text);
//            bw.newLine();    // add a string to the end of a txt file
            fw.close();
//            }else
//                System.out.println("The file does not exist!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // read a file and print all the text in the file
    public void filePrint(String path){
        try{
            File file = new File(path);
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                System.out.println(reader.nextLine());
            }
        }catch(FileNotFoundException e){
            System.out.println("Something goes wrong.");
            e.printStackTrace();
        }
    }

    // delete a file
    public void fileDelete(String path){
        try{
            File file = new File(path);
            file.delete();
            System.out.println("The file has been deleted successfully!");
        }catch(Exception e){
            System.out.println("This file is failed to delete.");
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        FileHandle fh = new FileHandle();
//        fh.fileCreate("/Users/yaozhao/Documents/fileCreatePractice.txt");
//        fh.fileWriteIn("/Users/yaozhao/Documents/fileCreatePractice.txt","Append method testing.ss");
//        fh.filePrint("/Users/yaozhao/Documents/fileCreatePractice.txt");
        fh.fileDelete("/Users/yaozhao/Documents/fileCreatePractice.txt");
    }
}
