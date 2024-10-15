package homework_24.task2;

public class ElectronikWallet implements PaymentSystem{

    private double balance;

    public ElectronikWallet (double initialBalance){
        this.balance = initialBalance;
    }

    @Override
    public void withdrawMoney(double amout) {
        if (amout <= balance) {
            balance -= amout;
            System.out.println("Снято " + amout + " долларов. Остаток в кошельке: " + balance + " долларов.");
        } else {
            System.out.println("Недостаточно средств в электронном кошельке.");
        }
    }

    @Override
    public void depositTransfer(double amout) {
        balance += amout;
        System.out.println("Зачислено " + amout + " долларов. Текущий баланс: " + balance + " долларов.");

    }

    @Override
    public void checkBalance() {
        System.out.println("Текущий баланс в кошельке: " + balance + " долларов.");
    }

    @Override
    public void transferMoney(double amount, PaymentSystem recipient) {
        if (amount <= balance) {
            withdrawMoney(amount);
            recipient.depositTransfer(amount);
            System.out.println("Переведено " + amount + " долларов.");
        } else {
            System.out.println("Недостаточно средств для перевода.");
        }
    }
}
