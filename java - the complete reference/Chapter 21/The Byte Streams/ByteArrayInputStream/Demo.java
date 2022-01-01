import java.io.ByteArrayInputStream;

public class Demo
{
   public static void main(String[] args)
   {
      String source = "Hello\nCan you read me?\nCool";
      byte[] b = source.getBytes();
      
      ByteArrayInputStream byteArrayIn = new ByteArrayInputStream(b);
      int eachByte = byteArrayIn.read();
      while (eachByte != -1)
      {
         System.out.print((char) eachByte);
         eachByte = byteArrayIn.read();
      }
   }
}