import java.util.Arrays;

public class EnumDemo
{
   public static void main(String[] args)
   {
      // declare and initialize enum
      Gender g = Gender.Male;
      System.out.println("Value of g: " + g);
      
      // use switch with enum
      g = Gender.Female;
      switch (g)
      {
         case Male: System.out.println("Gender is male."); break;
         case Female: System.out.println("Gender is female."); break;
         case Other: System.out.println("Gender is other."); break;
         default: System.out.println("Gender is unknown."); break;
      }
      
      // values() method
      Gender[] gArray = Gender.values();
      System.out.println(Arrays.toString(gArray));
      
      // valueOf() method
      Gender g1 = Gender.valueOf("Other");
      System.out.println("Value of g1: " + g1);
   }
}