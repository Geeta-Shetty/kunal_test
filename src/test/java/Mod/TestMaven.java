package Mod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
 
public class TestMaven {
 
	AndroidDriver driver;
	@BeforeTest
	public void browserTest() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_6_API_23");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
 
	@Test
	public void testFaceBook()
	{
		driver.get("https://www.facebook.com/");
		String str = driver.getTitle();
		System.out.println(str);
		
		driver.findElement(By.id("m_login_email")).sendKeys("omm.jjklklkll@gmail.com");
	}
}