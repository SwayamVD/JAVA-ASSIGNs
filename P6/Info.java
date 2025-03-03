import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;

public class Info{
    public static void main(String[] args){
        

        // ************To create file
        try{
            File f = new File("input1.txt");
            if(f.createNewFile()){
                System.out.println("File Created");
            }
            else{
                System.out.println("File already exist");
            }
        }

        // **********writing to file using FileWriter
        // try{
        //     FileWriter w = new FileWriter("input.txt");
        //     w.write("Hello, Nice to meet you");;
        //     w.close();
        //     System.out.println("Writing in file done");
        // }

        // ******reading from file
        // try{
        //     FileReader f = new FileReader("input.txt");
        //     BufferedReader b = new BufferedReader(f); // //helps to access the readline function
        //     String line;
        //     while((line = b.readLine()) != null){
        //         System.out.println(line);
        //     }
        //     b.close();
        // }

        // *********reading from file using scanner
        // try{
        //     File f= new File("input.txt");
        //     Scanner sc = new Scanner(f);
        //     while(sc.hasNextLine()){
        //         System.out.println(sc.nextLine());
        //     }
        //     sc.close();
        // }

        // ********deleting the file
        // try{
        //     File f = new File("input.txt");
        //     f.delete();
        // }



        catch(IOException e){
            System.out.println("Error Occured: ");
            e.printStackTrace();
        }

    }
}