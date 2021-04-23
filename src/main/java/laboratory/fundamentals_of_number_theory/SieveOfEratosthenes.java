package laboratory.fundamentals_of_number_theory;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Нахождения последовательности простых чисел,
 * не превосходящих данного N, на основе алгоритма Эратосфена
 */
public class SieveOfEratosthenes {
    private SieveOfEratosthenes() {
    }

    public static int[] sieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers.stream().mapToInt(i -> i).toArray();
    }
}
