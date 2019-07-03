package countingelements;

import java.util.Arrays;

public class PermCheck {

    /*
        Input: Non Empty Integers Array
     */
    public int isPermutation(int[] A){
        //if there is only one element and it is one, it is a permutation
        if(A.length == 1 && A[0] == 1){
            return 1;
        } else if(A.length == 1 && A[0] > 1){
            return 0;
        }

        //sorts the array to check later easier
        Arrays.sort(A);

        //check if current position in array is is different then i+1
        //if so, it is not a permutation
        for (int i = 0; i < A.length; i++) {
            if(A[i] != i+1) return 0;
        }


        return 1;
    }

}
