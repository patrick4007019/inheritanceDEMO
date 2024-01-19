public class Circle implements Shape {
    public double m_diameter;
    public Circle(int diameter) {
        m_diameter = diameter;
    }
    public double calculateArea() {
        return Math.PI * Math.pow(m_diameter/2, 2);
    } 

    public double calculatePerimeter() {
        return Math.PI * m_diameter;
    }
}
