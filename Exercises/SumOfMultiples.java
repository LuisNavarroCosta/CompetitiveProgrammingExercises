import java.util.stream.IntStream;

class SumOfMultiples {
	
	private int sum = 0;
	
    SumOfMultiples(int number, int[] set) {
    	sum = IntStream.range(1, number)
    			.filter(i -> isDivisible(i, set))
    			.sum();
    }

    private static Boolean isDivisible(int i, int[] set) {
		for(var x: set) {
			if( x != 0 && i % x == 0)
				return true;
		}
		return false;
	}

	int getSum() {
    	return sum;
    }
}