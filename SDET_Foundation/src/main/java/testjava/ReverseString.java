package testjava;

public class ReverseString {

	public String reverse(String inp){
			StringBuilder str = new StringBuilder();
		for(int i=inp.length()-1;i>=0;i--) {
			str.append(inp.charAt(i));
			
		}
		
		return str.toString(); //return string
	}
	public void printReverse(String inp){
		StringBuilder str = new StringBuilder();
	for(int i=inp.length()-1;i>=0;i--) {
		str.append(inp.charAt(i));
		
	}
	
	System.out.println(str);
}
	public static void main(String args[]) {
		
		ReverseString rs=new ReverseString(); //creating object
		String getString = rs.reverse("swathy");
		System.out.println(getString);
		//rs.reverse("swathy");
		rs.printReverse("lakshmi");
		
		
	}
	
}


