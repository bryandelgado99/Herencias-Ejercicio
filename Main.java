import java.util.ArrayList;
import Figuras.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Creacion de lista o array de datos  //Creacion de lista o array de datos
        ArrayList <Figuras> compose = new ArrayList<Figuras>();

        //Instancias para ingresar al array
        Circulo3 figuraN1 = new Circulo3("Figura C-1", 6.35, 3.1416,0);
        Rectangulo_2 figuraN2 = new Rectangulo_2("Rectangulo N-2", 0.00, 0.00, 5.56, 5.65, 5.24);
        Triangulo1 figuraN3 = new Triangulo1("Triangulo N-1", 0,0,9.45, 45.12,
                65.32, 4.12, 6.33, 3);
        circulo2 figuraN4 = new circulo2("Circulo N-2", 9.99, 3.1416, 0, 19.98f, 12f, 25.36f);
        Triangulo2 figuraN5 = new Triangulo2("Triangulo N-2", 0, 0, 12.4, 14.32, 9.85, 7.45, 9.85, 8.66);
        rectangulo1 figuraN6= new rectangulo1("Rectangulo N-1", 0,0,0,6.65,6.20);
        //Aqui agregamos las figuras al array
        compose.add(figuraN1);
        compose.add(figuraN2);
        compose.add(figuraN3);
        compose.add(figuraN4);
        compose.add(figuraN5);
        compose.add(figuraN6);


        //Menu principal---------------------------------------------------------------------------------------
        System.out.println("\n---------------Menu Figuras------------------");
        System.out.println("Calculo del area y perimetro de las siguientes figuras: ");
        System.out.println("1. Figura Circulo 1  ");
        System.out.println("2. Figura Circulo 2 ");
        System.out.println("3. Figura Rectangulo 1 ");
        System.out.println("4. Figura Rectangulo 2 ");
        System.out.println("5. Figura Triangulo 1 ");
        System.out.println("6. Figura Triangulo 2 ");
        System.out.print("Seleccione una de las opciones del menu: ");
        int opt = entrada.nextInt();

        switch (opt){
            case 1 -> {
                System.out.println("\n----> Esto es un Circulo llamado " +figuraN1.getNombre_figura1());
                System.out.println(" ");
                figuraN1.imprimirDatos();
            }
            case 2 -> {
                System.out.println("\n----> Esto es un Circulo llamado " +figuraN4.getNombre_figura1());
                System.out.println(" ");
                figuraN4.datos();
            }

            case 3 -> {
                System.out.println("\n----> Esto es un Rectangulo llamado " +figuraN6.getNombre_figura1());
                System.out.println(" ");
                figuraN6.imprimirValoresRectangulo1();
            }
            case 4 -> {
                System.out.println("\n----> Esto es un Rectangulo llamado " +figuraN2.getNombre_figura1());
                System.out.println(" ");
                figuraN2.imprimirValoresRectangulo_2();
            }

            case 5 -> {
                System.out.println("\n----> Esto es un Triangulo llamado " +figuraN3.getNombre_figura1());
                System.out.println(" ");
                figuraN5.imprimir();
            }

            case 6 -> {
                System.out.println("\n----> Esto es un Triangulo llamado " +figuraN5.getNombre_figura1());
                System.out.println(" ");
                figuraN3.imprimirDatos();

            }

            default -> System.out.println("----> ERROR! Esta conica no se encuentra en el sistema!");
        }
    }

}