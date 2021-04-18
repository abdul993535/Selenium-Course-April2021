package week1assignments;

import java.util.Arrays;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count=0;
		char[]Array =str.toCharArray();
	//System.out.println(str.length());
	for (int i = 0; i < str.length(); i++) {
	    if (Array[i]=='n')
	        count++;
	    
		
	}
	{
		System.out.println("n is present"+count+"times");
	}
	}

}
