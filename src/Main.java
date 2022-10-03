import impl.*;

public class Main {
    public static void main(String[] args) {

//        SecondsThread thread1 = new SecondsThread();
//        FiveSecondsThread thread2 = new FiveSecondsThread();
//        thread1.start();
//        thread2.start();


        FizzBuzz fizzBuzz = new FizzBuzz(15);
        Runnable printFizzBuzz = new PrintFizzBuzz(fizzBuzz);
        Runnable printFizz = new PrintFizz(fizzBuzz);
        Runnable printBuzz = new PrintBuzz(fizzBuzz);
        Runnable printNumber = new IntConsumer(fizzBuzz);

        Thread threadA = new Thread(printFizzBuzz);
        Thread threadB = new Thread(printFizz);
        Thread threadC = new Thread(printBuzz);
        Thread threadD = new Thread(printNumber);

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}
