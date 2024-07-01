import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(opt);
		
		//window max
		driver.manage().window().maximize();
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//load URL
		//driver.get("https://www.amazon.in/events/greatsummersale?ref_=nav_cs_gb&discounts-widget=%2522%257B%255C%2522state%255C%2522%253A%257B%255C%2522refinementFilters%255C%2522%253A%257B%257D%257D%252C%255C%2522version%255C%2522%253A1%257D%2522&bubble-id=deals-collection-mob&promotionsSearchStartIndex=0&promotionsSearchLastSeenAsin=B0BZCKH59M");
		//driver.get("https://www.amazon.in/events/greatsummersale?ref_=nav_cs_gb&discounts-widget=%2522%257B%255C%2522state%255C%2522%253A%257B%255C%2522refinementFilters%255C%2522%253A%257B%257D%257D%252C%255C%2522version%255C%2522%253A1%257D%2522&bubble-id=deals-collection-mob&promotionsSearchStartIndex=0&promotionsSearchLastSeenAsin=B0BZCKH59M&deals-widget=%257B%2522version%2522%253A1%252C%2522viewIndex%2522%253A0%252C%2522presetId%2522%253A%2522deals-collection-mob%2522%252C%2522sorting%2522%253A%2522FEATURED%2522%257D");
		driver.get("https://www.amazon.in/events/greatsummersale?ref_=nav_cs_gb&discounts-widget=%2522%257B%255C%2522state%255C%2522%253A%257B%255C%2522refinementFilters%255C%2522%253A%257B%257D%257D%252C%255C%2522version%255C%2522%253A1%257D%2522&bubble-id=deals-collection-mob&promotionsSearchStartIndex=0&promotionsSearchLastSeenAsin=B0BZCKH59M");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Today's Deals']")).click();
		List<WebElement> linkElements = driver.findElements(By.xpath("//a/div/span//div/span"));
		List<Integer> comp = new ArrayList();
        // Loop through the links and print their href attribute
        for (WebElement linkElement : linkElements) {
            String href = linkElement.getText();
            String rep = href.replaceAll("[a-zA-Z%]","");
            if (href != null && !href.isEmpty()) {
            	System.out.println(href);
//            	int num = Integer.parseInt(href.substring(0, 2));
//            	comp.add(num);
            }
        }
       // System.out.println(comp);
	}

}
