import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebLoginEclipseGitJenkins {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  //To get credentials during runtime
		
		WebDriver driver = new ChromeDriver();  //Driver initialization
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/Login.aspx");  //To navigate a web browser
		
		WebElement userName = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_username']"));
		String userNameValue = input.nextLine() ;
		userName.sendKeys(userNameValue);
		
		WebElement password = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']"));
		String passwordValue = input.nextLine();
		password.sendKeys(passwordValue);
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']"));
		loginButton.click();
}
}