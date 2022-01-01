import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Demo
{
   public static void main(String[] args)
   {         
      boolean done = false;
      try (Scanner in = new Scanner(System.in);
           GradeData g = new GradeData())
      {
         while (!done)
         {
            System.out.println("Menu:");
            System.out.println("1) View grade");
            System.out.println("2) View all grades");
            System.out.println("3) Edit grade");
            System.out.println("4) Exit");
            System.out.print("Enter 1 - 4: ");
            int userOption = in.nextInt();
            int num = 0;
            int newGrade = 0;
            switch (userOption)
            {
               case 1:
                  System.out.print("Enter student's number: ");
                  num = in.nextInt();
                  g.showGrade(num);
                  break;
               case 2:
                  g.showAll();
                  break;
               case 3:
                  System.out.print("Enter student's number: ");
                  num = in.nextInt();
                  System.out.print("Enter new grade: ");
                  newGrade = in.nextInt();
                  g.editGrade(num, newGrade);
                  break;
               case 4:
                  done = true;
                  break;
               default:
                  System.out.println("Invalid input");
                  break;
            }
         }
      }
      catch (FileNotFoundException e)
      {
         System.out.println(e.getMessage());
      }
      catch (IOException e)
      {
         System.out.println(e.getMessage());
      }
   }
}