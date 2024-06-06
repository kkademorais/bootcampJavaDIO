package sintaxe.aboutMe;
import java.util.Locale;
import java.util.Scanner;

public class aboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();


        System.out.printf("\nMe chamo %s %s \n", nome, sobrenome);
        System.out.printf("Tenho %d anos de idade \n", idade);
        System.out.printf("Tenho %.2f cm de altura \n", altura);
    }
}
