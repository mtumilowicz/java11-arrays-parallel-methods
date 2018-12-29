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
    * `parallelPrefix​(int[] array, IntBinaryOperator op)`
    * `parallelPrefix​(int[] array, int fromIndex, int toIndex, IntBinaryOperator op)`
    * similar methods for: 
        * `double[]` and `DoubleBinaryOperator`
        * `long[]` and `LongBinaryOperator`
        * `T[]` and `BinaryOperator<T>`
* **parallelSort**
    

# project description

