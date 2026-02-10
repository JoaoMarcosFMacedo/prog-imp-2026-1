import java.util.Scanner;
public class Exec01{
    public static Scanner scanner = new Scanner(System.in);
    public static void main( String [] args){
        System.out.println("Óla, professor!");
        int idade;
        idade = scanner.nextInt();
        System.out.println(idade);
        scanner.nextInt(); //para receber o entrer do número;
        String nome = scanner.nextLine();
    }

}