package SeleniumPackages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SetupAssignment1 {
	
	WebDriver driver;
	String url = "https://www.google.com";
	
    @Test
    public void setUp() throws Exception{
        
    	    System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	    driver = new ChromeDriver();
    		driver.get(url);
    		driver.manage().window().maximize();
    		Thread.sleep(5000);
  
    		driver.close();
    	}
    
	
	
	
	

}
