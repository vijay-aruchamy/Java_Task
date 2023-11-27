public class BankAccount {
    int balance;

    BankAccount(int balance) {
        this.balance += balance;
    }

    void addBalance(int balance) {
        this.balance += balance;
        System.out.println("Total balance After Adding : " + this.balance);
    }

    void withDrawbalance(int balance) {
        if (this.balance >= balance) {
            this.balance -= balance;
            System.out.println("balance after WithDrawal : " + this.balance);
        } else
            System.out.println("balance not available");
    }

}

class MainThraed {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(100);

        Thread desposit = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                account.addBalance(100);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        });

        Thread withdraw = new Thread(() -> {

            for (int i = 0; i < 2; i++) {
                account.withDrawbalance(100);
                try {
                    Thread.sleep(1500);
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        });
        desposit.start();
        withdraw.start();

    }

}
