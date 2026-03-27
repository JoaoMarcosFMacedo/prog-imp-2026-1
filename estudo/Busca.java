import java.util.Random;
import java.util.Scanner;
public class Busca {
    public static final int TAM = 16;
    public static final int MIN = 1, MAX = 30;    

    public static Scanner scanner = new Scanner(System.in); 
    public static Random random = new Random();

    public static void main(String [] args){
        int[] num = new int[TAM];
        int X;

        PreencherAlearotio(num);

        System.out.printf("Digite o número para ser procurando dentro do vetor\n");
        X = scanner.nextInt();
        
        if( BuscaSequencial(num,X, X) == 1){
            System.out.printf("Achou o valor %d", BuscaSequencial(num, X, X) );
        }
        else {
            System.out.print("Não achou");
        }
        ImprimirVetor(num);
        CalcularMedia(num);


    }
    public static void PreencherAlearotio(int[] v){
        for(int i = 0; i < TAM; i+=1){
            v[i] = random.nextInt(MAX - MIN + 1) + MIN;        
        }
    }
    public static int BuscaSequencial(int[] v, int n, int x){
        for(int i = 0 ; i >= n; i +=1 ){
            if( x == v[i] ){
                return i;
            }
        }
        return -1;
    }
    public static void ImprimirVetor(int[]v){
        System.out.printf("{ %d ", v[0] );
        for( int i = 1; i < v.length; i +=1 ){
            System.out.printf(", %d", v[i]);
            // if( i > 0 ){
            // }
        }
        System.out.print(" }");

    }
    public static double CalcularMedia(int[] v){
        int soma = 0;
        for(int i = 0; i < v.length; i+=1){
            soma += v[1];
        }
        return(double)soma/(double) v.length;

    }
}
