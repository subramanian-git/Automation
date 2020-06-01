package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffHomePagePF;
import objectRepository.RediffLoginPage;


public class Loginapplication {

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "G:\\Automation\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.username().sendKeys("admin");
		rd.password().sendKeys("admin");
		rd.submit().click();
		rd.home().click();
		RediffHomePagePF rh = new RediffHomePagePF(driver);
		rh.searchBox().sendKeys("rediff");
		rh.searchButton().click();
	}
}
