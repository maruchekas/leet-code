public class Solution1688 {

    public static void main(String[] args) {
        System.out.println(numberOfMatches(10));
    }

    private static int numberOfMatches(int n) {
        if (n == 1)
            return 0;

        int count;
        int games = 0;

        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
                count = n;
            } else {
                n = n / 2 + 1;
                count = n - 1;
            }
            games+=count;
        }

        return games;
    }
}
