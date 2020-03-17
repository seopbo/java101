public class Square extends Shape implements Printable {
    public final double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void print() {
        for (int i = 0; i < ((int) side); i++){
            for (int j = 0; j < ((int) side); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
