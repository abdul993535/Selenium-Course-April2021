package week1.day1;

public class LearnDatatypes {

	//data type variable name=value;
	byte numWheels=4;
	
	long phoneNum=8767565754L;
	
	float fuelCapacityInLitres=34.5F;
	char type='P';
	double carPrice=800000.25;
	
	
	
	
	public static void main(String[] args) {
		//class name object name=new class name
		 LearnDatatypes ldt=new LearnDatatypes();
		 
		 System.out.println(ldt.fuelCapacityInLitres);
		 System.out.println(ldt.phoneNum);
		 System.out.println(ldt.type);
		 System.out.println(ldt.carPrice);
		 
	}

}
