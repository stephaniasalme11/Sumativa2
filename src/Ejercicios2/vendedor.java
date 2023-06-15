//Escribir un programa en Java que solicite el nombre de usuario y contraseña de un vendedor y, además, la verifique.
//Por: Stephanía Salmerón. Para: Programación II - UBA.
package Ejercicios2;
import java.util.Scanner;
public class vendedor {
    public static void main(String[] args){
        Scanner x = new Scanner (System.in);
        //Almacenamos los datos del usuario
        String us = "stephasalme";
        String con = "12345678";

        String usuario, contrase;

        System.out.println("Ingrese su usuario: ");
        usuario = x.nextLine();
        System.out.println("Ingrese su contraseña: ");
        contrase = x.nextLine();

        //Creamos un if-else para comprobar si los datos son correctos en ambos casos
        if(us.equals(usuario)){
            System.out.println("El usuario " + usuario + " es correcto");
        } else {
            System.out.println("El usuario es incorrecto ");

        }
        if (con.equals(contrase)){
            System.out.println("La contraseña" +  " es correcta" );
        } else {
            System.out.println("La contraseña es incorrecta, intentelo de nuevo");
        }
        // En los dos casos el "equals" nos permite saber si el objeto en el que se especifica es igual al objeto actual

    }
}
