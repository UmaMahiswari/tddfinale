package Runner;

import java.io.File;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Runner {
WebDriver driver;
@Test
public void test() 
{
	System.out.println(driver.getTitle());
	}
@BeforeTest
public void beforeTest()
{
	System.out.println("helllooo");
	System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
	//System.setProperty("webdriver.firefox.bin", pathBinary.getAbsolutePath());System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	driver=new ChromeDriver();
	//System.setProperty("webdriver.gecko.driver", "E:\\SHARED\\geckodriver\\geckodriver.exe");
	driver.get("http://13.251.143.66:8090/IPL-Fantasy-League/");

}
@AfterTest
public void afterTest(){
	System.out.println("Running1");
}
}
