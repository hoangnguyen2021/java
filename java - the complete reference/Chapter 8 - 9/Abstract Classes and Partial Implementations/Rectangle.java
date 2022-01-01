/*
   Rectangle is a subclass of Shape and therefore, must
   fully implement methods required by Area or be declared
   as abstract itself.
*/
public class Rectangle extends Shape
{
   private int width;
   private int length;
   
   public Rectangle(int aWidth, int aLength)
   {
      width = aWidth;
      length = aLength;
   }
   
   public void displayArea()
   {
      System.out.println("Area of rectangle: " + (width * length));
   }
}