import java.util.stream.IntStream;

public class PrimeCalculator {

    public int nth(int nth) {
        return IntStream.iterate(2, i -> i + 1)
                .boxed()
                .filter(this::isPrime)
                .skip(nth - 1)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    private boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(number)).allMatch(i -> number % i != 0);
    }

}
