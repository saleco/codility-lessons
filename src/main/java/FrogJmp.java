public class FrogJmp {
    //INPUTS
    //current position - X
    //destination position - Y
    //Jump Distance - D

    //OUTPUT
    //Min jumps to destination


    public static int minJumpsToDestination(int X, int Y, int D){
        int distance = Y - X;
        if(distance % D == 0) return distance / D;
        return distance/D + 1;
    }

    public static void minJumpsToDestinationWhenPositionIs10DestinationIs85AndJumpDistanceIs30(){
        int minJumps = minJumpsToDestination(10, 85, 30);
        System.out.println("minJumpsToDestinationWhenPositionIs10DestinationIs85AndJumpDistanceIs30: " + (minJumps == 3));
    }

    public static void minJumpsToDestinationWhenPositionIs80DestinationIs85AndJumpDistanceIs30(){
        int minJumps = minJumpsToDestination(80, 85, 30);
        System.out.println("minJumpsToDestinationWhenPositionIs80DestinationIs85AndJumpDistanceIs30: " + (minJumps == 1));
    }

    public static void main(String[] args) {
        minJumpsToDestinationWhenPositionIs10DestinationIs85AndJumpDistanceIs30();
        minJumpsToDestinationWhenPositionIs80DestinationIs85AndJumpDistanceIs30();

        int minJumps = minJumpsToDestination(3, 999111321, 7);

    }
}
