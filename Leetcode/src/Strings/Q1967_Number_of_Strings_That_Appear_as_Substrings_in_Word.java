package Strings;

public class Q1967_Number_of_Strings_That_Appear_as_Substrings_in_Word {

    public int numOfStrings(String[] patterns, String word) {


        // Approach.1
//         int c = 0;
//
//         for (String str : patterns) {
//             if (word.contains(str)) {
//                 c++;
//             }
//         }
//
//         return c;

        //Approach.2

        int ans = 0;

        for (String str : patterns) {
            if (word.indexOf(str) != -1) {
                ans++;
            }
        }

        return ans;
    }
}
