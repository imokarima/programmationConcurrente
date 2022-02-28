import static java.lang.Thread.sleep;

public class Robinet {
    private Baignoire baignoire;
    private int volumeDebite;

    public Robinet(Baignoire baignoire,int volumeDebite){
        this.baignoire=baignoire;
        this.volumeDebite=volumeDebite;
    }

    public void debite(){
        while(this.baignoire.getVolume()<this.baignoire.getVolumeMax()) {
            synchronized (baignoire){
                if(!((this.baignoire.getVolume()+volumeDebite)>this.baignoire.getVolumeMax())){
                    this.baignoire.setVolume(this.baignoire.getVolume()+this.volumeDebite);
                    System.out.println("Le debite  : volume = "+baignoire.getVolume());
                    if(this.baignoire.getVolume()==this.baignoire.getVolumeMax()){
                        return ;
                    }
                }
            }
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }


    public Baignoire getBaignoire() {
        return baignoire;
    }

    public void setBaignoire(Baignoire baignoire) {
        this.baignoire = baignoire;
    }

    public int getVolumeDebite() {
        return volumeDebite;
    }

    public void setVolumeDebite(int volumeDebite) {
        this.volumeDebite = volumeDebite;
    }
}
