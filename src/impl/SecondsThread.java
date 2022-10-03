package impl;

public class SecondsThread extends Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            long time = (System.currentTimeMillis() - start) / 1000;
            System.out.println(time);

        }
    }
}
