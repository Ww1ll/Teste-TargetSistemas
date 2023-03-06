import java.util.Scanner;

public class verificaFibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int n1 = 0;
        int n2 = 1;
        int soma = 0;

        System.out.println("Verificar se o número faz parte da sequência de fibonacci");
        System.out.println("");

        System.out.println("informe um número: ");
        numero = sc.nextInt();

        while(n1 < numero){
            soma = n1 + n2;
            n1 = n2;
            n2 = soma;
        }

        if( n1 == numero){
            System.out.println("O número escolhido pertence à sequência de fibonacci");
        } else {
            System.out.println("O número escolhido não pertence à sequência de fibonacci");
        }

        sc.close();
    }
}
