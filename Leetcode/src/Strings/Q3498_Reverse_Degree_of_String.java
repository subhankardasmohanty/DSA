package Strings;

public class Q3498_Reverse_Degree_of_String {

    public int reverseDegree(String s) {

        int ans = 0;

        for(int i = 0; i < s.length(); i++){

            ans += ('z' - s.charAt(i) + 1) * (i+1);
        }

        return ans;
    }
}
