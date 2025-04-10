package clases;

public class uso_coche {
    public static void main(String[] args) {
        coche renault=new coche();
       // System.out.println("las ruedas del coche son: "+renault.ruedas+" ruedas");
        System.out.println("el largo es: "+renault.getLargo());

        coche michoche= new coche();
        michoche.setColor("Amarillo");
        System.out.println("elcolor es: "+ michoche.getColor());
    }
}
