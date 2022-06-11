package JPL0Lab4.part2.bai1;

public class testShape {
    public static void main(String[] args) {
        Shape shape = new Shape() {
            @Override
            public int getArea() {
                return 0;
            }
        };
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        System.out.println("Chieu dai cua "+rectangle.getArea());
    }
}
