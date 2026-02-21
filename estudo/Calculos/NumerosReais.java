import java.util.Scanner;
public class NumerosReais{
    public static Scanner scanner = new Scanner(System.in);

    public static void main (String [] args){

        double n1 = 8.8;
        double n2 = 9;
        double n3 = 3.5; 

        System.out.println();
        System.out.print("Nesse progama vamos ver se um número pertence ao grupo dos números naturais, números racionais ou números dos inteiros.");
        System.out.println("Uma exemplo de cada: ");
        System.out.println("Número natural representado por N são números positivos 0, 1, 2, 3, 4 ... ");
        System.out.println("Números inteiros representado por Z são os números negaticos e positvos  ... -3, -2 , -1, 0 , 1, 2, 3 ...");
        System.out.println("Números racionais representado por Q são quaisquer número ... 0,333, 1, 0, 2,3...");
        System.out.println();
        if( n1 %2 == 0){
            System.out.printf("%.2f é um número inteiro", n1);
        }else {
            System.out.printf("%.2f não é um númro inteiro", n1);
        }
        System.out.println();   
        

    }
}