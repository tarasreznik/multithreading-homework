package impl;

public class FiveSecondsThread extends Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            long time = (System.currentTimeMillis() - start) / 1000;
            System.out.println("Program is running " + time + " seconds");

        }
    }
}
