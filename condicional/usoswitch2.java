package condicional;

import java.util.Scanner;

public class usoswitch2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("escriba el dia que necesita saber: ");
        String dia= entrada.nextLine();
        String resultado= switch (dia){
            case "lunes","martes","miercoles","jueves","viernes"-> "laborable";
            case "sabado","domingo" -> "festivo";
            default -> "dia no valido";
        };
        System.out.println("el dia es: "+resultado);
    }
}
