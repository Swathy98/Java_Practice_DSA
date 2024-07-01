package interviewPractice;

public class Count {

	public static void main(String[] args) {
	String str="RING Central";
	int vcount = 0,ccount=0;
	str=str.toLowerCase();
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			
			vcount++;
		//System.out.println(vcount);	
		}
		
	else {
			if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
				ccount++;
			}
			//System.out.println(ccount);
		}
	}
System.out.println("the number of vowels is : " +vcount);
System.out.println("the number of consoants is : "+ccount);
	}

}
