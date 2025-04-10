package emple;

import javax.swing.*;
import java.util.*;

public class mainEmpleado {
    public static void main(String[] args) {
        empleado empleado1= new empleado("pedro",85000,1990,12,17);
        empleado empleado2= new empleado("juan",95000,1995,6,2);
        empleado empleado3= new empleado("raul",105000,2002,3,15);
        empleado1.setAumentarSueldo(5);
        empleado2.setAumentarSueldo(3);
        empleado3.setAumentarSueldo(4);

        System.out.println("nombre "+ empleado1.dameNombre()+ " sueldo: "+empleado1.dameSueldo()+
        " fecha de alta "+ empleado1.dameFechaContrato());
        System.out.println("nombre "+ empleado2.dameNombre()+ " sueldo: "+empleado2.dameSueldo()+
                " fecha de alta "+ empleado2.dameFechaContrato());
        System.out.println("nombre "+ empleado3.dameNombre()+ " sueldo: "+empleado3.dameSueldo()+
                " fecha de alta "+ empleado3.dameFechaContrato());
    }
}

class empleado {
    private String nombre;
    private double sueldo;
    private int anio;
    private int mes;
    private int dia;
    private Date altaContrato;

    public empleado(String nombre, double sueldo, int anio, int mes, int dia ) {
        this.nombre = nombre;
        this.sueldo=sueldo;
        this.anio=anio;
        this.mes=mes;
        this.dia=dia;
        GregorianCalendar calendario=new GregorianCalendar(anio, mes-1, dia);
        this.altaContrato=calendario.getTime();
    }

    public String dameNombre() {
        return nombre;
    }

    public void configurarNombre(String nombre) {
        this.nombre = nombre;
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

