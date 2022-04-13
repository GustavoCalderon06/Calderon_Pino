import java.util.Scanner;

public class Sismos {
    public static void main(String[] args) {
        GenerarMatriz();

    }
    public static void GenerarMatriz(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce dias: ");
        int dias = teclado.nextInt();
        while (dias <2 || dias >31) {
            System.out.print("Ingrese otro numero valido: ");
            dias = teclado.nextInt();
        }
        System.out.println("Dia ingresado ="+dias);
        int matriz[][] = new int[dias][24];
        for (int i = 1; i < matriz.length; i++) {
            System.out.println();
            System.out.print(" [" + i + "] ");
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * (10 - 1) + 1);
                System.out.print(matriz[i][j] + " ");
            }
        }
    }











}