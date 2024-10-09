package homework_20.animals;

public class Dog extends Animal {
        String breed;


        public Dog(String name, int age, String breed) {
            super(name, age);
            this.breed = breed;
        }

        public String toString() {
            return super.toString() + ", Порода: " + breed;
        }

        }


