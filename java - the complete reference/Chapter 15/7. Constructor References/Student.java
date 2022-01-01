public class Student
{
   private String name;
   
   public Student(String aName)
   {
      name = aName;
   }
   
   public String toString()
   {
      return getClass().getName() + "[name=" + name + "]";
   }
}