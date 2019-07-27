package locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\eclipse-workspace\\locater\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.snapdeal.com/login");
WebElement UserName=driver.findElement(By.id("UserName"));
UserName.sendKeys("nlakhmi9494@gmail.com");
WebElement checkUser=driver.findElement(By.id("checkUser"));
checkUser.click();
}
}
