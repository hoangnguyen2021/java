import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class WordFrequencyDemo
{
   public static void main(String[] args)
   {
      try (Scanner in = new Scanner(new File("alice30.txt")))
      {
         Map<String, Integer> map = new TreeMap<>();
         while (in.hasNext())
         {
            String word = clean(in.next());
            if (map.get(word) == null) { map.put(word, 1); }
            else { map.put(word, map.get(word) + 1); }
         }
         for (String key : map.keySet())
         {
            System.out.printf("%-20s%10d%n", key, map.get(key));
         }
      }
      catch (FileNotFoundException exception)
      {
         System.out.println("File not found");
      }
   }
   /**
      Removes characters from a word that are not letters.
      @param aWord a string
      @return a word with all the letters from aWord
   */
   public static String clean(String aWord)
   {
      String word = aWord.toLowerCase();
      for (int i = 0; i < word.length(); i++)
      {
         if (!Character.isLetter(word.charAt(i)))
         {
            word = word.substring(0, i) + word.substring(i + 1);
            i--;
         }
      }
      return word;
   }
}