import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingClass {
	
	public static void main(String[] args) throws UnknownHostException {
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32_2\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//button[text()='Customer Login']")).click();
//		WebElement staticDrop = driver.findElement(By.id("userSelect"));
//		
//		Select dropdown = new Select(staticDrop);
//		dropdown.selectByIndex(1);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		
//		driver.close();
		MonitoringMail mail =  new MonitoringMail();
		System.out.println(	InetAddress.getLocalHost().getHostAddress());
		//192.168.43.47
	
	}

}
