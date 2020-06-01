package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	
	public RediffLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By userName =By.xpath("//*[@id='login1']");
	By password =By.xpath("//*[@id='password']");
	By submit = By.xpath("//*[@type='submit']");
	By Home = By.linkText("rediff.com");
	
	public WebElement username() {
		return driver.findElement(userName);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement submit() {
		return driver.findElement(submit);
	}
	
	public WebElement home() {
		return driver.findElement(Home);
	}
	
	//New code added by second person
	public WebElement home1() {
		return driver.findElement(Home);
	}
}
