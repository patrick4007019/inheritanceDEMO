public class Truck extends Vehicle {
    public int m_rows;
    public Truck(String name, int rows) {
        super(name);
        m_rows = rows;
    }
    public void countRows() {
        System.out.println(m_rows);
    }
    @Override
    public void vroom() {
        System.out.println("VROOOMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
    }
}
