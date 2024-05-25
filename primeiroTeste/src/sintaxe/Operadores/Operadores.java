package sintaxe.Operadores;

public class Operadores {
    public static void main(String[] args) {
        String nome = "Kaike";
        String sobrenome = " de Morais Carvalho";
        String nomeCompleto = nome + sobrenome;
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        System.out.println(concatenacao);
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+(1+1);
        System.out.println(concatenacao);

        boolean verdade = true;
        boolean mentira = !verdade;
        System.out.printf("\nVerdade é %b e Mentira é %b \n", verdade, mentira);

        System.out.println();
        int valor = 5;
        System.out.println(valor);
        valor = - valor;
        System.out.println(valor);
        valor *= -1;
        System.out.println(valor);

        System.out.println();
        int numero = 8;
        System.out.println(numero++);
        System.out.println(numero);
        System.out.println(--numero);

        System.out.println();
        int a, b;
        a = 5;
        b = 6;

        //Convencional
        if(a==b)
            System.out.println("Resultado verdadeiro!");
        else
            System.out.println("Resultado falso!");

        //Com operador ternário
        System.out.println(a == b ? "Resultado verdadeiro!" : "Resultado falso!");

    }
}
