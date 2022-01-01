import java.util.ArrayList;
import java.util.Scanner;

public class ChoiceQuestion extends Question
{
   private ArrayList<String> choices;
   
   public ChoiceQuestion(String q, String a, String c1, String c2, String c3, String c4)
   {
      super(q, a);
      choices = new ArrayList<String>();
      choices.add(c1);
      choices.add(c2);
      choices.add(c3);
      choices.add(c4);
   }
   
   public void displayQ()
   {
      super.displayQ();
      String abcd = "ABCD";
      for (int i = 0; i < choices.size(); i++)
      {
         System.out.println(abcd.charAt(i) + ". " + choices.get(i));
      }
   }
}