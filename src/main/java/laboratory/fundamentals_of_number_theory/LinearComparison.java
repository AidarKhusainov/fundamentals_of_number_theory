package laboratory.fundamentals_of_number_theory;

import java.math.BigInteger;

public class LinearComparison {
    private LinearComparison() {
    }


    /**
     * Поиск решения для выражения типа ax = b (mod m)
     * @return Возвращает массив из 2-х элементов int: [0] - b, [1] - mod
     * @throws Exception
     */
    public static int[] findSolution(int a, int b, int m) throws Exception {
        int g = GreatestCommonDivisor.gcdByEuclidsAlgorithm(a, m);

        if (b % g != 0) {
            throw new Exception("Нет решений!");
        }

        a = a / g;
        b = b / g;
        m = m / g;

        BigInteger res = BigInteger.valueOf(a)
                .modPow(BigInteger.valueOf(-1), BigInteger.valueOf(m))
                .multiply(BigInteger.valueOf(b))
                .mod(BigInteger.valueOf(m));

        return new int[]{res.intValue(), m};
    }
}
