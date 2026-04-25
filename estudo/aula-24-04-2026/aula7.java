import java.util.Scanner;

public class aula7{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
        int[][] m = new int [4][3];

        System.out.println("teste");
        preencherMatriz(m);
        
        imprimirVetor(m);
    
    }
    
    public static void preencherMatriz(int[][]m ){

        for(int i = 0; i < m.length;i += 1){

            for( int j = 0; j < m[0].length; j+= 1){

                System.out.printf("Digite o valor para a matriz [%d] x [%d]", i, j);

                m[i][j] = scanner.nextInt();
                    // scanner.next();

                System.out.printf("");
            }
            System.out.printf("\n");
        }
    }
    public static void imprimirVetor(int[][] m){
        for(int i = 0; i < m.length ; i+=1){
            for(int j = 0; j< m[0].length ; j += 1){

                System.out.printf(" { %d } { %d }\n",m[i], m[j]);
            }
            System.out.printf("\n");
        }
    }
}