package basicSelenium;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnBasicXpath {

	public static void main(String[] args) {
		
		//chrome options
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable notifications");
		
		ChromeDriver driver=new ChromeDriver(co);
		
		//window max
		
		driver.manage().window().maximize();
		
		//wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//load URL
		
		driver.get("https://ability-efficiency-82.my.salesforce.com/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("swathyseenu3001-klsw@force.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Swathy@3006");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("(//span[@class='appItemImage slds-p-top_xx-small']/img)[4])")).click();
		
		};

}
