package impl;

public class PrintFizzBuzz extends FizzBuzzRunner {

    public PrintFizzBuzz(FizzBuzz fizzBuzz) {
        super(fizzBuzz);
    }

    @Override
    public void run() {
        try {
            this.fizzBuzz.fizzbuzz(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void print() {
        System.out.println("fizzbuzz");
    }
}

