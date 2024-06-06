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
    public void aumentarVolume(){
        if (ligada)
            volume++;
        else
            System.out.println("Tv desligada. Ligue antes para aumentar o volume! \n");
    }
    public void abaixarVolume(){
        if (ligada)
            volume--;
        else
            System.out.println("Tv desligada. Ligue antes para diminuir o volume! \n");
    }
    public void canalSeguinte(){
        if (ligada)
            canal++;
        else
            System.out.println("Tv desligada. Ligue antes pra mudar de canal! \n");
    }
    public void canalAnterior(){
        if (ligada)
            canal--;
        else
            System.out.println("Tv desligada. Ligue antes pra mudar de canal! \n");
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }


}
