public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);

        boolean[] isPrime = new boolean[N + 1];

        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        int p = 2;
        while (p * p <= N) {
            if (isPrime[p]) {
                int k = p * p;
                while (k <= N) {
                    isPrime[k] = false;
                    k += p;
                }
            }
            p++;
        }

        int count = 0;
        System.out.println("Prime numbers up to " + N + ":");
        int i = 2;
        while (i <= N) {
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
            i++;
        }
        int percent = count * 100 / N;
        System.out.println("There are " + count + " primes between 2 and "
                           + N + ". (" + percent + "% are primes)");

    }
}