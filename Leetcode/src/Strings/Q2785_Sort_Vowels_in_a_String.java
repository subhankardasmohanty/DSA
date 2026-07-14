package Strings;

// class Solution {
//     public String sortVowels(String s) {

//         List<Character> vowels = new ArrayList<>();

//         for (char c : s.toCharArray()) {
//             if (isVowel(c)) {
//                 vowels.add(c);
//             }
//         }

//         Collections.sort(vowels);

//         StringBuilder ans = new StringBuilder();
//         int idx = 0;

//         for (char c : s.toCharArray()) {
//             if (isVowel(c)) {
//                 ans.append(vowels.get(idx++));
//             } else {
//                 ans.append(c);
//             }
//         }

//         return ans.toString();
//     }

//     private boolean isVowel(char c) {
//         return c == 'a' || c == 'e' || c == 'i' ||
//                c == 'o' || c == 'u' ||
//                c == 'A' || c == 'E' || c == 'I' ||
//                c == 'O' || c == 'U';
//     }
// }

class Solution {

    public String sortVowels(String s) {

        String order = "AEIOUaeiou";
        int[] freq = new int[10];

        // Count frequencies of vowels
        for (char c : s.toCharArray()) {
            int idx = order.indexOf(c);
            if (idx != -1) {
                freq[idx]++;
            }
        }

        char[] ans = s.toCharArray();
        int ptr = 0;

        // Replace vowels with sorted vowels
        for (int i = 0; i < ans.length; i++) {
            if (order.indexOf(ans[i]) != -1) {
                while (freq[ptr] == 0) {
                    ptr++;
                }
                ans[i] = order.charAt(ptr);
                freq[ptr]--;
            }
        }

        return new String(ans);
    }
}