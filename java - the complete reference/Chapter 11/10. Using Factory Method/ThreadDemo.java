public class ThreadDemo
{
   public static void main(String[] args)
   {
      MyThread t = MyThread.createAndStart();
      try
      {
         
      }
      catch (InterruptedException e)
      {
         System.out.println("Main thread interrupted.");
      }
   }
}