package sintaxe.anatomiaClasses;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World");

        String nome = "Kaike";
        String sobrenome = "de Morais Carvalho";

        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.printf("O nome do maior programador do Brasil é %s \n", nomeCompleto);


    }

    public static String nomeCompleto(String nome, String sobrenome) {
        return nome.concat(" ").concat(sobrenome);
    }
}