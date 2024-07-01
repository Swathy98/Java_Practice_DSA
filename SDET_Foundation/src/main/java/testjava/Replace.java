package testjava;

import java.util.Arrays;

public class Replace {

	public static void main(String[] args) {
		
		String str= "Swathy$%^&Tamil21255666";
		
		//Replacing Characters 
		
		String replace=str.replace('a', 't'); // replacing old char with new char
	    System.out.println(replace);
	    
	    // Replacing Substrings
	    
	    String replace1=str.replace("tamil","lakshmi"); 
	    System.out.println(replace1);

	    //replace All
	    
	    String replace2=str.replaceAll("a", "b");
	    System.out.println(replace2);
	    
	    String replace3=str.replaceAll("[aeiou]", "*");
	    System.out.println(replace3);
	    
	    String replace4=str.replaceAll("[A-Z]","@");
	    System.out.println(replace4);
	    
	    String replace5=str.replaceAll("[a-z]","@");
	    System.out.println(replace5);
	    
	    String replace6=str.replaceAll("[0-9]","@");
	    System.out.println(replace6);
	    
	    String replace7=str.replaceAll("[^a-zA-Z0-9]","@");
	    System.out.println(replace7);
	    
	    // replace all non alpha, non numeric, non special char
	    
	    //equals , equalsignorecase, contains, uppercase , lowercase methods
	    
		// Trim

		String str1 = "                 swathylakshmi  ";
		String trim = str1.trim();
		System.out.println(trim); // last and first space got trimmed

	    		//split
		
		String str2="swathylakshmi";
		String[] split=str2.split("l"); //l will not get printed from l it will get split
		System.out.println( Arrays.toString(split));
		
		//null value split
		
		String str3="swathylakshmi";
		String[] split1=str3.split("");
		System.out.println( Arrays.toString(split1));
		
		String str4="Venil is a bad boy";
		String[] split2=str4.split(" ");
		System.out.println( Arrays.toString(split2));
		
	}

}
