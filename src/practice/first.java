package practice;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class AccountCreationTest {
	    @Test
	    public void testAccountCreation() {
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the registration page
	        driver.get("https://www.example.com/register");

	        // Locate and fill in registration fields
	        driver.findElement(By.id("firstName")).sendKeys("John");
	        // ... fill in other fields

	        // Submit the registration form
	        driver.findElement(By.id("registerButton")).click();

	        // Verify successful registration (e.g., check for a welcome message)
	        String welcomeText = driver.findElement(By.id("welcomeMessage")).getText();
	        Assert.assertEquals(welcomeText, "Welcome, John!");

	        // Close the browser
	        driver.quit();
	    }
	}