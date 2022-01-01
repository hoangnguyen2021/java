public class Person implements Comparable<Person>
{
   private String name;

   public Person(String aName)
   {
      name = aName;
   }
   
   public String toString() 
   {
      return getClass().getName() + "[name=" + name + "]";
   }
   
   public int compareTo(Person other)
   {
      return name.compareTo(other.name);
   }
}