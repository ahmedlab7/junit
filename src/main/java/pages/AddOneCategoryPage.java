package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddOneCategoryPage {

	WebDriver driver;

	public AddOneCategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "data")
	public WebElement AddCategoryNameText;
	@FindBy(how = How.XPATH, using = "//input[@value='Add']")
	WebElement AddCategoryButton;

	public Boolean addingACategory() throws InterruptedException {
		int x = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		Boolean y = false;
		int index = randomCategoryNumber();
		AddCategoryNameText.sendKeys("Category" + " " + index);
		AddCategoryButton.click();
		int m = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		if (m > x) {
			y = true;
		}

		return y;
	}

	private int randomCategoryNumber() {
		Random randomIndex = new Random();
		int index = randomIndex.nextInt(5);
		return index;
	}
}
