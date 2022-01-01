public class Demo
{
   public static void main(String[] args)
   {
      B b = new MyClass();
      
      b.methodA();
      System.out.println();
      
      b.methodB();
      System.out.println();
      
      A.methodS(); // call an interface static method
   }
}