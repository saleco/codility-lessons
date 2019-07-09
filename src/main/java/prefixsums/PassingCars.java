package prefixsums;

public class PassingCars {

    public int countPassingCars(int[] A){
        int zeroCount = 0, pairs = 0;

        for (int i = 0; i < A.length; i++) {
            //count the number of zeros
            if(A[i] == 0) {
                zeroCount++;
            }
            else if(A[i] == 1) {
                //increment the number of pairs with the count of zeros
                // (since for each zero and one found, you have the number of zero pairs
                pairs+= zeroCount;

                //rule of greater than 1 bilion pairs
                if(pairs > 1000000000) return -1;
            }
        }

        return pairs;
    }
}
