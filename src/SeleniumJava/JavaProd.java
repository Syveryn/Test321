package SeleniumJava;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaProd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\JavaSelenium\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.youtube.com/");
	}
}
Heloooooooooooooooooooooooo world