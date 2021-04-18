package week1.day2;

public class FindDuplicateValue {

	public static void main(String[] args) {
		int []arr= {14,13,15,16,14,17,18,19};
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j])
				count=count+1;
				
			}
			if(count>0)
				System.out.println(arr[i]);
		}
		
	}
}
