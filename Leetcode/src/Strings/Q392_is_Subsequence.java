package Strings;

public class Q392_is_Subsequence {

    int i = 0;

    public boolean isSubsequence(String s, String t) {

        int a = 0;

        while(a < s.length()){
            if(ispresent(t, s.charAt(a))){
                a++;
            }
            else{
                return false;
            }
        }

        return true;

        // 2nd approach two pointer

        // int a = 0;
        // int b = 0;

        // while(a < s.length() && b < t.length()){

        //     if(s.charAt(a) == t.charAt(b)){
        //         a++;
        //     }
        //     b++;
        // }

        // return a == s.length();

    }

    public boolean ispresent(String str, char ch){

        while(i < str.length()){
            if(str.charAt(i) == ch){
                i++;
                return true;
            }
            i++;
        }
        return false;
    }
}
