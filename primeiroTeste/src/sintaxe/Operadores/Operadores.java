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

        System.out.println();
        int number1 = 22;
        int number2 = 13;
        boolean simNao = number1 == number2;
        if(simNao)
            System.out.println("Números iguais!!");
        else
            System.out.println("Números diferentes, simNao = "+ simNao);

        System.out.println();

        String nomeUm = "Kaike";
        String nomeDois = "Kaike";

        System.out.println("Utilizando operador de igualdade  = " + (nomeUm == nomeDois));
        nomeDois = new String("Kaike");
        System.out.println("Utilizando operador de igualdade depois de declarar New String = " + (nomeUm == nomeDois));
        System.out.println("Utilizando equals = " + nomeUm.equals(nomeDois));

        System.out.println();

        if((nomeUm == "Kaike") && (number1 == 22)){
            System.out.println("Verdade!!");
        }
        if((nomeUm == "Kaike") || (number1 == 13)){
            System.out.println("Verdade!!");
        }
        if((nomeUm == "KAIKE") && (number1 == 22)){
            System.out.println("Verdade!!");
        }
        else
            System.out.println("Falso!!");
    }
}


