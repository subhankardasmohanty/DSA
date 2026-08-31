package ProblemSet;

public class Q996A_Hit_the_Lottery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int[] denominations = {100, 20, 10, 5, 1};

        int count = 0;

        for (int d : denominations) {
            count += n / d;
            n %= d;
        }

        System.out.println(count);

        sc.close();
    }
}
