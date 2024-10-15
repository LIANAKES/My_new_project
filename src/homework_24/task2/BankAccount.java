package homework_24.task2;

public class BankAccount implements PaymentSystem {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdrawMoney(double amout) {
        if (amout <= balance) {
            balance -= amout;
            System.out.println("Снято " + amout + " евро. Остаток на счете: " + balance + " евро.");
        } else {
            System.out.println("Недостаточно средств на счете.");

        }
    }

    @Override
    public void depositTransfer(double amout) {
        balance += amout;
        System.out.println("Зачислено " + amout + " евро. Текущий баланс: " + balance + " евро.");
    }

    @Override
    public void checkBalance() {
    }

    @Override
    public void transferMoney(double amount, PaymentSystem recipient) {
        if (amount <= balance) {
            withdrawMoney(amount);
            recipient.depositTransfer(amount);
            System.out.println("Переведено " + amount + " евро.");
        } else {
            System.out.println("Недостаточно средств на счете.");
        }
    }
}