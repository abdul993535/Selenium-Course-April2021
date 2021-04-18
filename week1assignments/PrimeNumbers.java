package week1assignments;

public class PrimeNumbers {

	public static void main(String[] args) {

		int num=10;
		boolean flag=false;
		int i=0;
		for ( i = 2; i <=num/2; i++) {
			if(num %i ==0)
				flag=true;
			    break;
			
			
		}
		
		
		
				
	
	if(!flag)
	{
		System.out.println("number is prime");
	}
	else
	{
		System.out.println("number is not prime");
	}

	}
}

