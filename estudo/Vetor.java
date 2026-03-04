import java.util.Random;
import java.util.Scanner;
public class Vetor{
    // public static final int TAM_MIN = 1;
    public static final int TAM = 100; 
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main (String [] args){
        
        int[] numeros = new int[TAM];
        
        for(int i = 0 ; i < TAM; i += 1 ){

            numeros[i] = random.nextInt(30) +1;
            System.out.println("Meu vetor e: " + i + " recebeu valor:" + numeros[i] );
        }
        System.out.printf("A média é %.2f" ,calcMedia(numeros));
        System.out.println();
        imprimir(numeros);

    }
    public static double calcMedia(int []numeros){
        int soma = 0;
        for ( int i = 0; i < numeros.length; i+=1){
            soma += numeros[i];
        } return soma / numeros.length;
    }
    public static void imprimir(int[] numeros){
        System.out.print("{ ");
         if (numeros.length >= 1) {
            System.out.print(" " + numeros[0]);
            for (int i = 1; i < numeros.length; i += 1) {
                System.out.print(", " + numeros[i]);
            }
        }
        System.out.print (" }");
    }
}