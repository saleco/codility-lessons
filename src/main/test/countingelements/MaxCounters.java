package countingelements;

public class MaxCounters {

    /*
        Input: N - number of counters
               A - array whitin the range [1..N+1]
     */
    public int[] counters(int N, int[] A){

        //counters array
        int[] result = new int[N];
        int maxX = 0;


        for (int i = 0; i < A.length; i++) {
            int X = A[i];

            //when X between 1..N, increase operation
            if(X >= 1 && X <= N ) {

                //increase by 1 result array in the X position
                result[X-1] = result[X-1]+1;

                //saves the max value
                maxX = Integer.max(maxX, result[X-1]);
            }
            //when X == N+1
            else {
                //change every value of counters array to the max value
                for (int j = 0; j < result.length; j++) {
                    result[j] = maxX;
                }
            }
        }

        return result;
    }
}
