public class BankAccount {
    int balance;

BankAccount(int amount)
{
    this.balance=amount;
}
 
void addBalance(int amount)
{
   this.balance+=amount;
   System.out.println("Total amount After Adding : "+this.balance);
}

void withDrawAmount(int amount)
{
    if(this.balance>=amount)
    {
    this.balance-=amount;
    System.out.println("Amount after WithDrawal : "+this.balance);
    }
    else
    System.out.println("Amount not available");
}
   
    
}
class MainThraed{
     public static void main(String[] args) {
      
        BankAccount account=new BankAccount(100);
        
        

      Thread desposit =new Thread ();
        for(int i=0;i<2;i++)
        {
           account.addBalance(100);
           try {
            desposit.sleep(1000);
           } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
           }
        }
    

        Thread withdraw=new Thread ();
        
         for(int i=0;i<2;i++)
        {
           account.withDrawAmount(100);
           try {
            withdraw.sleep(1500);
           } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
           }
        }
        desposit.start();
        withdraw.start();
    

    }

}
