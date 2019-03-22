package paket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YT2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		try {
			String url="http://newtours.demoaut.com/";
			driver.get(url);
			WebElement register= driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
			register.click();
			Thread.sleep(2000);
			
			WebElement firstName= driver.findElement(By.xpath("//input[@name='firstName']"));
			firstName.click();
			firstName.sendKeys("Maja");
			Thread.sleep(2000);
			
			WebElement lastName= driver.findElement(By.xpath("//input[@name='lastName']"));
			lastName.click();
			lastName.sendKeys("Jankovic");
			Thread.sleep(2000);
			
			WebElement phone= driver.findElement(By.xpath("//input[@name='phone']"));
			phone.click();
			phone.sendKeys("14465454");
			Thread.sleep(2000);
			
			WebElement email= driver.findElement(By.xpath("//input[@id='userName']"));
			email.click();
			email.sendKeys("nesto@nesto");
			Thread.sleep(2000);
			
			WebElement adresa= driver.findElement(By.xpath("//input[@name='address1']"));
			adresa.click();
			adresa.sendKeys("laze k");
			Thread.sleep(2000);
			
			WebElement grad= driver.findElement(By.xpath("//input[@name='city']"));
			grad.click();
			grad.sendKeys("BG");
			Thread.sleep(2000);
			
			WebElement drzava= driver.findElement(By.xpath("//input[@name='state']"));
			drzava.click();
			drzava.sendKeys("srbija");
			Thread.sleep(2000);
			
			WebElement post= driver.findElement(By.xpath("//input[@name='postalCode']"));
			post.click();
			post.sendKeys("564");
			Thread.sleep(2000);
			
			Select state=new Select(driver.findElement(By.xpath("//select[@name='country']")));
			state.selectByVisibleText("UGANDA");
			Thread.sleep(2000);
			
			WebElement user= driver.findElement(By.xpath("//input[@id='email']"));
			user.click();
			user.sendKeys("MMM");
			Thread.sleep(2000);
			
			WebElement pass= driver.findElement(By.xpath("//input[@name='password']"));
			pass.click();
			pass.sendKeys("56465");
			Thread.sleep(2000);
			
			WebElement conpass= driver.findElement(By.xpath("//input[@name='confirmPassword']"));
			conpass.click();
			conpass.sendKeys("56465");
			Thread.sleep(2000);
			
			WebElement sub= driver.findElement(By.xpath("//input[@name='register']"));
			sub.click();
			Thread.sleep(2000);
			
		}
		catch(Exception ex) {
			
		}
		finally {
			driver.quit();
		}

	}

}
