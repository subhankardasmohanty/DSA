package Strings;

public class Q3174_Clear_Digits {

    public String clearDigits(String s) {

        char[] stack = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {

                top--;
            }
            else {

                top++;
                stack[top] = ch;
            }
        }

        return new String(stack, 0, top + 1);

        // StringBuilder sb = new StringBuilder();

        // for (int i = 0; i < s.length(); i++) {

        //     char ch = s.charAt(i);

        //     if (Character.isDigit(ch)) {
        //         sb.deleteCharAt(sb.length() - 1);
        //     }
        //     else {
        //         sb.append(ch);
        //     }
        // }

        // return sb.toString();
    }
}
