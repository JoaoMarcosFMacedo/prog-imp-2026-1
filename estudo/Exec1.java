import java.util.Scanner;
public class Exec1{
    public static Scanner scanner = new Scanner(System.in);
    public static final int ANO_FINAL = 2026;
    public static int idade;
    public static void main( String [] args){

        int idade = 0, qtsPesosa = 0 , somaIdade = 0;
        double media;
        
        System.out.println("Óla, professor!");

        ReceberIdade();
        scanner.nextLine(); //para receber o entrer do número;

        System.out.printf("Sua idade é %d ", idade);

        System.out.println();

        System.out.print("e Qual o seu nome? ");
        String nome = scanner.nextLine();

        System.out.printf("%s , que nome bonito!", nome);
        System.out.println();

        if( idade >= 18 ){
            System.out.printf("Sua idade : %d", idade);
        }
        
        else{
            System.out.printf("Sua idade: %d", idade);
        }
        System.out.println();

        if (idade < 16 ){
            System.out.printf("Idade: %d - Você não é obrigatorio votar", idade);
        } else if( idade < 18 ){
            System.out.printf("Idade: %d - Seu voto é facultativo.", idade);
        } else if( idade < 60 ){
            System.out.printf("Idade %d -  Seu voto é obrigatorio", idade);
        } else {
            System.out.printf("Idade %d - Seu não é mais necessário votar", idade);
        }
        System.out.println();
        int anoNasc = ANO_FINAL - idade;
        System.out.printf("Você provavelmente nasceu em %d ", idade);

        for(int i = 0; i < 15; i ++){
            System.out.printf("%d", i);
        }
        
        for (int i = 1; i<= qtsPesosa; i+= 1){
            // qtsPessoa +=1;
            somaIdade += idade;

            System.out.println("Digite sua idade");
            idade = scanner.nextInt();
            System.out.println();
            System.out.printf("Quantidade de pessoas: %d° - Soma da idade: %d", i, somaIdade);

        }
        
        if(qtsPesosa>=1){
            media = somaIdade / qtsPesosa ;
            System.out.printf(" A média é %f" , media);
            System.out.println();
        }
        else {
            System.out.println("Nenhuma pessoa foi cadastrada");
        }

    }
    public static int ReceberIdade(){
        System.out.println("Digite sua idade");
        idade = scanner.nextInt();
        while( idade <= 0 ){
            System.out.println("idade inválida, tente novamente");
            idade = scanner.nextInt();
        }
        return idade;
    }

}