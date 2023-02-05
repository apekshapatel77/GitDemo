package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base 
{
	public WebDriver driver;
	
 
public WebDriver initializeDriver() throws IOException
 {
	 Properties prop = new Properties();
	
	 FileInputStream fis = new FileInputStream("C:\\Users\\Apeksha\\eclipse-workspace\\Mavenjava\\src\\main\\java\\Mavenjava\\data.properties");
	
	 prop.load(fis);
	 String browsername = prop.getProperty("browser");
	 
	 if (browsername.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Apeksha\\eclipse-workspace\\MyProject\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
	 }
	 
	 else if (browsername.equals("chrome"))
	 {
		 driver =new FirefoxDriver();
	 }
	 
	 else if (browsername.equals("chrome")) 
	 {
		 //
	 }
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 return driver;
	 
	 
 }
 
}
