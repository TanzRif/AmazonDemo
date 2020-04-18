package hekmot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_amazon {

	

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='nav-line-2'][contains(text(),'Account & Lists')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("[][][[][]");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();

		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("[][][]");

		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Thread.sleep(2000);

		System.out.println("current url:" + driver.getCurrentUrl());

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Umbrella");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();

		Thread.sleep(2000);

		String Result = driver.findElement(By.xpath("//span[contains(text(),'1-48 of over 70,000 results for')]"))
				.getText();
		System.out.println("search result: " + Result);
		driver.findElement(By.xpath(
				"//div[3]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//span[1]//a[1]//div[1]//img[1]"))
				.click();

		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
		Thread.sleep(3000);

		driver.findElement(By.name("submit.delete.C0dfebaac-7ef8-4959-a51b-aef6657cb63c")).click();

		Thread.sleep(3000);
		System.out.println("last page url: " + driver.getCurrentUrl());
		Thread.sleep(3000);
		// String DeleteText = driver
		// .findElement(By.xpath("//p[contains(text(),'The item you were trying to
		// update has been remove')]"))
		// .getText();
		// System.out.println("last page text: " + DeleteText);
		// driver.close();

	}

}
