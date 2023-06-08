package com.patient;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Form extends Base_Class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	@Test(priority = 0)

	public void Login() throws InterruptedException {

		// Enter Username

		geturl("https://ehr1.vozo.xyz:444/");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		sendkeys(pom.getformbuild().getUsername(), "Admin3");

		// Enter Password
		sendkeys(pom.getformbuild().getPassword(), "Admin@123");

		// Click Signin Button '
		Clickonelement(pom.getformbuild().getSigninbtn());

		System.out.println("Login Successfully");

	}

	@Test(priority = 1)

	public void FormBuilder() throws InterruptedException {

		Thread.sleep(4000);

		Clickonelement(pom.getformbuild().getpatient());

		// select form

		Thread.sleep(4000);

		Clickonelement(pom.getformbuild().getformsel());

		// Additonal

		Clickonelement(pom.getformbuild().getseleadd());

		// add form

		Clickonelement(pom.getformbuild().getaddfo());

		// Drag

		Dragnddrop(pom.getformbuild().getheade(), pom.getformbuild().getheadedro());

		// Drag
		Thread.sleep(3000);
		Dragnddrop(pom.getformbuild().gettex(), pom.getformbuild().gettexdr());

		// Nam

		Clickonelement(pom.getformbuild().getedna());

		// cl

		ClearText(pom.getformbuild().getclna());

		// nan
		sendkeys(pom.getformbuild().getclna(), "Testing 123");

		// save

		Clickonelement(pom.getformbuild().getsana());

//		// Cli ed
//		// Thread.sleep(4000);
//		WebDriverWait forco = new WebDriverWait(driver, 10);
//		WebElement cop = forco.until(ExpectedConditions.elementToBeClickable(By.xpath(
//				"//div[@class='builder-components drag-container formio-builder-components']//i[@class='fa fa-copy']")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", cop);

		// Clickonelement(pom.getformbuild().getclcop());

		// Fil
		Clickonelement(pom.getformbuild().getfilcl());

		try {
			// Pas
			Thread.sleep(3000);
			Clickonelement(pom.getformbuild().getcopfo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Copy Form");
		}

		// Pas
		Thread.sleep(3000);
		Clickonelement(pom.getformbuild().getpasa());

		// Sav fo

		Thread.sleep(5000);
		Clickonelement(pom.getformbuild().getsavfo());

		// mark pres

		Thread.sleep(5000);
		Clickonelement(pom.getformbuild().getmakf());

		// mark pres

		Thread.sleep(5000);
		Clickonelement(pom.getformbuild().getselmar());

	}

	@Test(priority = 2)

	public void PatientEditForm() throws InterruptedException {

		Thread.sleep(4000);

		Clickonelement(pom.getformbuild().getpatient());

		// sel

		Thread.sleep(4000);

		Clickonelement(pom.getformbuild().getselpa());

		// sele app
		Thread.sleep(4000);

		Clickonelement(pom.getformbuild().getselap());

		// pas p

		// Thread.sleep(5000);

		// Cli ed
		Thread.sleep(4000);
		WebDriverWait forco = new WebDriverWait(driver, 10);
		WebElement cop = forco.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'Past Appointments')])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", cop);

		// Clickonelement(pom.getformbuild().getpasapp());

		// show ed

		Thread.sleep(5000);
		Clickonelement(pom.getformbuild().getshowe());

		// sel add

		Thread.sleep(5000);
		Clickonelement(pom.getformbuild().getcliadd());

		// sel te

		Thread.sleep(4000);
		WebDriverWait tes = new WebDriverWait(driver, 10);
		WebElement selte = tes
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'Testing 123')])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selte);

//		Thread.sleep(5000);
//		Clickonelement(pom.getformbuild().getseltes());

		// sel te

		Thread.sleep(5000);
		sendkeys(pom.getformbuild().getselno(), "Hello Patient");

//		// mar
//		Thread.sleep(3000);
//		Clickonelement(pom.getformbuild().getselno1());
//
//		// mar
//		
//		Thread.sleep(3000);
//		Clickonelement(pom.getformbuild().getselno2());

		Thread.sleep(3000);
		Clickonelement(pom.getformbuild().getbac());

		Thread.sleep(3000);
		Clickonelement(pom.getformbuild().getbac1());

		// select form

		Thread.sleep(4000);

		Clickonelement(pom.getformbuild().getformsel());

		// Additonal

		Clickonelement(pom.getformbuild().getseleadd());

		// Additonal
		Thread.sleep(4000);
		Clickonelement(pom.getformbuild().getselefo());

		// Additonal
//		Thread.sleep(4000);
//		Movetoele(pom.getformbuild().getelm());

		try {
			Thread.sleep(4000);
			WebDriverWait selca = new WebDriverWait(driver, 10);
			WebElement can = selca.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i)[26]")));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", can);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Presists Form");
		}

		// Additonal
//		Thread.sleep(4000);
//		Clickonelement(pom.getformbuild().getselcan());
	}

}
