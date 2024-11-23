package sample1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>(List.of(10, 13, 16, 17, 22, 3));
		Predicate<Integer> pr = n -> {
			if (n <= 1)
				return false;
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					return false;
			}
			return true;
		};
		Function<Integer[], Integer> countPrimes = arr -> {
			int count = 0;
			for (int num : arr) {
				if (pr.test(num)) {
					count++;
				}
			}
			return count;
		};
		Integer[] numbersArray = numbers.toArray(new Integer[0]);
		System.out.println("Sum of primes: " + countPrimes.apply(numbersArray));
	}

}
