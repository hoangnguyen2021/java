/*
   Triangle is a subclass of Shape and therefore, must
   fully implement methods required by Area or be declared
   as abstract itself.
*/
public class Triangle extends Shape
{
   private int base;
   private int height;
   
   public Triangle(int aBase, int aHeight)
   {
      base = aBase;
      height = aHeight;
   }
   
   public void setSize(int aBase, int aHeight)
   {
      base = aBase;
      height = aHeight;
   }
   
   public void displayArea()
   {
      System.out.println("Area of triangle: " + (base * height / 2));
   }
}