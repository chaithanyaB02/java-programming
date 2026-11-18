
public class BankTest {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(101, 5000, 1);

        acc1.display();

        acc1.deposit(2000);

        acc1.withdraw(1000);

        acc1.withdraw(10000);

        acc1.deposit(-500);

        System.out.println("Final Balance: " + acc1.getBalance());

        System.out.println("Total Accounts: " +
                BankAccount.accountCount);
    }
}
