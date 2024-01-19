public class Main {
    public static void main(String[] args) {
        Shape equilateral = new Circle(10);
        System.out.println(equilateral.calculateArea());
        System.out.println(equilateral.calculatePerimeter());
    }
}
