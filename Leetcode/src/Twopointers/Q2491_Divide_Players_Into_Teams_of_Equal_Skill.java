package Twopointers;

import java.util.*;

public class Q2491_Divide_Players_Into_Teams_of_Equal_Skill {

    public long dividePlayers(int[] skill) {

        Arrays.sort(skill);

        int a = 0;
        int b = skill.length - 1;
        int temp = skill[a] + skill[b];
        long sum = 0;

        while(a < b){

            if(skill[a] + skill[b] != temp){
                return -1;
            }
            else{

                sum += (long) skill[a] * skill[b];
            }

            a++;
            b--;

        }

        return sum;
    }
}
