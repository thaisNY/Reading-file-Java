package applicantion;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Program {
    public static void main(String args[]){
        File file  = new File("C:\\Users\\thais\\Downloads\\in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner (file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if( sc != null){
                sc.close();
            }
        }
    }
}
