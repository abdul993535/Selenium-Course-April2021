package week1.day1;

public class Calculator {
	public int Add(int num1,int num2) {
		int sum=num1+num2;
		return sum;
	}
	public double sub(double num1,double num2) {
		double result=num1-num2;
		return result;	
	}
	public double mult(double num1,double num2) {
		double result=num1*num2;
		return result;
	}
	public int div(int num1,int num2) {
		int result=num1/num2;
		return result;
	}
	
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		
		System.out.println(cal.Add(10, 20));
		System.out.println(cal.mult(20.5, 20.5));
		System.out.println(cal.sub(33.5,23.5));
		System.out.println(cal.div(300, 100));
		
	}
	
}
	