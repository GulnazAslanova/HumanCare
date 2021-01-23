package CodeChallenge;

import java.util.ArrayList;
import java.util.List;

public class TestPrimeNumber {
    public static void main(String[] args) {
        primeNumber n1 = new primeNumber();
        System.out.println(n1.generate(7920, 7900));

    }
}

class primeNumber implements PrimeNumberGenerator {

    @Override
    public List<Integer> generate(int startingValue, int endingValue) {

        Boolean checkPrime = true;
        List<Integer> list = new ArrayList<Integer>();

        if (startingValue < endingValue) {
            for (int j = startingValue; j <= endingValue; j++) {
                checkPrime = isPrime(j);
                if (checkPrime) {
                    list.add(j);
                }
            }
        }

        if (startingValue > endingValue) {
            for (int i = startingValue; i >= endingValue; i--) {
                checkPrime = isPrime(i);
                if (checkPrime) {
                    list.add(i);
                }

            }
        }
        return list;


    }

    @Override
    public boolean isPrime(int value) {

        int remainder;
        for (int i = 2; i <= value / 2; i++) {
            remainder = value % i;

            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}

