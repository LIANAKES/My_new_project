package homework_24.task2;

public interface PaymentSystem {

    void withdrawMoney(double amout);
    void depositTransfer (double amout);
    void checkBalance();
    void transferMoney(double amount, PaymentSystem recipient);
}
