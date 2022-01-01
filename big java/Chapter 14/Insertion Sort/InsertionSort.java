import java.util.Arrays;

public class InsertionSort
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
      for (int i = 0; i < a.length - 1; i++)
      {
         int j = i;
         int temp = a[j + 1];
         while (j >= 0 && temp < a[j])
         {
            a[j + 1] = a[j];
            j--;
         }
         a[j + 1] = temp;
      }
   }
}