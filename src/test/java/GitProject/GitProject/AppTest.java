package GitProject.GitProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AppTest 
{

    @Test
    public void launchbrowser()
    {
	   //webhook
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.out.println("launching chrome");
        //driver.get("https://www.google.co.in/");
	driver.get("https://www.orangehrm.com/");
        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        driver.quit();
    }
}
