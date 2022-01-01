public class Caller implements Runnable
{
   private Thread t;
   private CallMe target;
   private String msg;
   
   public Caller(String name, CallMe aTarget, String aMsg)
   {
      t = new Thread(this, name);
      target = aTarget;
      msg = aMsg;
   }
   
   public Thread getThread()
   {
      return t;
   }
   
   public void run()
   {
      target.call(msg);
   }
}
