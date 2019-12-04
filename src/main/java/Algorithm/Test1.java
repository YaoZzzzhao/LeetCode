package Algorithm;

import sun.lwawt.macosx.CPrinterDevice;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
//import java.nio.file.Path;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public void printPrime(){
        for(int i =2;i<=100;i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }

    public void primeOrNot() throws IOException {
        String data = readDataFromFile("fileTest111.txt");
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
//        int[] nums =
//        for(int i:list){
//            if(isPrime(i))
//                System.out.print(i);
//        }
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

//        System.out.println(data);
    }

    public static String readDataFromFile(String fileName) throws IOException {
        String data = "";
        data=new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
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
        String data = readDataFromFile("fileTest111.txt");
//        File file = File("/Users/yaozhao/Documents/test111.txt")
//        System.out.print();
        Test1 t = new Test1();
//        int[] nums = {2,3,4,5,6,7,8,9,10,11,12,13,14,15};


//        String filename = "fileTest.txt";
//        Path pathToFile = Paths.get(filename);
//        System.out.println(pathToFile.getAbso)

//        PrintWriter write = new PrintWriter("fileTest111.txt", "UTF-8");
//        write.println("1,2,3,4,5,45,32,15,18,14");
////        write.println("IDK what is wrong");
//        write.close();

        PrintWriter write = new PrintWriter("fileTest111.txt", "UTF-8");
        write.println("1 2 3 4 5 6 7 8 43 23 111 23 31 41 37 45 32 15 19 17 23456761 271236183");

//        write.println("IDK what is wrong");
        write.close();

        t.primeOrNot();
    }

}
