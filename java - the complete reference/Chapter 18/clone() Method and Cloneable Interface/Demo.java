public class Demo
{
   public static void main(String[] arg)
   {
      ItemList list1 = new ItemList();
      list1.addItem(new Item("milk", 2.55));
      list1.addItem(new Item("beef", 11.96));
      list1.addItem(new Item("rice", 5.30));
      System.out.println("List 1: " + list1.getItems());
      System.out.println("Count: " + list1.getCount());
      
      ItemList list2 = list1.clone();
      System.out.println("List 2: " + list2.getItems());
      System.out.println("Count: " + list2.getCount());
      
      System.out.println("Adding butter to list2");
      list2.addItem(new Item("butter", 4.27));
      System.out.println("List 1: " + list1.getItems());
      System.out.println("Count: " + list1.getCount());
      System.out.println("List 2: " + list2.getItems());
      System.out.println("Count: " + list2.getCount());
   }
}
