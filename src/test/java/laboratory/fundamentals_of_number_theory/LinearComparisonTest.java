package laboratory.fundamentals_of_number_theory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LinearComparisonTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvSource({
            "17, 19, 7, 5, 19"
    })
    void findSolution(int resB, int resM, int a, int b, int m) throws Exception {

        int[] res = LinearComparison.findSolution(a, b, m);

        assertEquals(resB, res[0]);
        assertEquals(resM, res[1]);
    }
}