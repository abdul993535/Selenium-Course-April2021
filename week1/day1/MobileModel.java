package week1.day1;

public class MobileModel {
 int mobWeight=300;
 String mobModel="Samsung 0n 8";
 boolean fullCharge=true;
 double mobCost=40000;
 public void sendMsg() {
	System.out.println("Sending a message");
}
 public void makeCall() {
	System.out.println("Making a call");

}
 
 
	public static void main(String[] args) {
		MobileModel ldt=new MobileModel();//classname object=new class name
		ldt.makeCall();
		ldt.sendMsg();
		System.out.println(ldt.mobWeight);
		System.out.println(ldt.mobModel);
		System.out.println(ldt.fullCharge);
		System.out.println(ldt.mobCost);
		
		

	}

}
