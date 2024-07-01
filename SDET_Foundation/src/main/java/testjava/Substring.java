package testjava;

public class Substring {

	public static void main(String[] args) {
		String str= "tamilelavenil";
		
		//Using startIndex
		
		String substr=str.substring(1); //start from index 3
		System.out.println(substr);
		
		//using startIndex and endIndex
		
		String substr1=str.substring(3,5); //start from index 3 and ends at index 8
		System.out.println(substr1);
		
		//using length
		
		String substr3=str.substring(4,str.length()); //start from index 4 and goes till length of the string
		System.out.println(substr3);
		
		int substr4=str.lastIndexOf("l");
		System.out.println(substr4);
		
	
	}

}
