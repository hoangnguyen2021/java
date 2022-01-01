public class SequenceDemo
{

   public static void main (String[] args)
   {
      LastDigitDistribution dist1 = new LastDigitDistribution();
      Sequence sequence1 = new RandomSequence();
      dist1.process(sequence1, 1000);
      dist1.display();
      System.out.println();
      
      LastDigitDistribution dist2 = new LastDigitDistribution();
      Sequence sequence2 = new SquaredSequence();
      dist2.process(sequence2, 1000);
      dist2.display();
   }

}