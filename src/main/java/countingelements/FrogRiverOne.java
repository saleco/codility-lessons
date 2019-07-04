package countingelements;

public class FrogRiverOne {

    public int earliestTimeCross(int X, int[] A) {

        //creates an array of booleans with the number of positions until X (destination)
        boolean[] leafsFound = new boolean[X];

        //to count the numbers found
        long leafsFoundCount = 0;

        //Find the sum of the elements in the boolean positions array to know when all the positions are found
        long leafsFoundFinalCount = (long) ((X/2d) * (1+X));

        for (int i = 0; i < A.length; i++) {
            //if A[i] is greaten than X, discard
            if(A[i] > X) continue;

            //if leaf of boolean array already found the item
            if(leafsFound[A[i]-1]) continue;

            //fills the leaf position with true and increment the leafsFoundCount (and then, check if the leafsFoundCount is equal to the expected count
            //when it is equal, means you found all the necessary positions to the destination, then return the index of the array (it will be the seconds passed)
            leafsFound[A[i]-1] = true;
            leafsFoundCount+=A[i];
            if(leafsFoundCount == leafsFoundFinalCount) return i;
        }
        //if the booleans array it is not complete, means you cant reach the destination
        return -1;
    }

}
