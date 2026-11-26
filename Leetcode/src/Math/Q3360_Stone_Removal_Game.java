package Math;

public class Q3360_Stone_Removal_Game {

    public boolean canAliceWin(int n) {

        int stones = 10;
        int turns = 0;

        while (n >= stones) {

            n -= stones;
            stones--;
            turns++;
        }

        return turns % 2 == 1;
    }
}
