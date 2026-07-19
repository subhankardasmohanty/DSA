package Strings;

public class Q3992_Rearrange_String_to_Avoid_Character_Pair {

    public String rearrangeString(String s, char x, char y) {
        StringBuilder yPart = new StringBuilder();
        StringBuilder mid = new StringBuilder();
        StringBuilder xPart = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == y) {
                yPart.append(ch);
            } else if (ch == x) {
                xPart.append(ch);
            } else {
                mid.append(ch);
            }
        }

        return yPart.append(mid).append(xPart).toString();
    }
}
