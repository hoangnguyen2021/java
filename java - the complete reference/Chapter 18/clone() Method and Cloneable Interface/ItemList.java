import java.util.ArrayList;

public class ItemList implements Cloneable
{
   private ArrayList<Item> items;   // object -> not safe
   private int count;               // primitive -> safe
   
   public ItemList()
   {
      items = new ArrayList<>();
      count = 0;
   }
   
   public void addItem(Item anItem)
   {
      items.add(anItem);
      count++;
   }
   
   public ArrayList<Item> getItems()
   {
      return items;
   }
   
   public int getCount()
   {
      return count;
   }
   
   public ItemList clone()
   {
      try
      {
         ItemList clone = (ItemList) super.clone();
         clone.items = new ArrayList<>(items);     // modify items
         return clone;
      }
      catch (CloneNotSupportedException e)
      {
         System.out.println("Cloning not allowed");
         return this;
      }
   }
}