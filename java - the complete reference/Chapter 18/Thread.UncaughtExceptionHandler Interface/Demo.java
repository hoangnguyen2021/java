public class Demo
{
   public static void main(String[] args)
   {
      Thread mainThread = Thread.currentThread();
      mainThread.setUncaughtExceptionHandler((t, e) ->
      {
         System.out.println("Exception: " + e);
         System.out.println("Thread: " + t.getName());
      });
      int[] ints = new int[10];
      ints[10] = 5;  // throw ArrayIndexOutOfBoundException
   }
}
/*
   When the main thread is about to terminate due to the uncaught ArrayIndexOutOfBoundException,
   the JVM uses Thread.getUncaughtExceptionHandler(). This method returns the uncaught exception
   handler for this thread (an object of type Thread.UncaughtExceptionHandler). The JVM invokes
   uncaughtException() method of the handler object, passing the thread and the exception as
   arguments.
   The implementation of uncaughtException() method is provided by the lambda expression passed
   to setUncaughtExceptionHandler() method.
*/