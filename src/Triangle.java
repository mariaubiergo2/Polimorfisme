public class Triangle extends Figura{
    double b, h;
    public Triangle(double b, double h){
        this.b=b;
        this.h=h;
    }

    @Override
    public double area(){return (b*h)/2;}

    @Override
    public String name(){return "Triangle";}
}
