package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class signupTest {
	WebDriver bo;
	String bpath="https://www.facebook.com/";
  
	
	@Test
  public void TC_signup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA3\\Desktop\\prathamesh\\chromedriver.exe");
		 bo=new ChromeDriver();
		 bo.get(bpath);
		 bo.manage().window().maximize();
		 bo.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 bo.findElement(By.xpath("//input[@id='email']")).sendKeys("prathamesh");
		 Thread.sleep(2000);
		 
		 bo.findElement(By.xpath("//input[@id='pass']")).sendKeys("7875315045");
		 Thread.sleep(2000);
		 
		// bo.findElement(By.xpath("//input[@id='u_0_2']")).click();
		 Thread.sleep(2000);
		 
		 bo.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("prathamesh");
		 Thread.sleep(2000);
		 
		 bo.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("dhondge");
		 Thread.sleep(2000);
		 
		 bo.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("prathameshdhondge97@gmail.com");
		 Thread.sleep(2000);
		 
		 bo.findElement(By.xpath("//input[@id='u_0_u']")).sendKeys("prathameshdhondge97@gmail.com");
		 Thread.sleep(2000);
		 
		 bo.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("123456789");
		 Thread.sleep(2000);
		 
		 Select date=new Select(bo.findElement(By.xpath("//select[@id='day']")));
		 date.selectByIndex(20);
		 Thread.sleep(2000);
		 
		 Select month=new Select(bo.findElement(By.xpath("//select[@id='month']")));
		 month.selectByValue("2");
		 Thread.sleep(2000);
		 
		 Select year=new Select(bo.findElement(By.xpath("//select[@id='year']")));
		 year.selectByValue("1997");
		 Thread.sleep(2000);
		 
		bo.findElement(By.xpath("//input[@id='u_0_a']")).click();
		
		 //bo.findElement(By.xpath("//button[@id='u_0_13']")).click();
  }
}
