import Calculator.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class SampleTest {

    private final CalculateHandler calculateHandler = new CalculateHandlerImpl();
    //private final Calculator calculator = new Calculator(calculateHandler);

    @Test
    void sample_test() {
        int target = 1 + 2;
        assertThat(target).isEqualTo(3);
    }

    @Test
    @DisplayName("1 + 2 * 3 - 4 / 5 = 1")
    void calculate_test1() {
        Deque<Integer> numIter = new ArrayDeque<>(List.of(1, 2, 3, 4, 5));
        Deque<String> operatorIter = new ArrayDeque<>(List.of("+", "*", "-", "/"));

        int res = calculateHandler.calculate(numIter, operatorIter);

        assertThat(res).isEqualTo(1);
    }

    @Test
    @DisplayName("2 + 3 * 4 - 2 = 10")
    void calculate_test2() {
        Deque<Integer> numIter = new ArrayDeque<>(List.of(2, 3, 4, 2));
        Deque<String> operatorIter = new ArrayDeque<>(List.of("+", "*", "/"));

        int res = calculateHandler.calculate(numIter, operatorIter);

        assertThat(res).isEqualTo(10);
    }

    @Test
    @DisplayName("1 + 0 - 10 * 5 / 9 = -5")
    void calculate_test3() {
        Deque<Integer> numIter = new ArrayDeque<>(List.of(1, 0, 10, 5, 9));
        Deque<String> operatorIter = new ArrayDeque<>(List.of("+", "-", "*", "/"));

        int res = calculateHandler.calculate(numIter, operatorIter);

        assertThat(res).isEqualTo(-5);
    }

    @Test
    @DisplayName("10 + 20 * 30 - 40 / 10 = 86")
    void calculate_test4() {
        Deque<Integer> numIter = new ArrayDeque<>(List.of(10, 20, 30, 40, 10));
        Deque<String> operatorIter = new ArrayDeque<>(List.of("+", "*", "-", "/"));

        int res = calculateHandler.calculate(numIter, operatorIter);

        assertThat(res).isEqualTo(86);
    }
}
