import java.util.Arrays;

public class QuickSort
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
      sort(a, 0, a.length - 1);
   }
   
   public static void sort(int[] a, int from, int to)
   {
      if (from >= to) { return; }
      int p = partition(a, from, to);
      sort(a, from, p);
      sort(a, p + 1, to);
   }
   
   private static int partition(int[] a, int from, int to)
   {
      int pivot = a[from];
      int i = from - 1;
      int j = to + 1;
      while (i < j)
      {
         i++; while (a[i] < pivot) { i++; }
         j--; while (a[j] > pivot) { j--; }
         if (i < j) { swap(a, i, j); }
      }
      return j;
   }
   
   private static void swap(int[] a, int index1, int index2)
   {
      int temp = a[index1];
      a[index1] = a[index2];
      a[index2] = temp;
   }
}