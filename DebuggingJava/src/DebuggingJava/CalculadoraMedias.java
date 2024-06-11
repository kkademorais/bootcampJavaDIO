package DebuggingJava;
import java.util.Scanner;
import java.util.Locale;

public class CalculadoraMedias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String alunos[] = {"Kaike", "Barreto", "Vimieiro", "Pistola", "Vidrado", "Moto Moto"};

        double media = calculaMediaBonde(alunos, scanner);

        System.out.printf("\nA média do bonde é %.2f \n", media);

    }
    public static double calculaMediaBonde(String alunos[], Scanner scanner){
        double mediaBonde = 0;
        for (String aluno : alunos) {
            System.out.printf("\nDigite sua nota %s: ", aluno);
            double nota = scanner.nextDouble();
            mediaBonde += nota;
        }
        return mediaBonde / alunos.length;
    }
}
