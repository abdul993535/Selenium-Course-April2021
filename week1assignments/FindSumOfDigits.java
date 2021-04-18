package week1assignments;

public class FindSumOfDigits {
	public static void main(String[] args) {
		int input=123;
		//int finalSum=input;
		int sum=0;
		while(input!=0)
		{
			
			sum=sum+input%10;
			input=input/10;
			
			
}
		
		
			System.out.println(sum);
		
	}
}
