public interface A
{
   default void methodA()
   {
      System.out.println("Default methodA in A is called.");
   }
   
   // this method must be implemented in the interface
   static void methodS()
   {
      System.out.println("Static methodS in A is called.");
   }
}