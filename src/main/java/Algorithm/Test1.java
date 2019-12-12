package Algorithm;

import sun.lwawt.macosx.CPrinterDevice;

import java.io.*;
import java.nio.file.Files;
//import java.nio.file.Path;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {

    public void printPrime(){
        for(int i =2;i<=100;i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }

    public void primeOrNot() throws IOException {
        String data = readDataFromFile();
        data = data.replaceAll("\\D"," ");
        List<Integer> list = new ArrayList<>();
        String temp = new String();
        for(int i = 0;i<data.length();i++){
            if(data.charAt(i)!=' ')
                temp += data.charAt(i);
            if(data.charAt(i)==' '){
                list.add(Integer.parseInt(temp));
                temp = "";
            }
        }

        int count = 0;
        for(int i= 0;i<list.size();i++) {
            if (isPrime(list.get(i)) && count<4) {
                count++;
                System.out.print(list.get(i) + ", ");
            }else if(isPrime(list.get(i)) && count==4){
                System.out.print(list.get(i)+"\n");
                count = 0;
            }
        }

    }

    public static String readDataFromFile() throws IOException {
        InputStream fin = new FileInputStream("/Users/yaozhao/Desktop/fileTest111.txt");
        InputStreamReader reader = new InputStreamReader(fin, "UTF-8");
        BufferedReader buffReader = new BufferedReader(reader);
        String strTmp = "";
        while((strTmp=buffReader.readLine())!=null){
//            strTmp += buffReader.readLine();
            System.out.println(strTmp);
        }
        reader.close();
        buffReader.close();
        return strTmp;
    }



    public boolean isPrime(int i){
        if(i==1) return false;
        for(int j = 2;j*j<=i;j++){
            if(i%j==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
//        String data = readDataFromFile("fileTest111.txt");

         //create a file in JVM
        File file = new File("/Users/yaozhao/Desktop/fileTest111.txt");
        // create a file in local using the specific path
        OutputStream os = new FileOutputStream(file);
        // write new lines in the local file
        OutputStreamWriter writer = new OutputStreamWriter(os,"UTF-8");
//        writer.write("1 2 3 4 5 6 7 8 43 23 111 23 31 41 37 45 32 15 19 17 23456761 271236183");
        writer.write("Just a test for string write in");
//        System.out.println();
        writer.close();


        //read a local txt file
        InputStream fin = new FileInputStream("/Users/yaozhao/Desktop/fileTest111.txt");
        InputStreamReader reader = new InputStreamReader(fin);
        BufferedReader buffReader = new BufferedReader(reader);
        String str = "";
        String temp = "";
        while((temp = buffReader.readLine())!=null){
            str = str + temp + "\n";
        }
        reader.close();
        buffReader.close();
        System.out.println(str);




//        Test1 t = new Test1();
        // print prime number from the file we just created
//        t.primeOrNot();


//        int[] nums = {2,3,4,5,6,7,8,9,10,11,12,13,14,15};

//        File f = new File("Test222.txt");
//        String abPath = f.getAbsolutePath();
//        System.out.println(abPath);

//        String filename = "fileTest.txt";
//        Path pathToFile = Paths.get(filename);
//        System.out.println(pathToFile.getAbso)

//        PrintWriter write = new PrintWriter("fileTest222.txt", "UTF-8");
//        write.println("1,2,3,4,5,45,32,15,18,14");
////        write.println("IDK what is wrong");
//        write.close();

//        PrintWriter write = new PrintWriter("fileTest111.txt", "UTF-8");
//        write.println("1 2 3 4 5 6 7 8 43 23 111 23 31 41 37 45 32 15 19 17 23456761 271236183");
////        write.println("IDK what is wrong");
//        write.close();

//        t.primeOrNot();

    }

}
