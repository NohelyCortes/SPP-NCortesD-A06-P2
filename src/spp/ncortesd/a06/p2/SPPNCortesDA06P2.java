//Nohely Monserrat Cortés del Ángel
//A01410768
//IMT
package spp.ncortesd.a06.p2;
import java.util.Scanner;
/**
 *
 * @author Nohely
 */
public class SPPNCortesDA06P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora de factoriales");
        calculadora();
    }
    static void calculadora(){
        int numero;
        int factorial=1;
        Scanner kb= new Scanner (System.in);
        System.out.println("Introduce un número");
        numero= kb.nextInt();
        if (numero>0 && numero<11){
        for (int i=1; i<=numero ; i++){ 
        factorial = factorial * i;
        }
        System.out.println("El factorial del valor introducido es: " + factorial);
        } else System.out.println("Favor de introducir un valor del 1-10");
}
}
