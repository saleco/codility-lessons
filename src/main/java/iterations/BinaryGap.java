package iterations;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {


    public int binaryGapMaxSize(Integer n) {
        if(n <= 0) return 0;

        String binaryNumber = Integer.toBinaryString(n);
        List<Integer> oneIndexes = new ArrayList<>();
        int longestBinaryGap = 0;

        for(int i=0; i < binaryNumber.length(); i++){
            if(binaryNumber.charAt(i) == '0') continue;
            oneIndexes.add(i);
        }

        //for condition with size - 1 since I'm checking current position with the next one (Avoid index out of bounds)
        for(int i=0; i<oneIndexes.size()- 1; i++){
            //minus one to cover when you have two or more ones consecutively
            int indicesDiff = oneIndexes.get(i+1) - oneIndexes.get(i) -1;
            longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
        }

        return longestBinaryGap;
    }

}
