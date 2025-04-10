package clases_abstractas;

import java.util.Date;
import java.util.GregorianCalendar;

public class uso_persona {
    public static void main(String[] args) {

    }
}
//creacion clase abstracta
abstract class persona{
    private String nombre;

    public persona(String nombre) {
        this.nombre = nombre;
    }

    public String dameNombre() {
        return nombre;
    }
    public abstract String damedescripcion();//metodo abstracto
}







class empleado2{
    private double sueldo;
    private int anio;
    private int mes;
    private int dia;
    private Date altaContrato;

    public empleado2(double sueldo, int anio, int mes, int dia ) {
        this.sueldo=sueldo;
        this.anio=anio;
        this.mes=mes;
        this.dia=dia;
        GregorianCalendar calendario=new GregorianCalendar(anio, mes-1, dia);
        this.altaContrato=calendario.getTime();


    }



    public double dameSueldo() {
        return sueldo;
    }

    public Date dameFechaContrato() {
        return altaContrato;
    }
    public void setAumentarSueldo(double porcentaje){
        double aumento= sueldo*porcentaje/100;
        sueldo=sueldo+aumento;

    }
}


