import java.awt.Color;

public class PrintDemo
{
   // generic method
   public static <E> void print(E[] a)
   {
      for (E e : a)
      {
         System.out.print(e + " ");
      }
      System.out.println();
   }

   public static void main(String[] args)
   {
      String[] words = { "Mary", "had", "a", "little", "lamb" };
      Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW };
      Integer[] squares = { 1, 4, 9, 16, 25, 36 };

      print(words);
      print(colors);
      print(squares);   
   }
}