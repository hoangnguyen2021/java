import java.util.ArrayList;
import java.util.Scanner;

public class FactoraNumber
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = in.nextInt();
      System.out.print("Factors: " + factor(number));
   }
   
   public static ArrayList<Integer> factor(int number)
   {
      ArrayList<Integer> factors = new ArrayList<Integer>();
      
      if (isPrime(number))
      {
         factors.add(number);
         return factors;
      }
      
      int i = 2;
      while (i < number)
      {
         if (number % i == 0)
         {
            factors.add(i);
            ArrayList<Integer> remainingFactors = factor(number / i);
            
            for (int r : remainingFactors)
            {
               factors.add(r);
            }
            break;
         }
         i++;
      }
      return factors;
   }
   
   public static boolean isPrime(int number)
   {
      for (int i = 2; i <= number / 2; i++)
      {
         if (number % i == 0)
         {
            return false;
         }
      }
      return true;
   }
}
