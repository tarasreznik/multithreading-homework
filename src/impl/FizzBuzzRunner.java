package impl;

abstract class FizzBuzzRunner implements Runnable {

    protected FizzBuzz fizzBuzz;

    public FizzBuzzRunner(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    abstract protected void print();
}