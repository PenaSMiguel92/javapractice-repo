package Threads;

public class Demo implements Runnable {
    @Override
    public void run() {
        int i = 0;
        do {
            System.out.println(i++);
        } while (i <= 100);
    }
    public static void main(String[] args) {
        Thread demoThread = new Thread(() -> System.out.println("running"));
        Thread demoThread2 = new Thread(() -> {
            int i = 0;
            while (i < 100) {
                System.out.println(i++);
            }
        });
        Thread demoThread3 = new Thread(() -> {
            int i = 0;
            while (i < 100) {
                System.out.println(i++);
            }
        });
        demoThread.start();
        demoThread2.start();
        demoThread3.start();
        try {
            demoThread.join();
            demoThread2.join();
            demoThread3.join();
        } catch (Exception ex) {
            System.out.println("exception occured");
        }
        
        Thread demoThread4 = new Thread(new Demo());
        demoThread4.start();
    }
}
