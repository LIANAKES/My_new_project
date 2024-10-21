package homework_28;

public class RectangleApp {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(7.0, 5.0);
        Rectangle rectangle1 = new Rectangle(5.0, 3.0);
        Rectangle rectangle2 = new Rectangle(6.0, 4.0);
        Rectangle rectangle3 = new Rectangle(4.0, 2.0);

        System.out.println(rectangle);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);

        System.out.println("====================================");

        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        Rectangle rect3 = new Rectangle(4.0, 2.0);
        Rectangle rect4 = new Rectangle(4.0,2.0);

        System.out.println(rect1.equals(rect2));
        System.out.println(rect1.equals(rect3));
        System.out.println(rect1.equals(rect4));

    }

}
