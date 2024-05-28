package sintaxe.Metodos;

public class Metodos {
    public double somar(int n1, int n2){
        return n1 + n2;
    }

    public double dividir(int dividendo, int divisor)throws Exception{}

    private  void metodoPrivado(){}

    public void gravarCliente(String nome, String cpf, int idade){
        //Por que não enviar um objeto Cliente como parâmetro??
    }

    public void gravarCliente(Cliente cliente){}

    public static void main(String[] args) {

    }
}
