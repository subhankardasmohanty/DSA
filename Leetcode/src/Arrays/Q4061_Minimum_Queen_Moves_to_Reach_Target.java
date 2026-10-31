package Arrays;

public class Q4061_Minimum_Queen_Moves_to_Reach_Target {

    public int minQueenMoves(int[] source, int[] target) {

        int a1 = source[0];
        int a2 = source[1];

        int b1 = target[0];
        int b2 = target[1];

        if(a1 == b1 && a2 ==  b2){
            return 0;
        }

        if(a1 == b1 || a2 == b2 || Math.abs(a1 - b1) == Math.abs(a2 - b2)){

            return 1;
        }

        return 2;
    }
}
