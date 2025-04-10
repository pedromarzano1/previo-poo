package condicional;

import java.util.Scanner;

public class operadorternario {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("introduce tu edad porfavor: ");
        int edad=entrada.nextInt();

        String resultado= (edad<18)? "eres menor de edad":"eres mayor de edas";
        System.out.println(resultado);


    }
}
