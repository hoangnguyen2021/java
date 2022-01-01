import java.util.Arrays;

public class ComparableDemo
{
   public static void main(String[] args)
   {
      BankAccount[] accounts = new BankAccount[3];
      accounts[0] = new BankAccount(4050);
      accounts[1] = new BankAccount(3600);
      accounts[2] = new BankAccount(2730);
      System.out.println("accounts before sorting: " + Arrays.toString(accounts));
      Arrays.sort(accounts);
      System.out.println("accounts after sorting: " + Arrays.toString(accounts));

      Country[] countries = new Country[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 514000);
      countries[2] = new Country("Belgium", 30510);
      System.out.println("countries before sorting: " + Arrays.toString(countries));
      Arrays.sort(countries);
      System.out.println("countries after sorting: " + Arrays.toString(countries));
   }
}