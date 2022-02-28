public class Baignoire extends Thread{
    private int volumeMax;
    private int volume;
    private int volumeFuite;

    public Baignoire(int volumeMax) {

            this.volumeMax=volumeMax;
            this.volumeFuite=5;
    }

    public void fuite(){
        do {
            if (volume >0 && volume <=this.volumeMax){
                this.setVolume(this.volume-this.volumeFuite);
                System.out.println("La baignoire est à  : "+getVolume());

            }

        }while(this.volumeFuite>0);
        System.out.println("La baignoire est vide");
    }

    public int getVolumeMax() {
        return volumeMax;
    }


    public int getVolume() {
            return volume;
        }


    public void setVolume(int volume) {
            this.volume = volume;
    }
}
