/*
* Find Missing Number in an Array
* Example: [1, 2, 4, 5, 6] → 3
*
* */

import java.util.stream.IntStream;

public class FindMissingNumberInArray {

    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 5, 6};
        int n = arrayInt.length+1;
        int totalSum = n * (n + 1) / 2;
        int actualSum = IntStream.of(arrayInt).sum();
        System.out.println("Missing number = "+ (totalSum-actualSum));

    }
}
