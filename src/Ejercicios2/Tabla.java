//Escribir un programa en Java que genere la tabla de multiplicar y de dividir de un número que el
// usuario ingrese previamente. Por: Stephanía Salmerón. Para: Programación II - UBA.
package Ejercicios2;
import java.util.Scanner;
public class Tabla {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = x.nextInt();

        // Imprimimos la tabla de multiplicar utilizando un for
        System.out.println("la tabla de multiplicación del " + numero + " es: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        //imprimimos la tabla de división utilizando otro for
        System.out.println("la tabla de división del " + numero + " es: ");
        float j=1;
        while ( j <=10){
            System.out.println(numero + " / " + j + " = " + (numero / j));
            j++;
        }
    }
}