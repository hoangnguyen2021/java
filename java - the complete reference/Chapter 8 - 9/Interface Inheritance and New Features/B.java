public interface B extends A
{
   default void methodA()
   {
      System.out.println("Default methodA in B is called.");
   }
   
   default void methodB()
   {
      A.super.methodA(); // call a superinterface default method
      System.out.println("Default methodB in B is called.");
   }
   
   // B does not inherit static interface methods.
}