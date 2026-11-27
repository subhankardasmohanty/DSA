package Strings;

public class Q2678_Number_of_Senior_Citizens {

    public int countSeniors(String[] details) {

        int count = 0;

        for(int i = 0; i < details.length; i++) {

            int age = (details[i].charAt(11) - '0') * 10
                    + (details[i].charAt(12) - '0');

            if(age > 60) {
                count++;
            }
        }

        return count;
    }
}
