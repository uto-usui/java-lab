package prog02;

import java.util.ArrayList;
import java.util.List;

public class sample {
    public static void main(String[] args) {
        int N = 100000; // 出力する素数の個数
        List<Pair> primes = generatePrimes(N);
        System.out.println(N + "個の素数");
        System.out.println("n番目\t素数\t処理時間 (ms)");
        System.out.println("-------------------------------------");
        for (int i = 0; i < N; i++) {
            long prime = primes.get(i).prime;
            double cumulativeProcessingTime = primes.get(i).processingTime;
            System.out.printf("%d\t%d\t%.3fms%n", (i + 1), prime, cumulativeProcessingTime / 1000000.0);
        }
    }

    private static List<Pair> generatePrimes(int n) {
        List<Pair> primesWithTimes = new ArrayList<>();
        long num = 2;
        long totalProcessingTime = 0;

        while (primesWithTimes.size() < n) {
            long startTime = System.nanoTime();
            boolean isPrime = isPrime(num);
            totalProcessingTime += System.nanoTime() - startTime;

            if (isPrime) {
                primesWithTimes.add(new Pair(num, totalProcessingTime));
            }
            num++;
        }

        return primesWithTimes;
    }

    private static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class Pair {
    long prime;
    long processingTime;

    Pair(long prime, long processingTime) {
        this.prime = prime;
        this.processingTime = processingTime;
    }
}
