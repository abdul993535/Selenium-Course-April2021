package week1.day1;

public class FindArmstrongNumber {

	public static void main(String[] args) {
		int input=153;
		int orgNum=input;
		int sum=0;
		int rem;
		
		while(input>0)
		{
			rem=input%10;
			sum=sum+(rem*rem*rem);
			input=input/10;
			
		}
		if(orgNum==sum)
		{
			System.out.println("given number is an armstrong number");
			
		}else
		{
		System.out.println("given number is not an armstrong number");
		
		
		}
		}
}
		
			