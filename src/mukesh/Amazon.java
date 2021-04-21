package mukesh;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        String baseUrl = "https://www.amazon.in/";
        
       // String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
       //String actualTitle = "";
        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);
       
        // get the actual value of the title
        //actualTitle = driver.getTitle();
        Thread.sleep(1000);
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
        */
                 //1.  click on sign in button
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        Thread.sleep(1000);
        //2.Enter the username and click on continue
        driver.findElement(By.name("email")).sendKeys(" "); 	--enter username     
        driver.findElement(By.id("continue")).click();
        
      //  String errormsg = driver.findElement(By.className("a-list-item")).getText();
        
       /* if (errormsg.contentEquals("We cannot find an account with that mobile number")){
            System.out.println("Test Passed with incorrect details!");
        } else {
             System.out.println("Test Failed");*/    
       //3.enter passwrd and continue
        driver.findElement(By.name("password")).sendKeys(" ");  --enter password
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(1000);
//        //4.negative scenerio
//        String msg = driver.findElement(By.className("a-list-item")).getText();
//        
//        if (msg.contentEquals("Your password is incorrect")){
//            System.out.println("Test Passed with incorrect details!");
//        } else {
//             System.out.println("Test Failed");
//        }
        
     String message = driver.findElement(By.id("nav-logo-sprites")).getText(); 
        String pageTitle=driver.getTitle();
        System.out.println("PAGE TITLE: " +pageTitle);
        
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11");
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        String searchmsg = driver.findElement(By.xpath("/html/head/title")).getText(); 
        String pageTitlesearchmsg=driver.getTitle();
        System.out.println("PAGE TITLE: " +pageTitlesearchmsg);
      
        driver.findElement(By.className("a-size-medium a-color-base a-text-normal")).click();
      /*  String prodmsg = driver.findElement(By.xpath("/html/head/title")).getText(); 
        String pageTitleprodmsg=driver.getTitle();
        System.out.println("PAGE TITLE: " +pageTitleprodmsg);
        driver.close();*/

	}}

