import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class ass6 {
    public static void main(String[] args) {
        try{
            File f = new File("input.txt");
            Scanner sc = new Scanner(f);
            String templine;
            int lines=0,charactors=0,words=0;
            while(sc.hasNextLine()){
                templine = sc.nextLine();
                lines++;
                words+= templine.split(" ").length;
                charactors+= templine.replaceAll("\\s+", "").length();
            }
            System.out.println("Number of Lines: "+lines);
            System.out.println("Number of Words: "+words);
            System.out.println("Number of Charactors: "+charactors);
            sc.close();
        }
        catch(IOException e){
            System.out.println("Error occured!");
        }
    }

}
