package homework_07;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();

        int var1 = random.nextInt(101);
        int var2 = random.nextInt(101);
        int var3 = random.nextInt(101);
        int var4 = random.nextInt(101);
        System.out.println(var1 +" | " + var2 + " | " + var3 + " | " + var4);


        int max = var1;
        if (var2 > max) max = var2;
        if (var3 > max) max = var3;
        if (var4 > max) max = var4;

        System.out.println("Максимум: " +  max);


    }
}