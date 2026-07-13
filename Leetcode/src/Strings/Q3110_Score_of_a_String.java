package Strings;

public class Q3110_Score_of_a_String {

    public int scoreOfString(String s) {

        int score = 0;

        for (int i = 1; i < s.length(); i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }

        return score;
    }
}
