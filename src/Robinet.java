public class Robinet {
    private Baignoire baignoire;
    private int volumeDebite;

    public Robinet(Baignoire baignoire,int volumeDebite){
        this.baignoire=baignoire;
        this.volumeDebite=volumeDebite;
    }

    public void debite(){
        do {
            this.baignoire.setVolume(this.baignoire.getVolume()+this.volumeDebite);
            System.out.println("La baignoire se remplie à : "+baignoire.getVolume());
        }while(this.baignoire.getVolume()<this.baignoire.getVolumeMax());
        System.out.println("La baignoire est remplie");
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
