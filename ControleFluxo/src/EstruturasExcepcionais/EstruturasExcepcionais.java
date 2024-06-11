package EstruturasExcepcionais;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class EstruturasExcepcionais {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.printf("Nome = %s \n", nome);
            System.out.printf("Sobrenome = %s \n", sobrenome);
            System.out.printf("Idade = %d \n", idade);
            System.out.printf("Altura = %.2f \n", altura);

            Number valor = null;
            try {
                valor = NumberFormat.getInstance().parse("a1.75");
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

            System.out.println(valor);



        }
        catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos!!");
        }
    }
}
