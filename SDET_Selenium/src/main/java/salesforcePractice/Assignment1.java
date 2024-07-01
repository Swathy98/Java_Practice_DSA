package salesforcePractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://team.atlassian.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("tamilelavenilkannappan@gmail.com");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password")).sendKeys("Silla@3006");
		driver.findElement(By.id("login-submit")).click();
		
		WebElement element = driver.findElement(By.xpath("//div[text()='Jira Service Management']"));
		 JavascriptExecutor j = (JavascriptExecutor) driver;
	     j.executeScript("arguments[0].click();", element);
	     
	     driver.findElement(By.id("createGlobalItem")).click();
	    
	   driver.findElement(By.id("summary-field")).sendKeys("test");
	   driver.findElement(By.xpath("//div[@data-testid='issue-create.ui.modal.modal-wrapper.modal--footer']/button")).click();
	   
	   
	  driver.findElement(By.xpath("//div[@data-testid='global-pages.directories.projects-directory-v3.ui.page-layout.projects-list.container']/table//tbody/tr[2]/td//a/span[text()='silla']")).click();
	   
	  String testname= driver.findElement(By.xpath("//div[@data-testid='common.components.virtual-table.table.content.rows.common.cell-wrapper-rowSIL-1-reporter']/div//div/div")).getText();
	  
	  System.out.println(testname.equals("tamilelavenil"));
		/*
		 * driver.findElement(By.xpath(
		 * "//div[@data-testid='global-pages.directories.projects-directory-v3.ui.page-layout.projects-list.container']/table/tbody/tr[2]/td//a/span[text()='silla']"
		 * )).click();
		 * 
		 * 
		 * z
		 * String assignee= driver.findElement(By.xpath(
		 * "//div[@data-testid='common.components.virtual-table.table.content.rows.common.cell-wrapper-rowSIL-1-reporter']/div//div/div"
		 * )).getText();
		 * 
		 * System.out.println(assignee);
		 * 
		 * driver.quit();
		 * //div[@data-testid="servicedesk-queues-agent-view.layout.table.container"]//div[@role='presentation']/div[text()='tamilelavenil']
		 */
	   // 
	   
	 
	}

}
