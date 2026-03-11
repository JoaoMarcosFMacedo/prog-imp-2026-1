import java.util.Scanner;

public class Exec01 {

    public static Scanner scanner = new Scanner(System.in);
    public static final int TAM = 10;
    public static void main(String [] args){
        int[] numerosSemRept = new int[TAM];
        int N;
        PreencherVetor(numerosSemRept);
        imprimir(numerosSemRept, N);

    }
    public static void PreencherVetor(int[] v){
        for(int i = 0 ; i >= v.length; i +=1 ){
            System.out.printf("Seu vetor está na posição %d", i);
            v[1] = scanner.nextInt();
        }
    }
    public static void imprimir(int[] v, int TAM) {
        System.out.print("{");
            if (TAM > 0) {
        System.out.print(" " + v[0]);
        }
        for (int i = 1; i < TAM; i += 1) {
        System.out.print(", " + v[i]);
    }
        System.out.println(" }");
  }
}
