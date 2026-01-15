
public class CountPrimes {

    public static int countPrime(int n) {
        if (n <= 2) {
            return 0;
        }
        int count = 0;
        boolean[] isPrime = new boolean[n];

        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 499979;
        int result = countPrime(n);
        System.out.println(result);
    }
}
