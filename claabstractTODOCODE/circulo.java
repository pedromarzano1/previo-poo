package claabstractTODOCODE;

public abstract class circulo implements figura, dibujable, rotable{
    private double radio;

    public circulo() {
    }

    /*public circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }*/

    public circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        double resultado= 3.14* radio *radio;
        return resultado;
    }
    public void dibujable(){
        System.out.println("estoy dibujando un circulo");

    }
    public void rotable(){
        System.out.println("estoy rotando un circulo");
    }
}
