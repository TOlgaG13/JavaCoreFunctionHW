package sample2;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String text="Home work from YT - Java Core!";
   Function<String, Integer> counts = str -> {
       int count = 0;
       String vow = "aeiouAEIOU";
       for (char ch : str.toCharArray()) {
           if (Character.isLetter(ch) && !vow.contains(String.valueOf(ch))) {
               count++;
           }
       }
       return count;
   };
   System.out.println("Number of consonants:" + + counts.apply(text));
	}

}
