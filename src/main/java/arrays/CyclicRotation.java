package arrays;

public class CyclicRotation {

    public int[] arrayRotation(int[] a, int r){

        //creates the resut array with the same size of the original one
        int[] rotatedA = new int[a.length];


        for (int i = 0; i < a.length; i++) {
            //the rotated index it will be mod of index + number of rotations
            int rotatedIndex = (i+r) % a.length;

            //puts the current array item at the rotated index position
            rotatedA[rotatedIndex] = a[i];
        }

        return rotatedA;
    }

}
