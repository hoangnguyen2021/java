public enum Apple
{
   Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
   
   private int price;
   
   Apple(int aPrice) { System.out.println("cool"); price = aPrice; }
   
   public int getPrice() { return price; }
}