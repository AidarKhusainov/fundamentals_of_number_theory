package laboratory.fundamentals_of_number_theory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SieveOfEratosthenesTest {

    @Test
    void sieveOfEratosthenes() {
        for (Map.Entry<Integer, int[]> item : primeNumberWithResult().entrySet()) {
            assertArrayEquals(item.getValue(), SieveOfEratosthenes.sieveOfEratosthenes(item.getKey()));
        }
    }

    private Map<Integer, int[]> primeNumberWithResult() {
        return new HashMap<Integer, int[]>() {{
            put(-1, new int[]{});
            put(0, new int[]{});
            put(1, new int[]{});
            put(2, new int[]{2});
            put(3, new int[]{2, 3});
            put(18, new int[]{2, 3, 5, 7, 11, 13, 17});
        }};
    }
}