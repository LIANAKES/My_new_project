package homework_19;

public class DOG {
    private String name;
    private int jumpHeight;

    public DOG (String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
    }

    public boolean jumpBarrier(int barrierHeight) {
        return jumpHeight >= barrierHeight;
    }


    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }
}

