package testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class CreateLead extends MainClass {

	@Test(dataProvider = "senData")

	public void CreateL(String FirstName, String Lastname, String Company, String PhoneNumber) {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lastname);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Company);

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(PhoneNumber);
		driver.findElement(By.name("submitButton")).click();

	}

	@DataProvider

	public String[][] senData() throws IOException {

		return ReadExcel.readData("Book1.xlsx");

	}

}
