class CountThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Exp29_Multithreading {
    public static void main(String[] args) {
        CountThread t1 = new CountThread();
        CountThread t2 = new CountThread();

        t1.start();
        t2.start();
    }
}