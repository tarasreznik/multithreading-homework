package impl;

public class PrintFizz extends FizzBuzzRunner {

    public PrintFizz(FizzBuzz fizzBuzz) {
        super(fizzBuzz);
    }

    @Override
    public void run() {
        try {
            this.fizzBuzz.fizz(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void print() {
        System.out.println("fizz");
    }
}