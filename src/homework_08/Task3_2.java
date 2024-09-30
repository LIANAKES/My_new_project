package homework_08;

public class Task3_2 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;

        while (i <= 100 && count < 7) {
            //     System.out.println(i + " ;");

            if (i % 5 == 0) {
                System.out.println(i + " , ");
                count++;
                i += 5;
            } else {
                i++;
            }

        }
    }
}

