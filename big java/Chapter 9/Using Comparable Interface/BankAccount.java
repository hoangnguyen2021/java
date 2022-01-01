public class BankAccount implements Comparable<BankAccount>
{  
   private double balance;

   public BankAccount()
   {   
      balance = 0;
   }

   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   public void deposit(double amount)
   {  
      balance = balance + amount;
   }

   public void withdraw(double amount)
   {   
      balance = balance - amount;
   }

   public double getBalance()
   {   
      return balance;
   }

   public int compareTo(BankAccount other)
   {
      return Double.compare(balance, other.getBalance());
   }

   public String toString()
   {
      return getClass().getName() + "[balance=" + balance + "]";
   }
}