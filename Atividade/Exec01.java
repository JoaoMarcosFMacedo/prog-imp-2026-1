import java.util.Scanner;

public class Exec01 {

    public static final int TAM = 10;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = new int[TAM];

        preencher(numeros);
        imprimir(numeros);
    }

    public static void preencher(int[] v) {
        for (int i = 0; i < v.length; i += 1) {

            System.out.printf("Digite um número do vetor na posição %d:  ", i);
            int valor = scanner.nextInt();

            if (existe(v, valor, i) != -1) {
                System.out.println("Valor repetido! Recomece a digitação.");

                i -= 1; 
                
            }

            v[i] = valor;
        }
    }

    public static int existe(int[] v, int valor, int limite) {
        for (int i = 0; i < limite; i += 1) {
            if (v[i] == valor) {
                return 1;
            }
        }
        return -1;
    }

    public static void imprimir(int[] v) {
        System.out.print( "{" );
        if( v.length >= 1){
        System.out.printf(" Posição %d: valor: %d,", 0,v[0]);            
           for(int i = 1; i < v.length; i += 1) {
               System.out.printf(", Posição %d: valor: %d ", i, v[i] );               
            }
            System.out.println( "} \n Vetor sem números repetidos!" );
        } 
    }
}