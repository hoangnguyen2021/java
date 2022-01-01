import java.util.BitSet;

public class Demo
{
   public static void main(String[] args)
   {
      BitSet b1 = new BitSet(4);
      BitSet b2 = new BitSet(4);
      b1.set(0);
      b1.set(1);
      b2.set(0);
      b2.set(2);
      System.out.println(b1);
      System.out.println(b2);
      b1.and(b2);                // and, or, xor, andNot
      System.out.println(b1);
   }
}