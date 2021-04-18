package week1.day1;

public class FibanocciSeries {

	public static void main(String[] args) {
		int sum=0;
		int num1=0;
		int num2=1;
		int range=8;
		
				System.out.println(num1);
		System.out.println(num2);
		{
			for (int i=0;i<=8;i++)
			{
				sum=num1+num2;
				System.out.println(sum);
				num1=num2;
				num2=sum;
				
			}
	}

}
}

