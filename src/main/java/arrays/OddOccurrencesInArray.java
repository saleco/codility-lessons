package arrays;

import java.util.Arrays;

public class OddOccurrencesInArray {

    public int unpairedOccurrence(int[] a){

        //when there is only one element in array, the unpaired number is exactly this one
        if(a.length == 1) return a[0];

        //sorting the array, you will always have two numbers together except the unpaired one
        Arrays.sort(a);

        int i;
        //for condition compares current positions with the next one..
        // If it is not equals, here is the unpaired number
        //for jump from 2 to 2 since I test both indexes (i / i+1)
        for (i = 0; i < a.length-1 && a[i] == a[i+1]; i+=2) {
        }

        //unpaired number is the one who A[i] != A[i+1]
        return a[i];
    }


}
