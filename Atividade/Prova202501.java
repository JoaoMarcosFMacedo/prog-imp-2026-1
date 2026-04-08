import java.util.Scanner;
public class Prova202501{

    public static final int QTD = 10;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[]ars){
        int[] a = new int [10];
        int[] b = new int [10];
        int[] uniao = new int[ 2 * QTD];
        int[] vetorCrp = new int [QTD];
        int[] vetorSrp = new int [ 2 * QTD];


        int x = 0;
        preencherVetor(a, x);
        ordenacao(a , QTD);
        imprimirVetor(a, QTD);

        preencherVetor(b, x);
        ordenacao(b, QTD);
        imprimirVetor(b, QTD);

        int tamU = uniao(a, QTD, b, QTD, uniao);
        ordenacao(uniao, tamU);
        imprimirVetor(uniao, tamU);        

        System.out.println("Digite os valores do vetor:");
        preencherVetor(vetorCrp, x);
        ordenacao(vetorCrp, QTD);
        int tamVetorSpr = vetorSemRepeticao(vetorCrp, vetorCrp.length, vetorSrp);
        imprimirVetor(vetorSrp, tamVetorSpr);

    }
    public static int BuscaSequencial(int[] v, int tam, int x){
        for(int i = 0; i < tam ; i +=1){
            if( v[i] == x){
                return 1;
            }

        }
        return -1;
    }
    public static void ordenacao(int[]v , int tam){
        for(int i = 0; i < tam; i +=1 ){    
            int chave = v[i];
            int j = i - 1;
            while( j >= 0 && v[j] > chave){
                v[j + 1 ] = v[j];
                j -= 1;
            }
            v[j + 1] = chave;

        }
            
    }
    public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u){
        int tamU = 0;
        for(int i = 0; i < tamA; i += 1){
                u[i] = a[i];
            }
        tamU = tamA;
        for(int i = 0; i < tamB; i += 1){
            if(BuscaSequencial(u, tamU, b[i]) != 1){
                u[tamU] = b[i];
                tamU+=1;
            }
        }
        return tamU;
    }
    public static void preencherVetor(int[] v, int x){
        for(int i = 0; i < v.length; i +=1){
            System.out.printf("posição %d :  ", i);
            v[i] = scanner.nextInt();
        }
    }
    public static void imprimirVetor(int[]v, int tam){
        
        System.out.printf("{ %d", v[0]);
        for(int i = 1; i < tam; i+=1){
            System.out.printf(", %d ",v[i]);
        }
        System.out.printf("}");
        System.out.println();
    }
    public static int vetorSemRepeticao(int[]v, int tam, int[] vetorSrp){
        int tamVsp = 0;
        for(int i = 0; i < tam; i += 1){
            if(BuscaSequencial(vetorSrp, tamVsp, v[i]) != 1){
                vetorSrp[tamVsp] = v[i];
                tamVsp += 1; 
            }
        }
        return tamVsp;
    }    




}