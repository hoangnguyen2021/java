public class NumArrayDemo
{
   public static void main(String[] args)
   {
      Integer[] nums1 = {10, 20, 30, 40, 50};
      Double[] nums2 = {7.5, 62.5, 20.0};
      
      NumArray<Integer> numArray1 = new NumArray<Integer>(nums1);
      System.out.println("numArray1");
      System.out.println("Min: " + numArray1.min());
      System.out.println("Max: " + numArray1.max());
      System.out.println("Average: " + numArray1.average());
      
      
      NumArray<Double> numArray2 = new NumArray<Double>(nums2);
      System.out.println("numArray2");
      System.out.println("Min: " + numArray2.min());
      System.out.println("Max: " + numArray2.max());
      System.out.println("Average: " + numArray2.average());
      
      System.out.println("numArray1 and numArray2 have equal average: " + numArray1.hasEqualAverage(numArray2));
   }
}