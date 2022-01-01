import java.util.Arrays;

public class SelectionSort
{
   public static void main(String[] args)
   {
      int[] list1 = {54, 30, 89, 118, 23, 2, 91, 99, 37, 28, 40, 67, 5, 98, 74, 100};
      System.out.println(Arrays.toString(list1));
      sort(list1);
      System.out.println(Arrays.toString(list1));
   }
   
   public static void sort(int[] a)
   {
      for (int currentIndex = 0; currentIndex < a.length - 1; currentIndex++)
      {
         int minIndex = minIndex(a, currentIndex);
         if (minIndex != currentIndex)
         {
            swap(a, currentIndex, minIndex);
         }
      }
   }
   
   private static int minIndex(int[] a, int from)
   {
      int minIndex = from;
      for (int i = from + 1; i < a.length; i++)
      {
         if (a[i] < a[minIndex])
         {
            minIndex = i;
         }
      }
      return minIndex;
   }
   
   private static void swap(int[] a, int index1, int index2)
   {
      int temp = a[index1];
      a[index1] = a[index2];
      a[index2] = temp;
   }
}