import java.util.ArrayList;

public class DrinkListDemo
{
   public static void main(String[] args)
   {
      ArrayList<Coffee> coffee = new ArrayList<>();
      coffee.add(new Coffee("Espresso", 4.35, "Cold"));
      coffee.add(new Coffee("Latte", 4.15, "Hot"));
      
      ArrayList<Tea> tea = new ArrayList<>();
      tea.add(new Tea("Black Tea", 2.65, "Ginger"));
      tea.add(new Tea("Chai Tea", 2.85, "Apple"));
      tea.add(new Tea("Herbal Tea", 2.45, "Mint"));
      
      ArrayList<MilkTea> milkTea = new ArrayList<>();
      milkTea.add(new MilkTea(5.81, "Strawberry", "Fruit"));
      milkTea.add(new MilkTea(5.39, "Matcha", "Black Pearl"));
      
      DrinkList<Coffee> list1 = new DrinkList<>(coffee);
      DrinkList<Tea> list2 = new DrinkList<>(tea);
      DrinkList<MilkTea> list3 = new DrinkList<>(milkTea);
      
      System.out.println("Compare sums of list1 and list2: " + list1.compareSum(list2));
      System.out.println("Compare sums of list2 and list3: " + list2.compareSum(list3));
      System.out.println("Compare sums of list1 and list3: " + list1.compareSum(list3));
      System.out.println();
      
      list2.addAll(list3);
      System.out.println("Add list3 and to list2, list2 becomes: " + list2);
   }
}