package Strings;

public class Q2124_Check_if_All_As_Appears_Before_All_Bs {

    public boolean checkString(String s) {

        // int a = 0;

        // for(int i = 0; i < s.length(); i++){

        //     if(s.charAt(i) == 'b'){
        //         a = 1;
        //     }

        //     if(s.charAt(i) == 'a' && a == 1){

        //         return false;
        //     }
        // }

        // return true;

        return !s.contains("ba");

    }
}
