package timecomplexty;

import java.util.Arrays;

public class PermMissingElem {

    /*
        Inputs
        Array with N different integers
            Range: 1 ... (N+1)

        Output Missing element in array
     */

    public int missingValue(int [] A){

        //when N = 0, returns N+1
        if(A.length == 0) return 1;

        //when N=1, if number is 1, then return 2 as missing element
        if(A.length == 1) {
            if(A[0] == 1) return 2;

            //else, the number is 2 then return 1
            return 1;
        }

        //Sort elements to be abble to check current index and next index
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            //if current number is different from current number + 1 then this is the missing element
            if(A[i] != i+1) return i+1;
        }

        //if the missing element is the last one
        return A.length+1;
    }

}
