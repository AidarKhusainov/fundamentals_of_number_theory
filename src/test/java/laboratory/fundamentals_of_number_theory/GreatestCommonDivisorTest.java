package laboratory.fundamentals_of_number_theory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatestCommonDivisorTest {

    @ParameterizedTest
    @CsvSource({
            "3, 111, 321",
            "132, 396, 1452",
            "1, 25, 9",
            "1, 9, 25",
            "10, 20, 10",
    })
    void gcdByEuclidsAlgorithm(int result, int a, int b) {
        assertEquals(result, GreatestCommonDivisor.gcdByEuclidsAlgorithm(a, b));
    }
}