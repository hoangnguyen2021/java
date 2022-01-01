import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
   String str();
   int value();
}

public class Meta
{
   @MyAnno(str = "Annotation Example", value = 100)
   public static void myMethod()
   {
      Meta ob = new Meta();
      
      try
      {
         Class<?> c = ob.getClass();
         Method m = c.getMethod("myMethod");
         MyAnno anno = m.getAnnotation(MyAnno.class);
         System.out.println(anno.str() + " " + anno.value());
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




