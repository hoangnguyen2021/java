public class EnumDemo
{
   public static void main(String[] args)
   {
      Apple a1 = Apple.Winesap;
      System.out.println("Winesap costs " + a1.getPrice() + " cents.");
      System.out.println();
      
      System.out.println("All apple prices:");
      for (Apple a : Apple.values())
      {
         System.out.println(a + " costs " + a.getPrice() + " cents.");
      }
   }
}