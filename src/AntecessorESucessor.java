import java.util.Scanner;

public class AntecessorESucessor {
    public static void main(String[] args) {
        int numero;
        int sucessor;
        int antecessor;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        numero = sc.nextInt();

        sucessor = numero + 1;
        antecessor = numero - 1;

        System.out.println("O antecessor de " + numero + " é " + antecessor + " e o sucessor é " + sucessor);
        sucessor = sc.nextInt();

    }
}
