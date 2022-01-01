import java.util.Scanner;

public class Question
{
   private static int questionNum = 0;
   private String question;
   private String answer;
   
   public Question(String q, String a)
   {
      questionNum++;
      question = q;
      answer = a;
   }
   
   public void displayQ()
   {
      System.out.println(questionNum + ". " + question);
   }
   
   public boolean check(String userAnswer)
   {
      if (userAnswer.equals(answer))
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public void displayA()
   {
      System.out.println("Correct answer: " + answer);
   }
   
   public void presentQA()
   {
      displayQ();
      Scanner userIn = new Scanner(System.in);
      System.out.print("Your answer: ");
      String userAnswer = userIn.nextLine();
      if (check(userAnswer))
      {
         System.out.println("True");
      }
      else
      {
         System.out.println("False");   
      }
      displayA();
   }
}