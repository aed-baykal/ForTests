import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class TestingLessonTest {

    @MethodSource("genValues1")
    @ParameterizedTest
    void masscopyAfterFour(int[] input, int[] result) {
        Assertions.assertEquals(result, TestingLesson.copyAfterFour(input));
    }

    @MethodSource("genValues2")
    @ParameterizedTest
    void massarrayOfOneAndFour(int[] input, boolean result) {
        Assertions.assertEquals(result, TestingLesson.arrayOfOneAndFour(input));
    }

    static Stream<Arguments> genValues2() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{1, 4, 1, 4, 1, 1, 1, 4, 4, 4, 1}, true));
        list.add(Arguments.arguments(new int[]{1, 4, 1, 4, 1, 4, 4, 1}, true));
        list.add(Arguments.arguments(new int[]{1, 4, 1, 4, 1, 4}, true));
        list.add(Arguments.arguments(new int[]{1, 4, 2, 5, 4, 5, 9, 7, 7, 3, 4, 6, 5, 7, 8}, false));
        return list.stream();
    }

    static Stream<Arguments> genValues1() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{1, 4, 1, 4, 1, 1, 1, 4, 4, 4, 1}, new int[]{1}));
        list.add(Arguments.arguments(new int[]{1, 4, 1, 4, 5, 6, 7, 8}, new int[]{5, 6, 7, 8}));
        list.add(Arguments.arguments(new int[]{1, 4, 1, 4, 5, 6, 7, 8}, new int[]{5, 6, 7}));
        list.add(Arguments.arguments(new int[]{1, 2, 5, 5, 9, 7, 7, 3, 6, 5, 7, 8}, null));
        return list.stream();
    }

}