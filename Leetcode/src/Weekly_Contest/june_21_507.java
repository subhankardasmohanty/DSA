package Weekly_Contest;

public class june_21_507 {

    //Q1
    public int maxDistance(String moves) {

        int x = 0;
        int y = 0;
        int z = 0;

        for(int i = 0; i < moves.length(); i++){
            char ch = moves.charAt(i);
            if(ch == 'U'){
                x++;
            }
            if(ch == 'D'){
                x--;
            }
            if(ch == 'L'){
                y--;
            }
            if(ch == 'R'){
                y++;
            }
            if(ch == '_'){
                z++;
            }
        }

        x=Math.abs(x);
        y=Math.abs(y);

        return x+y+z;
    }

    //Q2
    public int countValidSubarrays(int[] nums, int x) {

        int c = 0;

        for(int i = 0; i < nums.length; i++){

            long sum = 0;

            for(int j = i; j < nums.length; j++){

                sum += nums[j];

                long last = sum%10;

                long temp = sum;

                while(temp > 9){
                    temp /= 10;
                }

                long first = temp;

                if(first == x && last == x){
                    c++;
                }

            }
        }
        return c;
    }
}
