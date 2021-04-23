package laboratory.fundamentals_of_number_theory;

public class EulerTotientFunction {
    private EulerTotientFunction() {
    }

    public static int phi(int n) {
        int result = 1;
        for (int i = 2; i < n; i++) {
            if (GreatestCommonDivisor.gcdByEuclidsAlgorithm(i, n) == 1) {
                result++;
            }
        }
        return result;
    }
}
