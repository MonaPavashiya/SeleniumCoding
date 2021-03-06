package keyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("https://www.amazon.ca/");

	    Actions at = new Actions(driver);
	
	    at.sendKeys(Keys.PAGE_DOWN).build().perform();
		WebElement l = driver.findElement(By.xpath("//span[text()='Extra savings with coupons']"));
		String strn = l.getText();
		System.out.println("Text obtained by scrolling down is :" + strn);

		Thread.sleep(3000);
		
		at.sendKeys(Keys.PAGE_UP).build().perform();
		WebElement m = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		String s = m.getText();
		System.out.println("Text obtained by scrolling up is :" + s);

	}

}
