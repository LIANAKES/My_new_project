package homework_03;

public class Task3 {
    public static void main(String[] args) {

        double priceA = 1000;
        double priceB = 500;

        int discount = 10; // B %

        double discountMoney = (priceA + priceB) * discount / 100;

        // Option 1
        double priceWithDiscount = priceA + priceB - discountMoney;
        // Option 2
        double priceWithDiscount1 = (priceA + priceB) * (100 - discount) / 100;

        System.out.println("discountMoney:" + discountMoney);
        System.out.println("priceWithDiscount: " + priceWithDiscount);
        System.out.println("priceWithDiscount1: " + priceWithDiscount1);
    }
}
