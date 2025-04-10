
package condicional;
import java.util.Scanner;
public class condicionalif1 {
    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);
        System.out.println("introduce tu edad porfavor: ");
        int edad=entrada.nextInt();

        if(edad>=18 ){
            System.out.println("eres mayor de edad");
        }
        else if (edad>=50){
            System.out.println("estas en edad de jubilartte");

        }
        else {
            System.out.println("eres menor de edad");
        }


    }

}
