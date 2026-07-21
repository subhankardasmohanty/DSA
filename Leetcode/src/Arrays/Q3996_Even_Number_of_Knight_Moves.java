package Arrays;

public class Q3996_Even_Number_of_Knight_Moves {

    public boolean isEvenKnightMove(int[] start, int[] target) {
        return ((start[0] + start[1]) % 2) == ((target[0] + target[1]) % 2);
    }
}
