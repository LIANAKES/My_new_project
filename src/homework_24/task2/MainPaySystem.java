package homework_24.task2;

public class MainPaySystem {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        bankAccount.checkBalance();
        bankAccount.depositTransfer(500);
        bankAccount.withdrawMoney(250);
        bankAccount.checkBalance();

        System.out.println("==========================================");

       ElectronikWallet eWallet = new ElectronikWallet(350);
        eWallet.checkBalance();
        eWallet.depositTransfer(150);
        eWallet.withdrawMoney(50);
        eWallet.checkBalance();


        System.out.println("===========================================");

        BankAccount bankAccount1 = new BankAccount(1000);
        BankAccount bankAccount2 = new BankAccount(450);

        ElectronikWallet eWallet1 = new ElectronikWallet(200);
        ElectronikWallet eWallet2 = new ElectronikWallet(350);

        System.out.println("\nПеревод из банка в банк:");
        bankAccount1.transferMoney(200, bankAccount2);
        bankAccount1.checkBalance();
        bankAccount2.checkBalance();

        System.out.println("=======================");

        System.out.println("\nПеревод из банка в электронный кошелек:");
        bankAccount1.transferMoney(150, eWallet1);
        bankAccount1.checkBalance();
        eWallet1.checkBalance();

        System.out.println("========================");

        System.out.println("\nПеревод из электронного кошелька в электронный кошелек:");
        eWallet1.transferMoney(50, eWallet2);
        eWallet1.checkBalance();
        eWallet2.checkBalance();

        System.out.println("==========================");

        System.out.println("\nПеревод из электронного кошелька в банк:");
        eWallet2.transferMoney(100, bankAccount1);
        eWallet2.checkBalance();
        bankAccount1.checkBalance();

    }
}
