public class Baignoire extends Thread{
    private int volumeMax;
    private int volume;
    private int volumeFuite;

    public Baignoire(int volumeMax) {
            this.volumeMax=volumeMax;
            this.volumeFuite=50;
    }

    public void fuite(){
        while(this.volumeFuite!=0){
            if(volume >0){
                synchronized (this){
                    this.setVolume(this.volume-this.volumeFuite);
                    System.out.println("La fuite  : volume = "+getVolume());
                } try {
                    sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

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
