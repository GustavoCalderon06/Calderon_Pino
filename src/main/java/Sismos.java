import java.util.*;

public class Sismos {
    public static void main(String[] args) {

        Menu();


    }






















    
    public static void Menu() {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        System.out.println("Ingrese el numero de la opcion de desee");
        do {
            System.out.println("[1] Mostrar sismo más intenso");
            System.out.println("[2] Mostrar sismos ≥ 4.0 grados Richter");
            System.out.println("[3] Reiniciar el arreglo con nuevos valores");
            System.out.println("[4] Salir");

            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Buscando sismos más intenso......");
                    //mostrarMayorSismo();
                    System.out.println();

                    break;
                case 2:
                    System.out.println("Contando sismos mayores o iguales a 4......");
                    mostrarContarSismos(GenerarMatriz());
                    System.out.println();

                    break;
                case 3:
                    System.out.println("Para reiniciar la matriz ingrese un nuevo numero de dias");
                    GenerarMatriz();
                    System.out.println();

                    break;
                case 4:
                    salir = true;

                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        }
        while (!salir);
    }
/*
    public static int buscarMayorSismo(int matriz[][]) {
        int [][]a=matriz[][];

        int i = 0;
        double n = 0;
        while (i < a.length) {
            if (a[i] > n) n = a[i];
            i++;
        }
        //return String.format("%.1f",n);
    }

    public static void mostrarMayorSismo(double[] a) {
        String mayorSismo = buscarMayorSismo(a);
        System.out.println(mayorSismo + "\n");
    }

*/
    public static int contarSismos(int[][] matriz) {
        int i = 0;
        int j = 0;

        int n = 0;
        while (i < matriz.length) {
            if (matriz[i][j] >= 4.0) n++;
            i++;
        }
        return n;
    }

    public static void mostrarContarSismos(int[][] matriz) {
        int cantidadSismo = contarSismos(matriz);
        System.out.println(+cantidadSismo + "\n");
    }


}
