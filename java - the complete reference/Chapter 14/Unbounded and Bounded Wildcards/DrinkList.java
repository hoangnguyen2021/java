import java.util.ArrayList;

public class DrinkList<T extends Beverage>
{
   private ArrayList<T> list;
   
   public DrinkList(ArrayList<T> aList)
   {
      list = aList;
   }
   
   public double sum()
   {
      double sum = 0;
      for (T element : list)
      {
         sum = sum + element.getMeasure();
      }
      return sum;
   }
   
   /*
      Cannot use DrinkList<T> because:
      All T in list1's class will be replaced by Coffee.
      -> Cannot compare list1 with list2 or list3.
   */
   public int compareSum(DrinkList<?> other)
   {
      return Double.compare(this.sum(), other.sum());
   }
    
   /*
      We can use DrinkList<T> but it is too restrictive.
      -> We can only add two DrinkList of the same type parameter.
      We cannot use DrinkList<?> because it is dangerous.
      -> The array list of this DrinkList<T> object
      cannot contain objects from the array list of the other
      DrinkList<?> object if ? is out of bound T.
   */
   public void addAll(DrinkList<? extends T> other)
   {
      for (T element : other.list)
      {
         list.add(element);
      }
   }
   
   public String toString()
   {
      return getClass().getName() + "[list=" + list + "]";
   }
}