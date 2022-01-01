import java.util.Arrays;

public class Demo
{
   public static void main(String[] args)
   {
      // arrayType(), componentType(), getComponentType()
      System.out.println("Class object for a Person array: " + Person.class.arrayType());
      System.out.println("Class object for a Person object: " + Person[].class.componentType());
      
      // cast(Object)
      Person s = new Student("John", "CS");
      // System.out.println("Before cast: " + s.getMajor());
      System.out.println("After cast: " + Student.class.cast(s).getMajor());
      
      // forName(String)
      try
      {
         System.out.println("Class object for an Object object: " + Class.forName("java.lang.Object"));
      }
      catch (ClassNotFoundException e)
      {
         System.out.println("Class not found");
      }
      
      // getClasses()
      System.out.println("Public inner classes/interfaces of Person: " + Arrays.toString(Person.class.getClasses()));
      
      // getDeclaringClass()
      System.out.println("Declaring class of PersonA: " + Person.getPersonA().getDeclaringClass());
      
      // getEnclosingClass()
      System.out.println("Enclosing class of PersonA: " + Person.getPersonA().getEnclosingClass());
      
      // getInterfaces()
      System.out.println("Interfaces directly implemented by Person: " + Arrays.toString(Person.class.getInterfaces()));
      System.out.println("Interfaces directly implemented by Student: " + Arrays.toString(Student.class.getInterfaces()));
      
      // getSuperclass()
      System.out.println("Direct superclass of Student: " + Student.class.getSuperclass());
      
      // getTypeName()
      System.out.println("Type name of Person: " + Person.class.getTypeName());
   }
}