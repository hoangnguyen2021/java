import java.util.Scanner;

public class Demo1
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter grades, separated by white space"
                       + ", followed by a character: ");
      double sum = 0;
      int count = 0;
      while (s.hasNextDouble())
      {
         double grade = s.nextDouble();
         sum = sum + grade;
         count++;
      }
      
      s.close();
      if (count > 0)
      {
         System.out.println("Average: " + (sum / count));
      }
   }
}