package EstruturasCondicionais;

import java.util.Scanner;
import java.util.Locale;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo) {
            saldo -= valorSolicitado;
            System.out.println(saldo);
        }
        else{
            System.out.println("Saldo insuficiente!");
            System.out.println(saldo);
        }

        int nota = 6;
        String resultado = nota < 6 ? "Reprovado!" : nota == 6 ? "Conselho de classe!!" : "Aprovado!";
        System.out.printf("Resultado utilizando operador ternário = %s \n", resultado);

        if(nota < 6)
            System.out.println("Reprovado!");
        else if (nota == 6)
            System.out.println("Conselho de classe!!");
        else
            System.out.println("Aprovado!");

        double participacao = 70.5;

        if(nota < 6 && participacao < 60.0)
            System.out.println("Aluno horrível! Melhore!");
        else if (nota == 6 && participacao > 60 && participacao < 80)
            System.out.println("Aluno mediano!");
        else if (nota > 6 && participacao > 80)
            System.out.println("Excepcional!!");

        String sigla = "GG";
        switch(sigla){
            case "P": {
                System.out.println("Roupa Pequena!");
                System.out.println("Baby!");
                break;
            }
            case "M": {
                System.out.println("Roupa Média!");
                break;
            }
            case "G": {
                System.out.println("Roupa Grande!");
                System.out.println("Fortinho!");
                break;
            }
            case "GG": {
                System.out.println("Roupa Grande Gorda!");
                System.out.println("Fofinho!");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
