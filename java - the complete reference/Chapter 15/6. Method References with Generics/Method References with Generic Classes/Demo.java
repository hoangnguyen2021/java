public class Demo
{
   public static void main(String[] args)
   {
      MyClass<String> m = new MyClass<>();
      MyFunction<String> f = MyClass::setOb; // or MyClass<String>::setOb
      f.apply(m, "Fun");
      System.out.println(m);
   }
}