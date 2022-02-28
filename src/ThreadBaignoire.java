public class ThreadBaignoire extends Thread{
    private Baignoire baignoire;
    public ThreadBaignoire(Baignoire baignoire) {
        this.baignoire=baignoire;
    }

    @Override
    public void run() {
        synchronized (baignoire){
            baignoire.fuite();
        }
    }
}
