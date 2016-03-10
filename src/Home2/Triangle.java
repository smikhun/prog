package Home2;

/**
 * Created by User on 09.03.2016.
 */
public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;}

    public void areaTriangle(){
        double p = (a + b + c)/2;
        double area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        System.out.println("Area of triangle = " + area);

    }
}
