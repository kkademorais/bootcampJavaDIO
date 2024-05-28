public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 5;

    public void imprimirTV(){
        if(ligada) {
            System.out.printf("A nossa Smart TV está ligada %b no canal %d e no volume %d \n", ligada, canal, volume);
        }
        else {
            System.out.println("Tv está " + ligada);
        }
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(int volume){
        volume++;
    }
    public void abaixarVolume(int volume){
        volume--;
    }
}
