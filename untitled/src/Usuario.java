public class Usuario {
    public static void main(String[] args){
        SmartTV smartTV = new SmartTV();

        System.out.println("Status inicial = " + smartTV.ligada);
        System.out.println("Canal inicial = " + smartTV.canal);
        System.out.println("Volume inicial = " + smartTV.volume);
        System.out.println();

        smartTV.imprimirTV();

        smartTV.ligar();

        System.out.println();
        System.out.println("Novo status! \n");
        smartTV.imprimirTV();
        System.out.println();


        smartTV.desligar();

        System.out.println("Novo status! \n");
        smartTV.imprimirTV();
        System.out.println();

        smartTV.aumentarVolume();
        smartTV.ligar();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.canalSeguinte();

        System.out.println("Novo status! \n");

        smartTV.imprimirTV();

        smartTV.mudarCanal(4);
        smartTV.abaixarVolume();
        smartTV.canalAnterior();

        System.out.println();
        System.out.println("Novo status! \n");

        smartTV.imprimirTV();

    }
}
