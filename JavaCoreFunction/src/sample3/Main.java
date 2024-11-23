package sample3;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Home work from YT - Java Core-Function!";
		Function<String, int[]> charCodes = str -> str.chars().toArray();
		Function<int[], Integer> sumOfCharCodes = codes -> {
			int sum = 0;
			for (int code : codes) {
				sum += code;
			}
			return sum;
		};
		Function<String, Integer> composedFunction = charCodes.andThen(sumOfCharCodes);

		System.out.println("Sum codes " + composedFunction.apply(text));
	}
}
