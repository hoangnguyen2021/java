import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
   String str();
   int value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What
{
   String description();
}

@What(description = "An annotation test class")
@MyAnno(str = "Meta", value = 99)
public class Meta
{
   @What(description = "An annotation test method")
   @MyAnno(str = "Testing", value = 100)
   public static void myMethod()
   {
      Meta ob = new Meta();
      
      try
      {
         Annotation[] annos = ob.getClass().getAnnotations();
         System.out.println("All annotations for Meta:");
         for (Annotation a : annos)
         {
            System.out.println(a);
         }
         System.out.println();
         
         annos = ob.getClass().getMethod("myMethod").getAnnotations();
         System.out.println("All annotations for myMethod:");
         for (Annotation a : annos)
         {
            System.out.println(a);
         }
      }
      catch (NoSuchMethodException e)
      {
         System.out.println("Method not found.");
      }
   }
   
   public static void main(String[] args)
   {
      myMethod();
   }
}