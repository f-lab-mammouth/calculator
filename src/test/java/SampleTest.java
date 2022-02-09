import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SampleTest {

    @Test
    void sample_test() {
        int target = 1 + 2;
        assertThat(target).isEqualTo(3);
    }
}
