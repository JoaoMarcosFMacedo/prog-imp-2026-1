import java.util.Scanner;
public class Exec01{
    public static Scanner scanner = new Scanner(System.in);
    public static final int ANO_FINAL = 2026;
    public static void main( String [] args){

        int idade;

        System.out.println("Óla, professor!");
        System.out.print("Digite sua idade:");

        idade = scanner.nextInt();

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
    }

}