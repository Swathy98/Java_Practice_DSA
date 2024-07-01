package testjava;

public class Converstions {

	public static void main(String[] args) {
		
		String str="Automation Testing";
		
		//Convert String to characterArray
		
		char[] chararr=str.toCharArray();
		System.out.println(chararr);
		
		//String toUppercase or toLowercase
		
		str=str.toLowerCase();
		System.out.println(str);
		str=str.toUpperCase();
		System.out.println(str);
	
		//Convert String to Integer or Int
		
		String inp1="1234";
		int inp=Integer.parseInt(inp1);
		
		System.out.println(inp);
		
		//adding 10 to the integer
		
		int sum;
		sum=inp+10;
		System.out.println(sum);
		
		// Convert String to char
		String a="s";
		char firstChar=a.charAt(0);
		System.out.println(firstChar);
		
		// to convert char to Character
		Character b = (char)firstChar;
		System.out.println(b);
		
		// convert Int to String
		int num=1234;
		String s1=String.valueOf(num);
		System.out.println(s1);
		
		// Convert Int to char
		
		int num1=65;
		char char2=(char)num1;
		System.out.println(char2);
		
		//Convert Int to Integer
		
		int num3=98;
		Integer i=Integer.valueOf(num3);
		System.out.println(i);
		
		//Convert Character to char
		
		Character ch='a';
		char chararr2=ch.charValue();
		System.out.println(chararr2);
	
		
		}
	

	}


