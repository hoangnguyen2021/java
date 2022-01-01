public class EnumDemo
{
   public static void main(String[] args)
   {
      for (Apple a : Apple.values())
      {
         System.out.println(a + " is at position " + a.ordinal());
      }
      
      Apple a1 = Apple.Jonathan;
      Apple a2 = Apple.GoldenDel;
      Apple a3 = Apple.RedDel;
      
      if (a1.compareTo(a2) < 0)
      {
         System.out.println(a1 + " comes before " + a2);
      }
      
      if (!a1.equals(a2))
      {
         System.out.println(a1 + " is not equal to " + a2);
      }
   }
}