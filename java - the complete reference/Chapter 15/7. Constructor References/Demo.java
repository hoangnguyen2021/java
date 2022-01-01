public class Demo
{
   public static void main(String[] args)
   {
      MyFunction f = Student::new;
      Student student1 = f.apply("John");
      System.out.println(student1);
   }
}