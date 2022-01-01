import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.Arrays;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyAnnoContainer.class)
@interface MyAnno
{
   String str() default "Testing";
   int value() default 0;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnoContainer
{
   MyAnno[] value();
}

public class RepeatAnno
{
   @MyAnno(str = "Annotation 1", value = 1)
   @MyAnno(str = "Annotation 2", value = 2)
   public static void myMethod()
   {
      RepeatAnno ob = new RepeatAnno();
      
      try
      {
         Method m = ob.getClass().getMethod("myMethod");
         // first way
         MyAnnoContainer anno1 = m.getAnnotation(MyAnnoContainer.class);
         System.out.println(anno1);
         // second way
         MyAnno[] anno2 = m.getAnnotationsByType(MyAnno.class);
         System.out.println(Arrays.toString(anno2));
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