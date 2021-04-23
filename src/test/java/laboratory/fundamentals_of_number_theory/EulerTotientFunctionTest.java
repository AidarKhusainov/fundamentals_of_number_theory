package laboratory.fundamentals_of_number_theory;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class EulerTotientFunctionTest {

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 1", "3, 2", "4, 2", "5, 4", "6, 2"})
    void phi(int n, int result) {
        assertEquals(result, EulerTotientFunction.phi(n));
    }
}