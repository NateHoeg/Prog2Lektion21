package opgave02.TimeCounter;

import opgave02.primenumbers.PrimeNumberGenerator;
import opgave02.primenumbers.SieveOfEratosthenes;

public abstract class TimeCounterDecorator extends PrimeNumberGenerator {

    PrimeNumberGenerator primeNumberGenerator;

    public TimeCounterDecorator(PrimeNumberGenerator primeNumberGenerator) {
        this.primeNumberGenerator = primeNumberGenerator;
    }
}
