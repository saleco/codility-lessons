import java.util.Arrays;

public class PermMissingElem {
    /*
        Inputs
        Array with N different integers
            Range: 1 ... (N+1)

        Output Missing element in array
     */

    public static int missingValue(int [] A){

        if(A.length == 0) return 1;
        if(A.length == 1) {
            if(A[0] == 1) return 2;
            return 1;
        }
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if(A[i] != i+1) return i+1;
        }
//         for (int i = 0; i < A.length-1; i++) {
//            if(A[i]+1 == A[i+1]) continue;
//            return A[i]+1;
//        }
        return A.length+1;
    }

    public static void missingValue_WhenArrayIsEmpty_ThenShouldReturnZero(){
        System.out.println("missingValue_WhenArrayIsEmpty_ThenShouldReturnZero: " + missingValue(new int[]{}));
    }

    public static void missingValue_WhenArrayIsNotEmpty_ThenShouldReturnMissingValue(){
        System.out.println("missingValue_WhenArrayIsEmpty_ThenShouldReturnZero: " + missingValue(new int[]{2, 3, 1, 5}));
    }

    public static void missingValue_WhenArrayIsNotEmpty_ThenShouldReturnMissingValue2(){
        System.out.println("missingValue_WhenArrayIsEmpty_ThenShouldReturnZero: " + missingValue(new int[]{2, 3, 1, 5, 4, 8, 6, 10, 9}));
    }
    public static void missingValue_WhenArrayIsNotEmpty_ThenShouldReturnMissingValue3(){
        System.out.println("missingValue_WhenArrayIsEmpty_ThenShouldReturnZero: " + missingValue(new int[]{1}));
    }

    public static void main(String[] args) {
        missingValue_WhenArrayIsEmpty_ThenShouldReturnZero();
        missingValue_WhenArrayIsNotEmpty_ThenShouldReturnMissingValue();
        missingValue_WhenArrayIsNotEmpty_ThenShouldReturnMissingValue2();
        missingValue_WhenArrayIsNotEmpty_ThenShouldReturnMissingValue3();
    }
}
