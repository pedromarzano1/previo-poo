package claabstractTODOCODE;

public abstract class cuadrado implements figura,dibujable{

    private double lado;

    public cuadrado() {
    }
    public cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
         double resulta= lado*lado;
         return resulta;
    }
    public void dibujar() {
        System.out.println("hola, estoy dibujado un cuadrado");
    }

}
