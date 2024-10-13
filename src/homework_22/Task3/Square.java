package homework_22.Task3;

public class Square extends Figure {

        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double calculateArea() {
            return side * side;
        }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}



