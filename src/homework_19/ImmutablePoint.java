package homework_19;

public class ImmutablePoint {
    private final int x;
    private final int y;


    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Попытка создать сеттеры (они не скомпилируются)
    /*
    public void setX(int x) {
        this.x = x; // Ошибка компиляции
    }

    public void setY(int y) {
        this.y = y; // Ошибка компиляции
    }
    */

    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(5, 10);
        System.out.println("Начальная точка: (" + point.getX() + ", " + point.getY() + ")");

        // Попытка изменить значения (невозможно)
        // point.setX(15);  // Ошибка компиляции
        // point.setY(20);  // Ошибка компиляции

        System.out.println("После попытки модификации: (" + point.getX() + ", " + point.getY() + ")");

        /*
      Поля x и y объявлены как final. Это означает, что их значение можно установить только один раз
      — при инициализации через конструктор. После этого изменить их невозможно.
       Когда мы пытаемся создать методы-сеттеры для изменения значений полей x и y, компилятор выдает ошибку.
         */
    }

}
