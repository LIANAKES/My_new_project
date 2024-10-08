package homework_18;

public class Dog {
    private String name;
    private int jumpHeight;
    private int maxJumpHeight;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }

    public void jump() {
        System.out.println(name + " прыжки " + jumpHeight + " см в высоту.");
    }

    public void train() {
        if (jumpHeight + 10 <= maxJumpHeight) {
            jumpHeight += 10;
            System.out.println(name + " тренировался! Новая высота прыжка:" + jumpHeight + " cm.");
        } else {
            jumpHeight = maxJumpHeight;
            System.out.println(name + " достиг максимальной высоты прыжка: " + jumpHeight + " cm.");
        }
    }

    public void jumpBarrier(int barrierHeight) {
        if (jumpHeight >= barrierHeight) {
            System.out.println(name + " успешно перепрыгивает через барьер " + barrierHeight + " cm!");
        } else {
            int requiredTrainings = (barrierHeight - jumpHeight) / 10;
            if (barrierHeight <= maxJumpHeight) {
                System.out.println(name + " не может перепрыгнуть через барьер " + barrierHeight + " см еще.");
                System.out.println(name + " необходимо тренироваться " + requiredTrainings + " больше времени. Давай тренироваться!");
                while (jumpHeight < barrierHeight) {
                    train();
                }
                System.out.println(name + " теперь можно перепрыгнуть через барьер!");
            } else {
                System.out.println(name + " никогда не сможет перепрыгнуть через барьер " + barrierHeight + " см, даже с обучением.");
            }
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 50);
        dog.jumpBarrier(100);
    }
}
