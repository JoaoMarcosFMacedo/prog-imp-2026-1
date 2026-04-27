import java.util.Scanner;

public class aula7{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
        int[][] m = new int [4][3];
        int[][] sm = new int [4][3];


        System.out.println("Digite os valores para a Matriz sm: ");
        preencherMatriz(sm);
        System.out.println("Digite os valores para a Matriz m: ");
        preencherMatriz(m);

        
        System.out.printf("----------------------\n");
        imprimirMatriz(m);
        System.out.printf("----------------------\n");
        imprimirMatriz(sm);

        System.out.printf("Digite o valor de x: ");
        int x  = scanner.nextInt();

        if( buscaSequencialMatriz(sm, sm.length) != 1 ){
            System.out.printf("Não achou");

        }else{
            System.out.printf("-----> Achou <----   ");
        }
    }

    
    public static void preencherMatriz(int[][]m ){

        for(int i = 0; i < m.length;i += 1){

            for( int j = 0; j < m[0].length; j+= 1){

                System.out.printf("Digite o valor para a matriz [%d] x [%d]: ", i, j);

                m[i][j] = scanner.nextInt();
                    // scanner.next();

                System.out.printf("");
            }
            System.out.printf("\n");
        }
    }
    public static void imprimirMatriz(int[][] m){
        for(int i = 0; i < m.length ; i += 1){
            System.out.printf("{ ");
            for(int j = 0; j < m[0].length ; j += 1){

                System.out.printf(" %d  ", m[i][j]);

            }
            System.out.printf(" }\n");    
        }
    }
    public static int buscaSequencialMatriz(int[][] m, int x){
        for(int i = 0; i < m.length; i += 1){
            for(int j = 0; j < m[0].length; j += 1){
                if(x == m[i][j]){
                    return 1;
                }
            }
        }
        return -1;
    }
}