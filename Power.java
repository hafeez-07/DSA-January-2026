public class Power {

    public static double myPow(double x, int n) {
        long power = n;   // critical fix

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double ans = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= x;
            }
            x *= x;
            power >>= 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        double x = 2;
        int n = -2;
        System.out.println(myPow(x, n)); // 1.0
    }
}
