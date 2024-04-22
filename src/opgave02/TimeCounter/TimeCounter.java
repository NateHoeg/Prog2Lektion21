package opgave02.TimeCounter;

import opgave02.primenumbers.PrimeNumberGenerator;
import opgave02.primenumbers.SieveOfEratosthenes;

import java.time.Duration;
import java.time.Instant;

public class TimeCounter extends TimeCounterDecorator{

    public TimeCounter(PrimeNumberGenerator primeNumberGenerator) {
        super(primeNumberGenerator);
    }

    @Override
    public void findPrimeNumbers(int n) {
        Instant start = Instant.now();

        primeNumberGenerator.findPrimeNumbers(n);

        System.out.println();
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis() + " ms.");
    }
}
