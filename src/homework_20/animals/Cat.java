package homework_20.animals;

public class Cat extends Animal{
        String color;


        public Cat(String name, int age, String color) {
            super(name, age);
            this.color = color;
        }

        public String toString() {
            return super.toString() + ", Цвет: " + color;
        }

    }


