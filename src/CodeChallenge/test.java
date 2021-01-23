package CodeChallenge;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {

        giveMePrimeNumbers(7900,7920);
    }

    public static List<Integer> giveMePrimeNumbers(int beginning, int ending) {

        List<Integer> primeNumbers = new ArrayList<>();

        int Begin = beginning < ending ? beginning : ending;
        int Ending = ending > beginning ? ending : beginning;

        for (int i = Begin; i <= Ending; i++) {
            int num = i;
            boolean flag = false;
            for (int j = 2; j <= num / 2; ++j) {

                if (num % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                primeNumbers.add(num);
            }
        }
        for (int a:primeNumbers ){
            System.out.println(a);
        }
        return primeNumbers;
    }
}
