import java.lang.annotation.*;
import java.lang.reflect.*;

@Target(ElementType.TYPE_USE)
@interface TypeAnno {}

@Target(ElementType.TYPE_USE)
@interface NotZeroLen {}

@Target(ElementType.TYPE_USE)
@interface Unique {}

@Target(ElementType.TYPE_USE)
@interface MaxLen
{
   int value();
}

@Target(ElementType.TYPE_PARAMETER)
@interface What
{
   String description();
}

@Target(ElementType.FIELD)
@interface EmptyOK {}

@Target(ElementType.METHOD)
@interface Recommended {}

// use an annotation on a type parameter
public class TypeAnnoDemo<@What (description = "Generic data type") T>
{
   // use a type annotation on a constructor
   public @Unique TypeAnnoDemo() {}
   
   // use a type annotation on a field type
   @TypeAnno String str;
   
   // use an annotation on a field
   @EmptyOK String test;
   
   // use a type annotation on type this
   public int f(@TypeAnno TypeAnnoDemo<T> this, int x)
   {
      return 10;
   }
   
   // use a type annotation on a return type
   public @TypeAnno Integer f2(int j, int k)
   {
      return j + k;
   }
   
   // use a annotation on a method
   public @Recommended Integer f3(String str)
   {
      return str.length() / 2;
   }
   
   // use a type annotation on a throws clause
   public void f4() throws @TypeAnno NullPointerException
   {
   }
   
   // use a type annotation on array levels
   String @MaxLen(10) [] @NotZeroLen() [] w;
   
   // use a type annotation on array element type
   @TypeAnno Integer[] vec;
   
   public static void myMethod(int i)
   {
      // use a type annotation on a type argument
      TypeAnnoDemo<@TypeAnno Integer> ob =
                        new TypeAnnoDemo<@TypeAnno Integer>();
      
      // use a type annotation with new
      @Unique TypeAnnoDemo<Integer> ob2 = new @Unique TypeAnnoDemo<Integer>();
      
      Object x = Integer.valueOf(10);
      Integer y;
      
      // use a type annotation on a cast
      y = (@TypeAnno Integer) x;
   }
   
   public static void main(String[] args)
   {
      myMethod(10);
   }
   
   class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {}
}