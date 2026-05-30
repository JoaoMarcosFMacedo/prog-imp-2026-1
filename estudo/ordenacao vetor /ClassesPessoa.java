import java.util.Scanner;

class Pessoa{
    String nome;
    int idade;
    double peso, altura; 
}

public class ClassesPessoa{
    public static Scanner scanner = new Scanner(System.in);
    public static final int TAM = 5;
    public static void main(String [] args){
       
        Pessoa[] pessoas = new Pessoa[TAM];
        
        preencherPessoas(pessoas);
        bubblerSortPorNome(pessoas, TAM);
        imprimirPessoa(pessoas, TAM);


    }
    public static void cadastrarPessoa(Pessoa p){
        System.out.printf("Preencha os campos:\n");
        System.out.printf("Nome:\n");
        p.nome = scanner.nextLine();
        System.out.printf("Idade:\n");
        p.idade = scanner.nextInt();
        System.out.printf("Peso:\n");
        p.peso = scanner.nextDouble();
        System.out.printf("Altura:\n");
        p.altura = scanner.nextDouble();
        scanner.nextLine();
        
    }
   
    
    public static void preencherPessoas(Pessoa[] vp){
        for(int i = 0; i < vp.length ; i +=1 ){
            System.out.printf(" --------- Pessoa %d ---------", i + 1);
            vp[i] = new Pessoa();
            cadastrarPessoa(vp[i]);            

        }

    }
    public static int buscaPornome(Pessoa[] p, int tam, String nome){
        for(int i = 0 ; i <= tam; i += 1){
            if(p[i].nome.compareToIgnoreCase(nome) == 0){
               return 1; 
            }
        }
        return -1;
    }
    public static void bubblerSortPorNome(Pessoa[] p, int n){
        Pessoa aux;
        int pos = -1, fim = - 2;
        boolean troca= true;
        while (troca) {
            troca = false;
            for(int i = 0; i < fim ; i += 1){
                if( p[i].nome.compareTo(p[i + 1].nome) > 0){
                    aux = p[i];
                    p[i] = p[i + 1];
                    p[i + 1] = aux;
                    troca = true;
                }
                pos = i;
            }
        }
    }
    public static void imprimirPessoa(Pessoa[] p, int tam){
        for(int i = 0; i < tam; i += 1){
            System.out.printf("Pessoa %d \n [ %d - %d - %d - %d ]", i , p.nome , p.idade, p.peso, p.altura);

        }
    }
    
    
}