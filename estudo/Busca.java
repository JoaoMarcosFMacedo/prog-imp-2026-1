import java.util.Random;
import java.util.Scanner;
public class Busca {
    public static final int TAM = 16;
    public static Scanner scanner = new Scanner(System.in); 
    public static Random random = new Random();

    public static void main(String [] args){
        int[] num = new int[TAM];
        int X;        
        System.out.printf("Digite o número para ser procurando dentro do vetor\n");

        X = scanner.nextInt();
        BuscaSequencial(num)
        

    }
    public static int BuscaSequencial(int[] v){
        for(int i = 0 ; i >= TAM; i +=1 ){
            if( X == v[i] ){
                return i;
            }
        }
        return -1;
    }
}
