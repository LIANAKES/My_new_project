package homework_08;

public class Task3 {
    public static void main(String[] args) {
        int i = 1;

        String result = "Числа, которые деляться на 5: ";
        while ( i <= 100 ) {
      //      System.out.print(i + ";");

            if (i % 5 == 0) {
                result = result + i + " ,";
                i += 5;
            } else  {
                i++;
            }
        }

        System.out.println(result);
    }
}
