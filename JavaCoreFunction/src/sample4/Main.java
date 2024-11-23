package sample4;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "Hello Java";
        String text2 = "Hello Python";

        BiFunction<String, String, String[]> commonWords = (str1, str2) -> {
            List<String> list1 = Arrays.asList(str1.split(" "));
            List<String> list2 = Arrays.asList(str2.split(" "));
            return list1.stream()
                        .filter(list2::contains)
                        .toArray(String[]::new);
        };

        String[] result = commonWords.apply(text1, text2);
        System.out.println("Сommon words: " + Arrays.toString(result)); 
	}

}
