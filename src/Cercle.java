import java.lang.Math.*;

public class Cercle extends Figura {
    double radi;


    //Constructor
    public Cercle (double radi){
        this.radi = radi;
    }

    @Override
    public double area(){
        return Math.PI*radi*radi;
    }

    @Override
    public String name(){
        return "Cercle";
    }
}
