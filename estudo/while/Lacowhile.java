import java.util.Scanner;

public class Lacowhile{
    
    public static Scanner scanner = new Scanner(System.in);
    public static final int idade = 0;
    public static void main( String []args){
        int B = 5;
        lacowhile();


        Rlacowhile(B);
    }

    public static void lacowhile( ){
        System.out.print("Digite um valor para x: ");
        double x = scanner.nextDouble();
        
        while( x <= idade ){

                System.out.print("Idade invalida, digite novamente: ");
                x = scanner.nextDouble();
            }
            System.out.println("Maior que 0");
        
    }



    public static int Rlacowhile( int B ){
        int c;
        System.out.println("Digite o valor para C");
        c = scanner.nextInt();

        while( c != idade){

            System.out.println("tente dnv c");
            c = scanner.nextInt();

        }
        return c;
    }
}