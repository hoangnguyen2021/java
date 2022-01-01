public class SquaredSequence implements Sequence
{
   private int n;
   
   public SquaredSequence()
   {
      n = 0;
   }
   
   public int next()
   {
      n++;
      return n * n;
   }
}