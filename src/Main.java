import java.util.Arrays;

public class Main {
    public static double sumaArees(Figura[] figures){
        double total = 0;
        for(Figura f : figures){
            total = total + f.area();
        }
        return total;
    }
    public static void sort(Figura[] v){
        Arrays.sort(v);
    }

    public static void showVectorArees(Figura[] v){
        for(Figura f : v){
            System.out.println("Nom figura: "+ f.name()+ " - Area: "+f.area() +" u2");
        }
    }

    public static void main(String[] args) {

        System.out.println("Hello world!\n");

        Figura[] vec = new Figura[4];
        vec[0] = new Rectangle(2,4);
        vec[1] = new Cercle(2);
        vec[2] = new Quadrat(3);
        vec[3] = new Triangle(10,4);

        showVectorArees(vec);

        System.out.println("\nLa suma de les arees es: "+sumaArees(vec) +"\n");

        sort(vec);

        showVectorArees(vec);


    }
}