package testcases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.AddOneCategoryPage;
import utilities.BrowserFactory;

public class AddCategoryTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbleToGoToSite() throws InterruptedException {

		driver = BrowserFactory.runChrome();
		AddOneCategoryPage addCategory = PageFactory.initElements(driver, AddOneCategoryPage.class);

		Assert.assertTrue(addCategory.addingACategory());

		// driver.close();
	}

}
