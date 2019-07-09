package countingelements;

import java.util.Arrays;

public class MissingInteger {

    /*
        Input
            int[] A of N integers
                N is an integer within the range [1..100,000];
                each element of array A is an integer within the range [−1,000,000..1,000,000].
        Output
            Smallest positive integer (greater than 0) that does not ocurr in A
     */
    public int smallestMissingInteger(int[] A){

        //remove duplicate entries, filter greater than zero and sorts the array
        A = Arrays.stream(A).distinct().filter(i-> i>0).sorted().toArray();

        //if there is only one position
        if(A.length == 1) {

            //if is one then return two
            if(A[0] == 1) return 2;

            //if is two, returns one
            if(A[0] == 2) return 1;
        } else if(A.length == 0) return 1; //in case of only negative numbers in array the smallest positive will be one


        //return when position i of array is different from the next position
        for (int i = 0; i < A.length; i++) {
            if(A[i] != i+1) return i+1;
        }

        //when the missing element is the last array index +1
        return A[A.length-1]+1;
    }
}
