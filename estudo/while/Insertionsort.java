import java.util.Random;
public class Insertionsort {

    public static Random ramdom = new Random();
    public static final int MIN = 0;
    public static final int MAX = 99;
    


    public static void main( String []args ){
    // int[] vetor = {1,5,4,8,9,10,2,3,6,7,-98, 78, }; 
        int vator1 =; 

        selectionSort(vetor1, vetor1.length);
        imprimir(vetor1, vetor1.length );
    }
    public static void selectionSort(int[]v , int n){
        for(int i = 0; i < n - 1; i += 1){
            int menor = i;
            for(int j = i + 1; j < n; j += 1){
                if(v[j] < v[menor]){
                    menor = j;
                }
            }
            int aux = v[i];
            v[i] = v[menor];
            v[menor] = aux;
        }       
        
    }
    public static int buscasequencial(int[]v,int tam, int x){
        for(int i = 0; i < tam ; i +=1){
            if( x == v[1]){
                return 1;
            }
        }
        return -1;
    }
    public static void imprimir( int[] v, int tam){
        System.out.printf("\n{ %d", v[0]);
        for(int i = 1; i < tam ; i += 1){
            System.out.printf(", %d", v[i]);
        }
        System.out.printf(". }");

    }
    public static void preencherRandom(int[]v){
        for(int i = 0 ; i < v.length ; i += 1){
            v[i] = ramdom.nextInt((MIN - MAX) - MIN);
        }
    }
}
