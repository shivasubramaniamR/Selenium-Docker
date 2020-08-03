package docker_basic;

import java.net.MalformedURLException;
import java.net.URL;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Chrome_docker {
	public String remote_url = "http://localhost:4444/wd/hub";
	public String url = "https://www.selenium.dev/";
	
	@Test
	public void test_chrome_docker() {
		System.out.println("Chrome Execution Started");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.CHROME);
		
		try {
			WebDriver driver  = new RemoteWebDriver(new URL(remote_url),cap);
			driver.get(url);
			System.out.println("WebPage Title is "+driver.getTitle());

			
			Thread.sleep(10000);
			driver.quit();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
