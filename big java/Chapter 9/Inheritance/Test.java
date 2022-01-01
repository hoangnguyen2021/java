import java.io.*;
import java.util.*;

public class Test
{
   
   public static void main(String[] args)
   {   
      try (Scanner in = new Scanner(new File("Test.txt")))
      {
         while (in.hasNext())
         {
            in.nextLine();
            String questionType = in.nextLine();
            if (questionType.equals("Question"))
            { 
               String q = in.nextLine();
               String a = in.nextLine();
               Question question = new Question(q, a);
               question.presentQA();
            }
            
            if (questionType.equals("ChoiceQuestion"))
            {
               String q = in.nextLine();
               String c1 = in.nextLine();
               String c2 = in.nextLine();
               String c3 = in.nextLine();
               String c4 = in.nextLine();
               String a = in.nextLine();
               ChoiceQuestion question = new ChoiceQuestion(q, a, c1, c2, c3, c4);
               question.presentQA();
            }
         }
      }
      
      catch (FileNotFoundException exception)
      {
         System.out.println("File not found.");
      }
   }
   
}