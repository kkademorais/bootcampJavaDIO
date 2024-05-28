public class Usuario {
    public static void main(String[] args){
        SmartTV smartTV = new SmartTV();

        System.out.println("Status inicial = " + smartTV.ligada);
        System.out.println("Canal inicial = " + smartTV.canal);
        System.out.println("Volume inicial = " + smartTV.volume);
        System.out.println();

        /*if(smartTV.ligada) {
            System.out.printf("A nossa Smart TV está %b no canal %d e no volume %d \n", smartTV.ligada, smartTV.canal, smartTV.volume);
        }
        else {
            System.out.println("Tv está " + smartTV.ligada);
        }*/
        smartTV.imprimirTV();

        smartTV.ligar();

        System.out.println();
        System.out.println("Novo status! \n");
        smartTV.imprimirTV();
        System.out.println();

        smartTV.aumentarVolume(smartTV.volume);
        smartTV.aumentarVolume(smartTV.volume);
        smartTV.aumentarVolume(smartTV.volume);

        System.out.println("Novo status! \n");
        smartTV.imprimirTV();
        System.out.println();
    }
}
