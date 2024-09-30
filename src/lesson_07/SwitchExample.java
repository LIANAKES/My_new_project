package lesson_07;

public class SwitchExample {
    public static void main(String[] args) {

        int x = 7;



        switch (x) {
            case 5:
                System.out.println("switch: x равен 5 ");
                break;
            case 7:
                System.out.println("switch: x равен 7");
                break;
            default:
                System.out.println("switch: что-то другое");
                break;
        }

        System.out.println("Строка кода за пределами switch");
    }
}
