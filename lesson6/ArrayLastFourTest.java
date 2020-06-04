
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;


public class ArrayLastFourTest {

    private Lesson6 lesson6;

    @BeforeEach
    public void init() {
        lesson6 = new Lesson6();
    }

    @ParameterizedTest
    @MethodSource("data")
    public void test14 (int[] in, int[] out) {
        Assertions.assertArrayEquals(Lesson6.afterLastFour(in), out);
    }
    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1, 4,1,7},new int[] {1,7}),
                Arguments.of(new int[]{1, 4,4,7},new int[] {7}),
                Arguments.of(new int[]{1, 4},new int[0]));
    }
}









