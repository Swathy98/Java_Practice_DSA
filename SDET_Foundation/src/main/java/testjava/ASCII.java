package testjava;

public class ASCII {

	public static void main(String[] args) {
		
		for(int i=48;i<=57;i++) {
			System.out.print((char)i +"");
		
		}
		System.out.println(" ");
		for(int i=65;i<=90;i++) {
			System.out.print((char)i +"");
		}
		System.out.println(" ");
		
		for(int i=97;i<=122;i++) {
			System.out.print((char)i +"");
	}
		System.out.println(" ");
		
		 int i = 54; // ASCII value for '6'
	        char j = 0; // Start with j as character 0

	        System.out.println((char)(i - j));
	        
	        int a =65;
	        
	        System.out.println((char)(a + 32));
	        
	        int b =97;
	        
	        System.out.println((char)(b - 32));
	        
	        
}
}