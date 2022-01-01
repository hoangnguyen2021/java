public class Demo
{
   public static <T> int count(T[] obs, Condition<T> f, T ob2)
   {
      int count = 0;
      for (T ob : obs)
      {
         if (f.test(ob, ob2)) { count++; }
      }
      return count;
   }
   
   public static void main(String[] args)
   {
      HighTemp[] week1 = {new HighTemp(89), new HighTemp(84),
                          new HighTemp(86), new HighTemp(83),
                          new HighTemp(81), new HighTemp(84),
                          new HighTemp(80)};
      int num1 = count(week1, HighTemp::isHigherThan, new HighTemp(85));
      System.out.println(num1 + " day(s) had a high of more than 85");
      int num2 = count(week1, HighTemp::isLowerThan, new HighTemp(85));
      System.out.println(num2 + " day(s) had a high of less than 85");
   }
}