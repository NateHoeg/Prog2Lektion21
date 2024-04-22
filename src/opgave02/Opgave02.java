package opgave02;

import opgave02.TimeCounter.TimeCounter;
import opgave02.primenumbers.PrimeNumberGenerator;
import opgave02.primenumbers.SieveOfEratosthenes;

public class Opgave02 {
    public static void main(String[] args) {

        PrimeNumberGenerator sieve = new SieveOfEratosthenes();
        sieve = new TimeCounter(sieve);
        sieve.findPrimeNumbers(10000000);
    }
}
