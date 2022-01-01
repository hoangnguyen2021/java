import java.util.Arrays;

public class Demo
{
   public static void main(String[] args)
   {
      MyArrayCreator<Student[]> f = Student[]::new;
      Student[] students = f.create(3);
      students[0] = new Student("John");
      students[1] = new Student("Kate");
      students[2] = new Student("Ana");
      System.out.println(Arrays.toString(students));
   }
}