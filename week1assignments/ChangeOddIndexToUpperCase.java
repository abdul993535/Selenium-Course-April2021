package week1assignments;

public class ChangeOddIndexToUpperCase {

	
	public static void main(String[] args) {
		String text="CHENNAI";
		String [] charArr= text.split("");
		String apnd=" ";
		for (int i = 0; i < charArr.length; i++) {
			if(i%2 ==1) {
			apnd=apnd+charArr[i].toLowerCase();
		}else
		{
			apnd=apnd+charArr[i].toUpperCase();
		}
		
		{
			System.out.println(apnd);
			
		}
		
		}
				
			}
		}