//Escribir un programa en Java que represente la clase cuenta bancaria, la cuenta puede mostrar por pantalla los atributos
// de la cuenta, consultar saldo, actualizar saldo, retirar un monto si el valor no supera el saldo actual. Por: Stephanía Salmerón
//Para: Progrmación II - UBA
package Ejercicios2;
import java.util.Scanner;
public class cuentaBancaria {
    //Declaramos 3 variables
    String nombre;
    String numeroCuenta;
    double saldo;
    // se crean varios métodos
    public cuentaBancaria(String nombre, String numeroCuenta, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }
    public double consultarSaldo() {
        return saldo;
    }
    public void actualizarSaldo(double monto) {
        saldo += monto;
    }
    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Retirado " + monto + " bolivares");
        } else {
            System.out.println("Fondos insuficientes para retirar " + monto + " bolivares");
        }
    }

    public static void main(String[] args) {
        // alamcenamos los datos
        cuentaBancaria cuenta = new cuentaBancaria("Stephania Salmeron", "123456789", 1000.00);

        Scanner scanner = new Scanner(System.in);
        int opcion;
        //creamos un do-while y un switch para establecer las opciones de cada método creado anteriormente

        do {
            System.out.println("1. Mostrar datos de cuenta");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Actualizar saldo");
            System.out.println("4. Retirar monto");
            System.out.println("5. Salir");

            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cuenta.mostrarDatos();
                    break;
                case 2:
                    System.out.println("Saldo actual: " + cuenta.consultarSaldo());
                    break;
                case 3:
                    System.out.print("Ingresa el monto a actualizar: ");
                    double montoActualizar = scanner.nextDouble();
                    cuenta.actualizarSaldo(montoActualizar);
                    System.out.println("Saldo actualizado");
                    break;
                case 4:
                    System.out.print("Ingresa el monto a retirar: ");
                    double montoRetirar = scanner.nextDouble();
                    cuenta.retirar(montoRetirar);
                    break;
                case 5:
                    System.out.println("Fin");
                    break;
            }

        } while (opcion!=5);
    }
}


