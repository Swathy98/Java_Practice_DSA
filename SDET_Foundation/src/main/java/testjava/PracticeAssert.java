package testjava;
import org.junit.Assert;
import org.junit.Test;
public class PracticeAssert {
	@Test
	public void Test1() {
		Assert.assertEquals("madam", reverse("madam"));
	}
	@Test
	public void Test2(){
		Assert.assertEquals("limat", reverse("tamil"));
	}
	public String reverse(String inp){
		StringBuilder str = new StringBuilder();
	for(int i=inp.length()-1;i>=0;i--) {
		str.append(inp.charAt(i));
		
	}
	
	return str.toString(); //return string
}

}
