import java.util.Scanner;
import java.util.Random;

public class MatrizNN {
    public static final int MAX = 50;
    public static final int MIN = 1;
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static void main (String [] args){
        int matriz[][] = new int[10][10];
        preencherMatrizAleatorio(matriz);
        imprimirMatrizAleatorio(matriz);
    }


    public static void preencherMatrizAleatorio(int matriz[][]){
        for(int i = 0; i< matriz.length; i+= 1 ){
            for(int j = 0; j < matriz[0].length; j += 1){
                matriz[i][j] = random.nextInt(MAX - MIN + 1) + MIN;
            }
        }
    }
    public static void imprimirMatrizAleatorio(int matriz[][]){
        for(int i = 0; i< matriz.length; i+= 1 ){
            for(int j = 0; j < matriz[0].length; j += 1){
                System.out.printf(" [ %d ]", matriz[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
