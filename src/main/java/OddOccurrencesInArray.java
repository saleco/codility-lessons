import java.util.Arrays;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        unpairedOccurrence_whenArrayIsEmpty_ThenShouldReturnMinusOne();
        unpairedOccurrence_whenArrayHasOneItem_ThenShouldReturnZero();
        unpairedOccurrence_whenArrayIsUnpaired_ThenShouldReturn7AsUnpaired();
    }

    public static int unpairedOccurrence(int[] a){
        if(a.length == 0) return -1;
        if(a.length == 1) return a[0];
        Arrays.sort(a);
        int i;
        for (i = 0; i < a.length-1 && a[i] == a[i+1]; i+=2) {
        }
        return a[i];
    }

    public static void unpairedOccurrence_whenArrayIsEmpty_ThenShouldReturnMinusOne(){
        System.out.println("unpairedOccurrence_whenArrayIsEmpty_ThenShouldReturnMinusOne: " + (unpairedOccurrence(new int[]{}) ==  -1));
    }

    public static void unpairedOccurrence_whenArrayHasOneItem_ThenShouldReturnZero(){
        System.out.println("unpairedOccurrence_whenArrayHasOneItem_ThenShouldReturnZero: " + (unpairedOccurrence(new int[]{9}) ==  9));
    }

    public static void unpairedOccurrence_whenArrayIsUnpaired_ThenShouldReturn7AsUnpaired(){
        System.out.println("unpairedOccurrence_whenArrayIsUnpaired_ThenShouldReturn7AsUnpaired: " + (unpairedOccurrence(new int[]{9,3,9,3,9,7,9}) ==  7));
    }

}
