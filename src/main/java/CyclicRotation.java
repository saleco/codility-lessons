import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        arrayRotation_WhenWrapAroundMoreThenOnce_ThenShouldRotate();
        arrayRotation_WhenWrapAroundMoreThenOnceWithNegative_ThenShouldRotate();
        arrayRotation_WhenWrapAroundMoreThenOnceWithNegative99Times_ThenShouldRotate();
    }

    public static int[] arrayRotation(int[] a, int r){
        int[] rotatedA = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int rotatedIndex = (i+r) % a.length;
            rotatedA[rotatedIndex] = a[i];
        }

        return rotatedA;
    }

    public static void arrayRotation_WhenWrapAroundMoreThenOnce_ThenShouldRotate(){
        int[]rotatedA = arrayRotation(new int [] {1, 2, 3, 4}, 5);
        System.out.println("arrayRotation_WhenWrapAroundMoreThenOnce_ThenShouldRotate: " + Arrays.toString(rotatedA) );
    }

    public static void arrayRotation_WhenWrapAroundMoreThenOnceWithNegative_ThenShouldRotate(){
        int[]rotatedA = arrayRotation(new int [] {-1, 2, -3, 4}, 10);
        System.out.println("arrayRotation_WhenWrapAroundMoreThenOnceWithNegative_ThenShouldRotate: " + Arrays.toString(rotatedA) );
    }

    public static void arrayRotation_WhenWrapAroundMoreThenOnceWithNegative99Times_ThenShouldRotate(){
        int[]rotatedA = arrayRotation(new int [] {-1, 2, -3, 4}, 99);
        System.out.println("arrayRotation_WhenWrapAroundMoreThenOnceWithNegative99Times_ThenShouldRotate: " + Arrays.toString(rotatedA) );
    }

}
