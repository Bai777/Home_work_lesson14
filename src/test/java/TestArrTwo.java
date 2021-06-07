import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.Arrays;
import java.util.Collection;

public class TestArrTwo {


    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 4, 1, 4}, false},
                {new int[]{1, 1, 4, 1, 4}, true},
                {new int[]{1, 4, 4, 1, 5}, false},
                {new int[]{1, 4, 1, 1, 4}, true},
                {new int[]{1, 4, 4, 1, 4}, true},
        });
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testArrayTwo(int[] arr, boolean result){
        Assertions.assertEquals(result, WorkingWithArrays.arrayCheckTwoArr(arr));
    }
}
