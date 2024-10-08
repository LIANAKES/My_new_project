package staticBlock;

public class Test1 {
    public static void main(String[] args) {

        // Если в программе не используется статика или
        // не создаются обьекты класса InitExample
        // то его статические члены не будут проинициализированы

        System.out.println(InitExample.counter);
    }
}
