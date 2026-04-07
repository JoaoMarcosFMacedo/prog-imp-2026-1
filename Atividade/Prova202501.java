import java.util.Scanner;
public class Prova202501{
    
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[]ars){
        int[] a = new int [10];
        int[] b = new int [10];
        int x = 0;
            preencherVetor(a, x);

            imprimirVetor(a);

            preencherVetor(b, x);





    }
    public static int BuscaSequencial(int[] v, int tam, int x){
        for(int i = 0; i < tam ; i +=1){
            if( v[i] == x){
                return 1;
            }

        }
        return -1;
    }
    public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u){
        int tamU = 0;
        for(int i = 0; i < tamA; i += 1){
                u[tamU] = a[i];
                tamU = tamA;
        }
        for(int i = 0; i < tamB; i += 1){
            if(BuscaSequencial(u, tamU, b[i]) != 1){
                u[tamU] = b[i];
                tamU+=1;
            }
        }
        return tamU;
    }
    public static void Ordenacao(int[]v , int tam){
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
    public static void preencherVetor(int[] v, int x){
        for(int i = 0; i < v.length; i +=1){
            System.out.println("Digite um valor: ");
            v[i] = scanner.nextInt();
        }
    }
    public static void imprimirVetor(int[]v){
        System.out.printf("{ %d", v[0]);
        for(int i = 1; i < v.length; i+=1){
            System.out.printf(", %d ",v[i]);
        }
        System.out.printf("}");
    }
    




}