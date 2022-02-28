public class ThreadRobinet extends Thread{

    private Robinet robinet;
    public ThreadRobinet(Robinet robinet) {
        this.robinet=robinet;
    }

    @Override
    public void run() {
        synchronized (robinet) {
            robinet.debite();
        }
    }
}
