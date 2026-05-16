package Class;
import java.util.Scanner;
public class Aula8{
    public static Scanner scanner = new Scanner(System.in);
    public static Pessoa pessoa = new Pessoa();
    public static void main(String [] args ){
        preencherPessoa(pessoa);
        System.out.println();
        imprimirPessoa(pessoa);

    }
    public static void preencherPessoa(Pessoa p){

        System.out.printf("Digite o nome da pessoa\n");
        p.nome = scanner.next();
        System.out.printf("Digite a idade da pessoa\n");
        p.idade = scanner.nextInt();
        System.out.printf("Digite a altura e o peso da pessoa {\n");
        System.out.printf("altura:\n");
        p.altura = scanner.nextDouble();
        System.out.printf("peso:\n");
        p.peso = scanner.nextDouble();
        System.out.printf("}");

    }
    public static void imprimirPessoa(Pessoa p){
        System.out.printf("[ Nome: %s | idade: %s | peso: %s | altura %s ]", p.nome, p.idade, p.peso, p.altura);
    }

}