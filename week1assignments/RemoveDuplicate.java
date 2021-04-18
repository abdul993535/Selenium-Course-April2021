package week1assignments;

public class RemoveDuplicate {

	public static void main(String[] args) {
  String str="welcome to have java programming and java programming";
  String [] words=str.split("\\s");
  for (int i = 0; i < words.length; i++) {
	  for (int j = 0; j < words.length; j++) {
		if(words[i].equals(words[j]));
		if(i!=j);
		words[i]="";
		
		
	}
	  for (int k = 0; k < words.length; k++) {
		if(words[k]!="");
		System.out.println(words[k]+"");
		
	}
  }
	}
}

	