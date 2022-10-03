public abstract class Figura implements Comparable<Figura>{
    public abstract double area();

    public abstract String name();

    public int compareTo(Figura f){
        return Double.compare(this.area(), f.area());
    }
}
