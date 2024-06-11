package DebuggingJava;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciou programa -> Método: Main");
        primeiroMetodo();
        System.out.println("Finalizou programa -> Método: Main");
    }

    public static void primeiroMetodo() {
        System.out.println("Entrou no primeiro método");
        segundoMetodo();
        System.out.println("Saiu do primeiro método");
    }

    public static void segundoMetodo() {
        System.out.println("Entrou no segundo método");
        for(int i = 0; i <= 4; i++)
            System.out.println(i);
        terceiroMetodo();
        System.out.println("Saiu do segundo método");
    }

    public static void terceiroMetodo() {
        System.out.println("Entrou no terceiro método");
        Thread.dumpStack();
        System.out.println("Saiu do terceiro método");
    }
}
