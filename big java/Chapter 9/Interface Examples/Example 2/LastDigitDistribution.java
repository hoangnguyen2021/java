public class LastDigitDistribution
{
   int[] lastDigitDistribution;
   
   public LastDigitDistribution()
   {
      lastDigitDistribution = new int[10];
   }
   
   public void process(Sequence sequence, int size)
   {
      for (int i = 0; i < size; i++)
      {
         int value = sequence.next();
         int lastDigit = value % 10;
         lastDigitDistribution[lastDigit]++;
      }
   }
   
   public void display()
   {
      for (int i = 0; i < 10; i++)
      {
         System.out.print(i + " : " + lastDigitDistribution[i]);
         System.out.println();
      }
   }
}