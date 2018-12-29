# java11-arrays-parallel-methods
_Reference_: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html

# preface
* **parallelPrefix**
    * Cumulates, in parallel, each element of the given 
    array in place,using the supplied function.
    * `parallelPrefix​(int[] array, IntBinaryOperator op)`
    * `parallelPrefix​(int[] array, int fromIndex, int toIndex, IntBinaryOperator op)`
    * similar methods for: 
        * `double[]` and `DoubleBinaryOperator`
        * `long[]` and `LongBinaryOperator`
        * `T[]` and `BinaryOperator<T>`
* **parallelSetAll**
    * Set all elements of the specified array, in parallel, 
    using the provided generator function (of index) to 
    compute each element.
    * `parallelSetAll​(int[] array, IntUnaryOperator generator)`
    * similar methods for: 
        * `double[]` and `IntToDoubleFunction`
        * `long[]` and `IntToLongFunction`
        * `T[]` and `IntFunction<? extends T>`
* **parallelSort**
    * Sorts the specified array into ascending numerical order.
    The sorting algorithm is a parallel sort-merge that breaks the
    array into sub-arrays that are themselves sorted and then 
    merged.
    * `parallelSort​(int[] a)`
    * `parallelSort​(int[] a, int fromIndex, int toIndex)`
    * similar methods for:
        * `byte[]`
        * `char[]`
        * `double[]`
        * `float[]`
        * `long[]`
        * `short[]`
        * `T[]`
    * `parallelSort​(T[] a, Comparator<? super T> cmp)`
    * `parallelSort​(T[] a, int fromIndex, int toIndex, Comparator<? super T> cmp)`

# project description
We provide examples for methods mentioned above:
* accumulate and carry sum across the array
    ```
    int[] binaryArray = {0, 0, 1, 0, 1, 1, 1, 0, 1};
    
    Arrays.parallelPrefix(binaryArray, (x, y) -> x + y);
    
    assertThat(binaryArray, is(new int[]{0, 0, 1, 1, 2, 3, 4, 4, 5}));
    ```
* fill an array that under odd index will be 0 and under even 1
    ```
    int[] array = new int[5];
    
    Arrays.parallelSetAll(array, index -> index % 2 == 0 ? 1 : 0);
    
    assertThat(array, is(new int[]{1, 0, 1, 0, 1}));
    ```
* sort array in parallel way
    ```
    int[] array = {5, 3, 4, 0, 1, 2};
    
    Arrays.parallelSort(array);
    
    assertThat(array, is(new int[]{0, 1, 2, 3, 4, 5}));
    ```