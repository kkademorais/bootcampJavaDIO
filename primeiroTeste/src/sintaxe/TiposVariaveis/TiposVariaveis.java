package sintaxe.TiposVariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500;
        System.out.println("Valor do salário mínimo desse ano = R$" + salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        salarioMinimo = 3000;
        System.out.println("Previsão do valor do salário mínimo para o ano q vem = R$" + salarioMinimo);

        final double VALOR_PI = 3.14;
    }
}
