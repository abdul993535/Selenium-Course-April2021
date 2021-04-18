package week1assignments;

import java.util.Arrays;

public class Anagram {


	public static void main(String[] args) {
		String str1 = "islam";
	    String str2 = "slami";
	    boolean isAnagram= false;
	    
	    //str1 = str1.toLowerCase();
	    //str2 = str2.toLowerCase();

	    // check if length is same
	    if(str1.length() == str2.length()) {

	      // convert strings to char array
	      char[] Array1 = str1.toCharArray();
	      char[] Array2 = str2.toCharArray();

	      // sort the char array
	      Arrays.sort(Array1);
	      Arrays.sort(Array2);

	      // if sorted char arrays are same
	      // then the string is anagram
	      boolean Anagram = Arrays.equals(Array1, Array2);

	      if(Anagram) {
	        System.out.println(str1 + " and " + str2 + " are anagram.");
	      }
	      else {
	        System.out.println(str1 + " and " + str2 + " are not anagram.");
	      }
	    }
	      
	      
	}
}


