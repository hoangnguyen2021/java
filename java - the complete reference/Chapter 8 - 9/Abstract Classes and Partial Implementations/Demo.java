public class Demo
{
   public static void main(String[] args)
   {
      Area shape;
      Shape r = new Rectangle(10, 20);
      Shape t = new Triangle(10, 20);
      shape = r;
      shape.displayArea(); // dynamic method dispatch
      shape = t;
      shape.displayArea(); // dynamic method dispatch
      // shape does not have access to any other members
      // of Rectangle and Triangle
   }
}