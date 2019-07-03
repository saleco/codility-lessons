package timecomplexty;

public class FrogJmp {

    //INPUTS
    //  current position - X
    //  destination position - Y
    //  Jump Distance - D

    //OUTPUT
    //  Min jumps to destination


    public int minJumpsToDestination(int X, int Y, int D){
        int distance = Y - X;

        //if the distance is a exact division, simply returns distance / D
        if(distance % D == 0) return distance / D;

        //if it is not, just sum 1 to the result for one more jump
        return distance/D + 1;
    }

}
