package laboratory.fundamentals_of_number_theory;

/**
 * Нахождение наибольшего общего делителя двух чисел на основе алгоритма Евклида
 */
public class GreatestCommonDivisor {

    private GreatestCommonDivisor() {
    }

    public static int gcdByEuclidsAlgorithm(int n1, int n2) {
        return (n2 != 0) ? gcdByEuclidsAlgorithm(n2, n1 % n2) : n1;
    }
}
