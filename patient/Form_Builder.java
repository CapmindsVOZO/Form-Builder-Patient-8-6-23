package com.patient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Form_Builder  {
	
	public WebDriver driver;

	public Form_Builder(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	////////// Insurance claim //////////////////

	@FindBy(id = "normal_login_username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(id = "normal_login_password")

	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//button[@type='submit']")

	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}
	
	@FindBy(xpath = "(//a[@id='pt_nav-lnk_mnu'])[1]")

	private WebElement patient;

	public WebElement getpatient() {
		return patient;
	}
	
	@FindBy(xpath = "(//a[normalize-space()='Form Builder'])[1]")

	private WebElement formsel;

	public WebElement getformsel() {
		return formsel;
	}
	
	@FindBy(xpath = "(//div[@id='first_tab_radio_btn_2'])[1]")

	private WebElement seleadd;

	public WebElement getseleadd() {
		return seleadd;
	}
	
	@FindBy(xpath = "(//li[contains(text(),'Testing 123')])[1]")

	private WebElement selefo;

	public WebElement getselefo() {
		return selefo;
	}
	
	@FindBy(xpath = "(//i)[26]")

	private WebElement elm;

	public WebElement getelm() {
		return elm;
	}
	
	@FindBy(css =   "div.App div.app-body div.right-block.m-l-250 div.appt-block-main-bill_form div.sc-hQXzsD.eJZYXZ.App.container-fluid:nth-child(3) div.sc-yTtWT.hrHlwj div.sc-hQXzsD.eJZYXZ div.formio.builder.row.formbuilder div.col-xs-8.col-sm-9.col-md-10.formarea.builder-paste-mode div.formio-component.formio-component-label-hidden div.formio-form div.builder-components.drag-container.formio-builder-form div.builder-component:nth-child(1) div.table-responsive.formio-component.formio-component-table.formio-component-table.main_column_vozo.comp_table.no-top-border-table table.table td.cell-align-left:nth-child(2) div.builder-components.drag-container.formio-builder-components div.builder-component div.component-btn-group div.btn.btn-xxs.btn-danger.component-settings-button.component-settings-button-remove:nth-child(1) > i.fa.fa-remove")

	private WebElement selcan;

	public WebElement getselcan() {
		return selcan;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Add New Form'])[1]")

	private WebElement addfo;

	public WebElement getaddfo() {
		return addfo;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Header'])[1]")

	private WebElement heade;

	public WebElement getheade() {
		return heade;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Textarea'])[1]")

	private WebElement tex;

	public WebElement gettex() {
		return tex;
	}
	
	@FindBy(xpath = "(//div[@role='alert'][normalize-space()='Drag and Drop a form component'])[1]")

	private WebElement texdr;

	public WebElement gettexdr() {
		return texdr;
	}
	
	@FindBy(xpath = "(//div[@role='alert'][normalize-space()='Drag and Drop a form component'])[1]")

	private WebElement headedro;

	public WebElement getheadedro() {
		return headedro;
	}
	
	@FindBy(xpath = "(//*[name()='svg'][@class='sc-gSpBRe knlrLm'])[1]")

	private WebElement edna;

	public WebElement getedna() {
		return edna;
	}
	
	@FindBy(xpath = "(//input[@value='New Clinical Form'])[1]")

	private WebElement clna;

	public WebElement getclna() {
		return clna;
	}
	
	@FindBy(xpath = "(//button[@class='sc-cNQtGM dQgodi'])[1]")

	private WebElement sana;

	public WebElement getsana() {
		return sana;
	}
	
	@FindBy(xpath = "(//i[@class='fa fa-copy'])[2]")

	private WebElement clcop;

	public WebElement getclcop() {
		return clcop;
	}
	
	@FindBy(xpath = "(//div[@id='second_tab_radio_btn_1'])[2]")

	private WebElement filcl;

	public WebElement getfilcl() {
		return filcl;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Paste All'])[1]")

	private WebElement pasa;

	public WebElement getpasa() {
		return pasa;
	}
	
	@FindBy(xpath = "(//button[contains(text(),'Save')])[3]")

	private WebElement savfo;

	public WebElement getsavfo() {
		return savfo;
	}
	
	
	@FindBy(xpath = "(//button[normalize-space()='Copy all Fields'])[1]")

	private WebElement copfo;

	public WebElement getcopfo() {
		return copfo;
	}
	
	@FindBy(xpath = "(//div[@class='sc-lGdcD cjEVfW'])[1]")

	private WebElement makf;

	public WebElement getmakf() {
		return makf;
	}
	
	@FindBy(xpath = "(//div[@value='Make Form Persistent'])[1]")

	private WebElement selmar;

	public WebElement getselmar() {
		return selmar;
	}
	
	@FindBy(xpath = "//tbody/tr[1]/th[1]/div[1]")

	private WebElement selpa;

	public WebElement getselpa() {
		return selpa;
	}
	@FindBy(xpath = "(//a[normalize-space()='Appointment'])[1]")

	private WebElement selap;

	public WebElement getselap() {
		return selap;
	}
	
	@FindBy(xpath = "(//div[@id='rc-tabs-4-tab-2'])[1]")

	private WebElement pasapp;

	public WebElement getpasapp() {
		return pasapp;
	}
	
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Show Edit'])[1]")

	private WebElement showe;

	public WebElement getshowe() {
		return showe;
	}

	@FindBy(xpath = "(//div[@class='sc-hQXzsD eJZYXZ edit-note-nav-title edit-note-form-tit-3'])[1]")

	private WebElement cliadd;

	public WebElement getcliadd() {
		return cliadd;
	}
	
	@FindBy(xpath = "(//div[@class='sc-hQXzsD eJZYXZ active schedule-menu p-t-10 form_list'])[1]")

	private WebElement seltes;

	public WebElement getseltes() {
		return seltes;
	}
	
	@FindBy(xpath = "(//textarea[@id='enox73e00000000-textArea'])[1]")

	private WebElement selno;

	public WebElement getselno() {
		return selno;
	}
	
	@FindBy(xpath = "(//*[@id='macro_btn']/div/div[2]/button[1])[4]")

	private WebElement selno1;

	public WebElement getselno1() {
		return selno1;
	}
	
	@FindBy(xpath = "(//*[@id='macro_btn']/div/div[2]/button[2])[4]")

	private WebElement selno2;

	public WebElement getselno2() {
		return selno2;
	}
	
	@FindBy(xpath = "(//div[contains(@class,'m-t-10')])[1]")

	private WebElement bac;

	public WebElement getbac() {
		return bac;
	}
	@FindBy(xpath = "(//a[normalize-space()='Back'])[1]")

	private WebElement bac1;

	public WebElement getbac1() {
		return bac1;
	}
}
