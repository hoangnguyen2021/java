public class RandomSequence implements Sequence
{
   public int next()
   {
      return (int)(Math.random() * Integer.MAX_VALUE);
   }
}