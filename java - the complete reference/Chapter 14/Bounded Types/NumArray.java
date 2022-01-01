public class NumArray<T extends Number>
{
   private T[] nums;
   
   public NumArray(T[] nums)
   {
      this.nums = nums;
   }
   
   public double average()
   {
      if (nums.length == 0) { return 0; }
      else
      {
         double sum = 0;
         for (T num : nums) { sum = sum + num.doubleValue(); }
         return sum / nums.length;
      }
   }
   
   public T max()
   {
      T max = nums[0];
      for (int i = 1; i < nums.length; i++)
      {
         if (nums[i].doubleValue() > max.doubleValue()) { max = nums[i]; }
      }
      return max;
   }
   
   public T min()
   {
      T min = nums[0];
      for (int i = 1; i < nums.length; i++)
      {
         if (nums[i].doubleValue() < min.doubleValue()) { min = nums[i]; }
      }
      return min;
   }
   
   // wildcard argument
   public boolean hasEqualAverage(NumArray<?> other)
   {
      return this.average() == other.average();
   }
}