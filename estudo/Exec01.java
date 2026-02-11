import java.util.Scanner;
public class Exec01{
    public static Scanner scanner = new Scanner(System.in);
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

        
    }

}