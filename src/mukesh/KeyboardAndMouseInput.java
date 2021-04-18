package mukesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouseInput {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://formy-project.herokuapp.com/keypress";
        
        driver.get(baseUrl);
        
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Mukesh Dhisale");
        
        WebElement button =driver.findElement(By.id("button"));
        button.click();
        
        if (button.isDisplayed() && name.isDisplayed()){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        Thread.sleep(1000);
        driver.quit();
	}

}
