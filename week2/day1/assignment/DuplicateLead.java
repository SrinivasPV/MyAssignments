package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Srinivas");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pandi");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Srini");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("RND");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating leads assignment");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("srinivasvas.sv47@gmail.com");
		WebElement findElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(findElement);
		dd.selectByVisibleText("Alabama");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Srini");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();

	}

}
