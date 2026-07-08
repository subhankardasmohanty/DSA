package HashTable;

import java.util.*;
public class Q771_Jewels_and_Stones {

    public int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> set = new HashSet<>();

        for (char c : jewels.toCharArray()) {
            set.add(c);
        }

        int count = 0;

        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }

        return count;
    }
}
