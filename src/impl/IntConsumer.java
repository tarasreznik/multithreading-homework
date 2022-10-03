package impl;

public class IntConsumer extends PrintFizzBuzz {

    public IntConsumer(FizzBuzz fizzBuzz) {
        super(fizzBuzz);
    }

    @Override
    public void run() {
        try {
            this.fizzBuzz.number(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void accept(int n) {
        System.out.println(n);
    }
}