package homework_19;

import java.util.Random;

public class DOGapp {
    public static void main(String[] args) {
       Random random = new Random();

        // Создаем 5 объектов класса DOG с случайной высотой прыжка от 30 до 80
        DOG[] dogs = new DOG[5];
        dogs[0] = new DOG("Buddy", random.nextInt(51) + 30);
        dogs[1] = new DOG("Rex", random.nextInt(51) + 30);
        dogs[2] = new DOG("Max", random.nextInt(51) + 30);
        dogs[3] = new DOG("Charlie", random.nextInt(51) + 30);
        dogs[4] = new DOG("Rocky", random.nextInt(51) + 30);

        // Создаем массив барьеров на 7 значений (случайные значения от 70 до 170)
        int[] barriers = new int[7];
        for (int i = 0; i < barriers.length; i++) {
            barriers[i] = random.nextInt(120) + 70;
        }

        // Каждая собака пытается преодолеть каждый барьер
        for (DOG dog : dogs) {
            int successfulJumps = 0;
            System.out.println("\nСобака " + dog.getName() + " с высотой прыжка " + dog.getJumpHeight() +
                    " см пытается преодолеть барьеры:");
            for (int barrier : barriers) {
                if (dog.jumpBarrier(barrier)) {
                    System.out.println("Барьер высотой " + barrier + " см преодолен.");
                    successfulJumps++;
                } else {
                    System.out.println("Барьер высотой " + barrier + " см не преодолен.");
                }
            }
            System.out.println(dog.getName() + " преодолела " + successfulJumps + " барьеров.");
        }
    }
}

