import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BoatGame
{

   public static void main(String[] args)
   {
      NewBoatGame game1 = new NewBoatGame();
      ArrayList<String> boat1 = game1.getBoat1();
      ArrayList<String> boat2 = game1.getBoat2();
      ArrayList<String> boat3 = game1.getBoat3();
      boolean boat1D = true;
      boolean boat2D = true;
      boolean boat3D = true;
      
      Scanner in = new Scanner(System.in);
      
      System.out.println("***Welcome to Boat Game!***");
      
      while (true)
      {
         System.out.print("Enter your target: ");
         String target = in.next();
         if (checkTarget(target, boat1) || checkTarget(target, boat2) || (checkTarget(target, boat3)))
         {
            System.out.println("Hit!");
         }
         else
         {
            System.out.println("Miss!");
         }
         
         if (boat1.isEmpty() && boat1D)
         {
            System.out.println("McDonald's is down!!!");
            boat1D = false;
         }
         if (boat2.isEmpty() && boat2D)
         {
            System.out.println("KFC is down!!!");
            boat2D = false;
         }
         if (boat3.isEmpty() && boat3D)
         {
            System.out.println("Chick-fil-A is down!!!");
            boat3D = false;
         }
         
         if (boat1.isEmpty() && boat2.isEmpty() && boat3.isEmpty())
         {
            System.out.println("WIN!!!");
            break;
         }
      }
     
   }
   
   public static boolean checkTarget(String target, ArrayList<String> boat)
   {
      for (int i = 0; i < boat.size(); i++)
      {
         if (target.equals(boat.get(i)))
         {
            boat.remove(i);
            return true;
         }
      }
      return false;
   }
   
}