public class Demo
{
   public static void main(String[] args)
   {
      MyFunction<String> f = MyClass::new; // or MyClass<String>::new
      MyClass<String> m = f.apply("Fun");
      System.out.println(m);
   }
}