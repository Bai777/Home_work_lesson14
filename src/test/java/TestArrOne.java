import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class TestArrOne {

    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 4, 1, 4}, new int[]{}},
                {new int[]{1, 1, 4, 1, 4}, new int[]{}},
                {new int[]{1, 4, 4, 1, 5}, new int[]{1, 5}},
                {new int[]{1, 4, 1, 1, 5}, new int[]{1, 1, 5}},
                {new int[]{4, 1, 3, 1, 8}, new int[]{1, 3, 1, 8}},
        });
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testArrayOne(int[] arrIn, int[] arrOut){
        Assertions.assertArrayEquals(arrOut, WorkingWithArrays.arrayCheckOneArr(arrIn));
    }
}
