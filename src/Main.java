public class Main {
    public static void main(String[] args) {
        Baignoire baignoire=new Baignoire(1000);
        Robinet robinet= new Robinet(baignoire,10);
        //robinet.debite();
        //baignoire.fuite();
        ThreadBaignoire threadBaignoire = new ThreadBaignoire(baignoire);
        ThreadRobinet threadRobinet= new ThreadRobinet(robinet);

        threadRobinet.start();
        threadBaignoire.start();

    }
}
