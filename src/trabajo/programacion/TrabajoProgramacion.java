package trabajo.programacion;

import java.util.Scanner;

public class TrabajoProgramacion {
//Profe hice lo que pude pero no logre terminarlo 
    public static void main(String[] args) {
        menu();
        
    }

    public static void Condicionswitch() {

        Scanner leer = new Scanner(System.in);
        byte dia = 0;
        System.out.println("Digite el dia");
        dia = leer.nextByte();

        switch (dia) {

            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miercoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;

            case 6:
                System.out.println("Sabado");
                break;

            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Dia invalido");
        }
    }

    public static void ciclodowhile() {

        Scanner leer = new Scanner(System.in);

        byte opcion = 0;
        do {
            System.out.println("1-sumar");
            System.out.println("2-restar");
            System.out.println("3-multiplicar");
            System.out.println("4-division");
            System.out.println("5-salir");
            System.out.println("Digite una opcion");
            opcion = leer.nextByte();

        } while (opcion != 3);
    }

    public static void ciclowhile() {
        int x = 0;
        while (x < 20) {
            if ((x < 5) || (x > 10)) {
                System.out.println("valor" + x);
            }
            x = x + 1;
        }
    }

    public static void menu() {
        Scanner leer = new Scanner(System.in);

        byte opcion = 0;
        do {
            System.out.println("1-sumar");
            System.out.println("2-restar");
            System.out.println("3-multiplicar");
            System.out.println("4-division");
            System.out.println("5-salir");
            System.out.println("Digite una opcion");
            opcion = leer.nextByte();
            switch (opcion) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    division();
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion != 5);
    }

    public static void sumar() {
        float total;
        total = 5 + 6;
        System.out.println("total suma: " + total);
    }

    public static void multiplicar() {
        float total;
        total = 5 * 6;
        System.out.println("total multiplicacion: " + total);
    }

    public static void division() {
        float total;
        total = 6 / 2;
        System.out.println("total division: " + total);
    }

    public static void restar() {
        float total;
        total = 5 - 6;
        System.out.println("total suma: " + total);
    }

    public static void Condicionif() {
        int num1, num2, num3;
        num1 = 60;
        num2 = 30;
        num3 = 100;
        /// Condicion IF
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println(num2 + " es mayor ");
        } else if ((num3 > num1) && (num3 > num2)) {
            System.out.println(num3 + " es mayor ");
        } else if ((num1 == num2) && (num2 == num3)) {
            System.out.println(" los tres numeros son iguales ");
        }
    }
}
