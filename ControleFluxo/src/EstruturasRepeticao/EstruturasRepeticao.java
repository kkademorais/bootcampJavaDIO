package EstruturasRepeticao;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class EstruturasRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Contando carneirinhos!");

        for(int carneirinhos = 1; carneirinhos <= 10; carneirinhos++){
            System.out.printf("Carneirinho número %d! \n", carneirinhos);
        }
        System.out.println("ZzZzzz");

        String alunos[] = {"KAIKE", "BARRETO", "PISTOLA", "VIDRADO"};

        for(int i = 0; i < alunos.length; i++){
            System.out.printf("O aluno no índice %d é %s \n", i, alunos[i]);
        }

        //For Each
        for(String aluno : alunos){
            System.out.println(aluno);
        }

        for(int numero = 1; numero < 6; numero++){
            if(numero == 5)
                break;
            if(numero == 3)
                continue;
            System.out.println(numero);
        }

        double mesada = 50.0;
        int numeroDoces = 0;
        while (mesada > 0){
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;
            System.out.printf("Doce de valor R$%.2f adiiconado no carrinho! \n", valorDoce);
            mesada -= valorDoce;
            numeroDoces++;
        }
        System.out.printf("Mesada = %.2f \n", mesada);
        System.out.println("Cabou a grana pra porcaria!");
        System.out.printf("Foram comprados %d doces \n", numeroDoces);

        System.out.println("Discando para o bastião...");
        do {
            System.out.println("Telefone tocando! ");
        }while(tocando());

        System.out.println("Fala comigo bastião!!");


    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu ? " + atendeu);
        return ! atendeu;
    }
}
