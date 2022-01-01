import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadingCharactersDemo
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter a character: ");
      char c = (char) br.read();
      System.out.println(c);
   }
}