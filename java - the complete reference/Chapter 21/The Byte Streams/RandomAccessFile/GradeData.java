import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GradeData implements AutoCloseable
{
   private RandomAccessFile f;
   private double size;
   private static final int ENTRY_SIZE = 8;
   
   public GradeData() throws FileNotFoundException, IOException
   {
      f = new RandomAccessFile("grades.dat", "rw");
      size = f.length() / ENTRY_SIZE;
   }
   
   public void showGrade(int num) throws IOException
   {
      long pos = (num - 1) * ENTRY_SIZE;
      f.seek(pos);
      System.out.println("Student: " + f.readInt() + " Grade: " + f.readInt());
   }
   
   public void showAll() throws IOException
   {
      f.seek(0);
      for (int i = 0; i < size; i++)
      {
         System.out.println("Student: " + f.readInt() + " Grade: " + f.readInt());
      }
   }
   
   public void editGrade(int num, int newGrade) throws IOException
   {
      long pos = (num - 1) * ENTRY_SIZE + 4;
      f.seek(pos);
      f.writeInt(newGrade);
   }
   
   public void close() throws IOException
   {
      if (f != null)
      {
         f.close();
      }
      f = null;
   }
}