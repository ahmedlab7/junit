package testcases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.ToggleAllPage;
import utilities.BrowserFactory;

import org.junit.Assert;

public class ToggleAllTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbleToGoToSite() throws InterruptedException {

		driver = BrowserFactory.runChrome();	

		ToggleAllPage toggleAll = PageFactory.initElements(driver, ToggleAllPage.class);

		toggleAll.ToToggleAll();
		Boolean result = toggleAll.isToggleAllCheckBoxSelected();
		System.out.println("All select boxes are checked" + result); 

		if (!result) {
			toggleAll.ToToggleAll(); 
			Assert.assertTrue("Box selected", result);
		}

		Assert.assertTrue("All boxes are selected", toggleAll.checkAllBoxesIfSelected());
		WebElement checkbox = driver.findElement(By.name("allbox"));
		Assert.assertEquals(true, checkbox.isSelected());
		
		Thread.sleep(3000);

		driver.close();
	}
}
