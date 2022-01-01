import java.util.ArrayList;
import java.util.Arrays;

public class NewBoatGame
{
   private ArrayList<String> boat1;
   private ArrayList<String> boat2;
   private ArrayList<String> boat3;
   
   public NewBoatGame()
   {
      boat1 = this.generateBoat();
      do
      {
         boat2 = this.generateBoat();
      }
      while (checkBoats(boat2, boat1));
      
      do
      {
         boat3 = this.generateBoat();
      }
      while (this.checkBoats(boat3, boat1) || this.checkBoats(boat3, boat2)); 
   }
   
   public ArrayList<String> getBoat1()
   {
      return boat1;
   }
   
   public ArrayList<String> getBoat2()
   {
      return boat2;
   }
   
   public ArrayList<String> getBoat3()
   {
      return boat3;
   }
   
   public ArrayList<String> generateBoat()
   {
      int row = (int) (Math.random() * 6);
      int column = (int) (Math.random() * 6);
      String[] array1 = {"" + row + (column - 2), "" + row + (column - 1), "" + row + column};
      String[] array2 = {"" + row + (column - 1), "" + row + column, "" + row + (column + 1)};
      String[] array3 = {"" + row + column, "" + row + (column + 1), "" + row + (column + 2)};
      String[] array4 = {"" + (row - 2) + column, "" + (row - 1) + column, "" + row + column};
      String[] array5 = {"" + (row - 1) + column, "" + row + column, "" + (row + 1) + column};
      String[] array6 = {"" + row + column, "" + (row + 1) + column, "" + (row + 2) + column};
      
      ArrayList<String[]> boats = new ArrayList<String[]>();
      boats.add(array1);
      boats.add(array2);
      boats.add(array3);
      boats.add(array4);
      boats.add(array5);
      boats.add(array6);
      
      for (int i = 0; i < boats.size(); i++)
      {
         for (String element : boats.get(i))
         {
            if (element.length() > 2 || element.charAt(0) == '6' || element.charAt(1) == '6')
            {
               boats.remove(i);
               i--;
               break;
            }
         }   
      }
      
      int random = (int) (Math.random() * boats.size());
      ArrayList<String> boat = new ArrayList<String>();
      boat.add(boats.get(random)[0]);
      boat.add(boats.get(random)[1]);
      boat.add(boats.get(random)[2]);
      
      return boat;
   }
   
   public boolean checkBoats(ArrayList<String> boatA, ArrayList<String> boatB)
   {
      for (String boatAE : boatA)
      {
         for (String boatBE: boatB)
         {
            if (boatAE.equals(boatBE))
            {
               return true;
            }
         }
      }
      return false;
   }
}