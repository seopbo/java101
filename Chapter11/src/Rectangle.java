public class Rectangle extends Shape implements Printable {
    public final double side1, side2;
    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public double getPerimeter() {
        return 2 * (side1 + side2);
    }

    @Override
    public void print() {
        for (int i = 0; i < ((int) side1); i++) {
            for (int j = 0;j < ((int) side2);j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
