public class Rectangle extends Figura{
    double a, b;

    //Constructor
    public Rectangle (double a, double b){
        this.a = a;
        this.b = b;
    }

    //Override és quan una subclasse té el mateix mètode que
    //la parent class
    @Override
    public double area()
    {
        return a*b;
    }

    @Override
    public String name(){
        return "Rectangle";
    }
}
