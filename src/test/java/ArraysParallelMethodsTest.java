import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mtumilowicz on 2018-12-29.
 */
public class ArraysParallelMethodsTest {

    @Test
    public void parallelPrefix() {
        int[] binaryArray = {0, 0, 1, 0, 1, 1, 1, 0, 1};

        Arrays.parallelPrefix(binaryArray, (x, y) -> x + y);

        assertThat(binaryArray, is(new int[]{0, 0, 1, 1, 2, 3, 4, 4, 5}));
    }

    @Test
    public void parallelSetAll_oneIfEven_zeroIfOdd() {
        int[] array = new int[5];

        Arrays.parallelSetAll(array, index -> index % 2 == 0 ? 1 : 0);

        assertThat(array, is(new int[]{1, 0, 1, 0, 1}));
    }

    @Test
    public void parallelSort() {
        int[] array = {5, 3, 4, 0, 1, 2};
        
        Arrays.parallelSort(array);

        assertThat(array, is(new int[]{0, 1, 2, 3, 4, 5}));
    }
}
