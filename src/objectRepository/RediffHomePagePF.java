package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePagePF {
	
	//This page has been migrated to page factory 
	
//	WebDriver driver;
	
	public RediffHomePagePF(WebDriver driver) {
//		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	By searchBox = By.xpath("//*[@id='srchword']");
//	By searchButton = By.xpath("//*[@class='srch_outer']/following-sibling::*[@type='submit']");
	
	@FindBy(xpath="//*[@id='srchword']")
	WebElement searchBox;
	
	@FindBy(xpath = "//*[@class='srch_outer']/following-sibling::*[@type='submit']")
	WebElement searchButton;
	
	public WebElement searchBox() {
//		return driver.findElement(searchBox);   //This line is done by @FindBy annotation so we just have to return it
		return searchBox;
	}
	
	public WebElement searchButton() {
//		return driver.findElement(searchButton);
		return searchButton;
	}
	
	//New code added by second person 
	public WebElement searchButton1() {
//		return driver.findElement(searchButton);
		return searchButton;
	}

}
