public class Triangle implements Shape {
    private int m_width;
    private int m_height;
    private int m_s1;
    private int m_s2;
    private int m_s3;

    public Triangle(int width, int height, int s1, int s2, int s3) {
        m_width = width;
        m_height = height;
        m_s1 = s1;
        m_s2 = s2;
        m_s3 = s3;
    }

    @Override
    public double calculateArea() {
        return (m_width * m_height)/2;
    }
    
    @Override
    public double calculatePerimeter() {
        return m_s1+m_s2+m_s3;
    }
}
