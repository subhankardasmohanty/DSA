package SlidingWindow;

public class Q3090_maximum_length_substring_with_at_most_two_occurrences_of_each_character {

    public int maximumLengthSubstring(String s) {

        int[] freq = new int[26];

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'a';
            freq[index]++;

            // Window is invalid
            while (freq[index] > 2) {
                int leftIndex = s.charAt(left) - 'a';
                freq[leftIndex]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
