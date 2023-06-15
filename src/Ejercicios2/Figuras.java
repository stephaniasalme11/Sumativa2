//Escribir un programa en Java que considerando las siguientes figuras geométricas: círculo, rectángulo, cuadrado y
// triángulo. Se requiere los métodos para determinar el área y el perímetro de cada figura. Por: Stephanía Salmerón
//Para: Progrmación II -UBA.
package Ejercicios2;
public class Figuras {
    //Se crea una clase llamada Figura para el Area y perímetro
    public static abstract class Figura {
    public double Area;
    public double Perimetro;
    }

    //Circulo
    //Creamos una clase Circulo para crear dentro de la misma los métodos
    public static class Circulo {
        static double radio;
        public Circulo(double radio){
            this.radio = radio;
        }

        public static double AreaCir(){
            return Math.PI*radio*radio;
        }

        public static double PerimetroCir(){
            return 2*Math.PI*radio;
        }

        void imprimirCirculo (int i){
            System.out.println("El area del circulo es: ");
            System.out.println("El Perimetro del circulo es: ");
        }

    }


    //Rectangulo
    //Creamos una clase Rectaculo para crear dentro de la misma los métodos
    public static class Rectangulo{
        static double base, altura;
        public  Rectangulo(double base,double altura){
            this.base = base;
            this.altura = altura;
        }

        public static double AreaRec(){
            return base*altura;
        }
        public static double PerimetroRec(){
            return 2*(base+altura);
        }
        void imprimirRectangulo (int i){
            System.out.println("El area del rectangulo es: ");
            System.out.println("El Perimetro del rectangulo es: ");
        }

    }


    //Cuadrado
    //Creamos una clase Cuadrado para crear dentro de la misma los métodos
    public static class Cuadrado {
        static double lado;
        public Cuadrado(double lado){
            this.lado=lado;
        }
        public static double AreaCua(){
            return lado*lado;
        }
        public static double PerimetroCua(){
            return lado+lado+lado+lado;
        }
        void imprimirCuadrado (int i){
            System.out.println("El area del cuadrado es: ");
            System.out.println("El Perimetro del cuadrado es: ");
        }

    }



    //Triangulo
    //Creamos una clase Triangulo para crear dentro de la misma los métodos
    public static class Triangulo{
        static double lado1,lado2,lado3, base, altura;
        public Triangulo(double lado1,double lado2,double lado3){
            this.lado1=lado1;
            this.lado2=lado2;
            this.lado3=lado3;

        }
        public static double AreaTrian(){
            return (base*altura)/2;
        }
        public static double PerimetroTrian(){
            return lado1+lado2+lado3;
        }
        void imprimirTriangulo (int i){
            System.out.println("El area del triangulo es: ");
            System.out.println("El Perimetro del circulo es: ");
        }
        public static String tipoTrian() { //Creamos un método tipoTriangulo
            if (base == altura) {
                return "Equilátero";
            }  if (base > altura) {
                return "Isósceles";
            } else {
                return "Escaleno";
            }
        }
    }

//Creamos otra clase pra imprimir los métodos de cada figura
    public static class Prueba {
        public static void main(String[] args) {
            Circulo circle = new Circulo(5);
            Rectangulo rectangle = new Rectangulo(5,6);
            Cuadrado square = new Cuadrado(8);
            Triangulo triangle = new Triangulo(2,4,5);

            System.out.println("Circulo = ");
            System.out.println("Area del circulo: " + Circulo.AreaCir());
            System.out.println("Perímetro del circulo: " + Circulo.PerimetroCir());

            System.out.println("Rectangulo = ");
            System.out.println("Area del Rectangulo: " + Rectangulo.AreaRec());
            System.out.println("Perímetro del Rectangulo: " + Rectangulo.PerimetroRec());

            System.out.println("Cuadrado = ");
            System.out.println("Area el Cuadrado: " + Cuadrado.AreaCua());
            System.out.println("Perímetro del Cudrado: " + Cuadrado.PerimetroCua());

            System.out.println("Triangulo = ");
            System.out.println("Area del Triangulo: " + Triangulo.AreaTrian());
            System.out.println("Perímetro del Triangulo: " + Triangulo.PerimetroTrian());
            System.out.println("Tipo de triangulo: " + Triangulo.tipoTrian());



        }

    }

}
