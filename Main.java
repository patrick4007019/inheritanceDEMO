public class Main {
    public static void main(String[] args) {
        Shape equilateral = new Triangle(5, 10, 10, 10, 10);
        System.out.println(equilateral.calculateArea());
        System.out.println(equilateral.calculatePerimeter());
    }
}
