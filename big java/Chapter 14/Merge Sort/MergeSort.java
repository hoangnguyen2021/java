import java.util.Arrays;

public class MergeSort
{
   public static void main(String[] args)
   {
      int[] list1 = {54, 30, 89, 118, 23, 2, 91, 99, 37, 28, 40, 67, 5, 98, 74, 46};
      System.out.println(Arrays.toString(list1));
      sort(list1);
      System.out.println(Arrays.toString(list1));
   }
   
   public static void sort(int[] a)
   {
      if (a.length == 1) { return; }
      
      int[] a1 = Arrays.copyOfRange(a, 0, a.length / 2);
      int[] a2 = Arrays.copyOfRange(a, a.length / 2, a.length);
      sort(a1);
      sort(a2);
      int i = 0;
      int j = 0;
      int k = 0;
      while (i < a1.length && j < a2.length)
      {
         if (a1[i] < a2[j]) { a[k] = a1[i]; i++; }
         else { a[k] = a2[j]; j++; }
         k++;
      }
      while (i < a1.length) { a[k] = a1[i]; i++; k++;}
      while (j < a2.length) { a[k] = a2[j]; j++; k++;}
   }
}