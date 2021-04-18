package week1.day1;

public class HyundaiCar {
	public void getModelPrice(char model,String fuelType) {
		if(model=='a')
		{
			System.out.println("10000");
			System.out.println("fuel type");
		}else if (model=='b')
		{
			System.out.println("20000");
			System.out.println("fuel type");
		}else if (model=='c')
		{
			System.out.println("30000");
			System.out.println("fuel type");
		}
		else
		{
			System.out.println("not a correct model");
		}
	}

	public static void main(String[] args) {
		//class name object=new class name;
		HyundaiCar hc=new HyundaiCar();
		//object.method();
		hc.getModelPrice('a',"Petrol");
		
	}

	}
	
	
