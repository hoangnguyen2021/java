public class GenericInterfaceDemo
{
   public static void main(String[] args)
   {
      Integer[] array1 = {3, 6, 2, 8, 6};
      Character[] array2 = {'b', 'r', 'p', 'w'};
      
      MyClass<Integer> myClass1 = new MyClass<>(array1);
      MyClass<Character> myClass2 = new MyClass<>(array2);
      
      System.out.println("myClass1");
      System.out.println("Min: " + myClass1.min());
      System.out.println("Max: " + myClass1.max());
      System.out.println("myClass2");
      System.out.println("Min: " + myClass2.min());
      System.out.println("Max: " + myClass2.max());
   }
}