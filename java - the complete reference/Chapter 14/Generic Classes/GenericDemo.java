public class GenericDemo
{
   public static void main(String[] args)
   {
      Generic<Integer> gInt = new Generic<Integer>(100);
      System.out.println(gInt);
      gInt.showType();
      
      Generic<String> gString = new Generic<String>("Hello");
      System.out.println(gString);
      gString.showType();
   }
}