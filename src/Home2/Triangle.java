package Home2;

/**
 * Created by User on 09.03.2016.
 */
public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;}

    void areaTriangle(){
        double p = (a + b + c)/2;
        double area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        System.out.println("Area of triangle = " + area);

    }
}
