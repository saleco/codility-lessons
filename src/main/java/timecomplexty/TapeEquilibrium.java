package timecomplexty;

public class TapeEquilibrium {
    /*
        Inputs
            Non empty array consisting of N integers

        Output: Minimum Difference

        Assumptions:
            N is an integer within the range [2..100,000];
            each element of array A is an integer within the range [−1,000..1,000].
     */

    //Complexity O(N*N)

    public int minDifferenceInArray(int[] A){
        Integer minValue = Integer.MAX_VALUE;

        int leftValues = 0;

        //increments leftValues
        for (int i = 0; i < A.length-1; i++) {

            leftValues+= A[i];

            int rightValues = 0;

            //increments right values
            for (int j = i+1; j < A.length; j++) {
                rightValues+= A[j];
            }

            //check the difference between left and right
            minValue = Integer.min(minValue, Math.abs(leftValues - rightValues));

        }

        return minValue;

    }

    //Complexity O(N)
    public int minDifferenceInArrayPerformatic(int []A) {

        Integer minValue = Integer.MAX_VALUE;
        int head = 0, tail = 0;

        //sum all the values to the tail side
        for (int i = 0; i < A.length; i++) tail+=A[i];

        //iterate array to sum head side and decrease tail side and then check the difference between them
        for (int i = 0; i < A.length - 1; i++) {
            head+= A[i];
            tail-=A[i];
            minValue = Integer.min(minValue, Math.abs(head - tail));
        }
        return minValue;
    }

}
