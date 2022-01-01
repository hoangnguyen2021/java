import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo
{
   public static void main(String[] args)
   {    
      try (DataOutputStream dOut = new DataOutputStream(new FileOutputStream("test.dat")))
      {
         dOut.writeInt(123);
         dOut.writeDouble(123.45);
         dOut.writeChar('J');
         dOut.writeUTF("Java");
         dOut.writeBoolean(true);
      }
      catch (FileNotFoundException e)
      {
         System.out.println(e.getMessage());
      }
      catch (IOException e)
      {
         System.out.println(e.getMessage());
      }
      
      try (DataInputStream dIn = new DataInputStream(new FileInputStream("test.dat")))
      {
         System.out.println(dIn.readInt());
         System.out.println(dIn.readDouble());
         System.out.println(dIn.readChar());
         System.out.println(dIn.readUTF());
         System.out.println(dIn.readBoolean());
      }
      catch (FileNotFoundException e)
      {
         System.out.println(e.getMessage());
      }
      catch (IOException e)
      {
         System.out.println(e.getMessage());
      }
   }
}