import java.util.ArrayList;
import java.util.Scanner;

public class Permutation
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a word: ");
      String word = in.next();
      System.out.println("There are " + listPermutations(word).size() + " permutations:");
      System.out.println(listPermutations(word));
   }
   
   public static ArrayList<String> listPermutations(String text)
   {
      ArrayList<String> list = new ArrayList<String>();
      if (text.length() == 1)                                           // special terminating case
      {
         list.add(text);                                                // when the text's length is down to 1
         return list;                                                   // return an ArrayList of 1 element contaning that text
      }
      
      for (int i = 0; i < text.length(); i++)                           // looping through each letter
      {                                                                 // separate a letter, list permutations of the remaining text
         String remove = text.substring(i, i + 1);                      // store them in sublist
         String remain = text.substring(0, i) + text.substring(i + 1);  // add the separated letter to each element of sublist
         ArrayList<String> sublist = listPermutations(remain);          // to form the permutation list of the original text
         
         for (String r : sublist)
         {
            list.add(remove + r);
         }
      }
      
      return list;
   }
}