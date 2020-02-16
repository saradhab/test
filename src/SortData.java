import java.io.FileReader;
import java.util.Scanner;

public class SortData {
    public static void main(String[] args) throws Exception {

         //
            //            new FileReader("C:\\Users\\shard\\Emp_data.txt");


               // int i;
               // while ((i=fr.read()) != -1)
                 //   System.out.print((char) i);
        Scanner in = new Scanner(new FileReader ("C:\\Users\\shard\\Emp_data.txt"));
        while (in.hasNextLine())
        {
            System.out.println(in.nextLine());
        }
    }
        }


