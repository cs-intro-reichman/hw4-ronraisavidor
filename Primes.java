public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int times = Integer.parseInt(args[0]);
        primeDetails(primes(times));
    }

    public static void arrPrinter(boolean[]arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static boolean[] primes(int n) {
        boolean[] arr = new boolean[n];
        for (int i=2; i < n; i++) {
            arr[i] = true;
        }

        int p = 2;
        while (p * p <= n) {
            if (arr[p]) {
                for (int i=p*p; i < n; i+=p) {
                    arr[i] = false;
                }
            }
            p++;
        }
        return arr;
    }

    public static void primeDetails(boolean[]arr) {
        int countPrimes = 0;
        for (int i=2; i<arr.length; i++) {
            if (arr[i] == true) {
                System.out.println(i);
                countPrimes++;
            }
        }
        double sum = ((double)countPrimes / arr.length) * 100;
        System.out.printf("There are %d primes between 2 and %d (%.0f%% are primes) %n",countPrimes, arr.length, sum);
    }
}