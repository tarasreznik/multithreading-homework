package impl;

import java.util.concurrent.Semaphore;

public class FizzBuzz {
    private int n;
    private Semaphore semNumber;
    private Semaphore semFizz;
    private Semaphore semBuzz;
    private Semaphore semFizzBuzz;

    public FizzBuzz(int n) {
        this.n = n;
        semNumber = new Semaphore(1);
        semFizz = new Semaphore(0);
        semBuzz = new Semaphore(0);
        semFizzBuzz = new Semaphore(0);
    }

    public void fizz(FizzBuzzRunner printFizz) throws InterruptedException {
        for (int counter = 3; counter <= n; counter += 3) {
            semFizz.acquire();
            printFizz.print();

            if ((counter + 3) % 5 == 0) {
                counter += 3;
            }

            semNumber.release();
        }
    }

    public void buzz(FizzBuzzRunner printBuzz) throws InterruptedException {
        for (int counter = 5; counter <= n; counter += 5) {
            semBuzz.acquire();
            printBuzz.print();

            if ((counter + 5) % 3 == 0) {
                counter += 5;
            }

            semNumber.release();
        }
    }

    // printFizzBuzz.print() outputs "fizzbuzz".
    public void fizzbuzz(FizzBuzzRunner printFizzBuzz) throws InterruptedException {
        for (int counter = 15; counter <= n; counter += 15) {
            semFizzBuzz.acquire();
            printFizzBuzz.print();
            semNumber.release();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        for (int counter = 1; counter <= n; counter++) {
            semNumber.acquire();

            if (counter % 15 == 0) {
                semFizzBuzz.release();

            } else if (counter % 5 == 0) {
                semBuzz.release();

            } else if (counter % 3 == 0) {
                semFizz.release();

            } else {
                printNumber.accept(counter);
                semNumber.release();
            }
        }
    }
}
