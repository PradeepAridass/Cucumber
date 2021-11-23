package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage {

	public static WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement	firstName;
	
	@FindBy(id = "last_name")
	private WebElement	lastName;
	
	@FindBy(id = "address")
	private WebElement	billAddr;
	
	@FindBy(id = "cc_num")
	private WebElement	ccno;
	
	@FindBy(id = "cc_type")
	private WebElement	typecc;
	
	@FindBy(id = "cc_exp_month")
	private WebElement	emonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement	eyear;
	
	@FindBy(id = "cc_cvv")
	private WebElement	cc;
	
	@FindBy(id = "book_now")
	private WebElement	book;

	public BookHotelPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getfName() {
		return firstName;
	}

	public WebElement getlName() {
		return lastName;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillAddr() {
		return billAddr;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getTypecc() {
		return typecc;
	}

	public WebElement getEmonth() {
		return emonth;
	}

	public WebElement getEyear() {
		return eyear;
	}

	public WebElement getCc() {
		return cc;
	}

	public WebElement getBook() {
		return book;
	}

}
