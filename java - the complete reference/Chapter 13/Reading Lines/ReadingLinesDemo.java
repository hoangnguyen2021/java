import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadingLinesDemo
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter a line: ");
      String line = br.readLine();
      System.out.println(line);
   }
}