package impl;

public class PrintBuzz extends FizzBuzzRunner {

    public PrintBuzz(FizzBuzz fizzBuzz) {
        super(fizzBuzz);
    }

    @Override
    public void run() {
        try {
            this.fizzBuzz.buzz(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void print() {
        System.out.println("buzz");
    }
}
