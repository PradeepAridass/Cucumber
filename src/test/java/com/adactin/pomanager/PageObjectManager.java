package com.adactin.pomanager;

import org.openqa.selenium.WebDriver;
import com.adactin.pom.BackLogIn;
import com.adactin.pom.BookHotelPage;
import com.adactin.pom.HotelSearch;
import com.adactin.pom.HotelSelect;
import com.adactin.pom.LogInPage;
import com.adactin.pom.LogOutPage;

public class PageObjectManager {

	public static WebDriver driver;
	
	private LogInPage sp;
	private HotelSearch ss;
	private HotelSelect hs;
	private BookHotelPage b;
	private LogOutPage l;
	private BackLogIn bl;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2; 
	}

	public LogInPage getSp() {
		sp = new LogInPage(driver);
		return sp;
	}

	public HotelSearch getSs() {
		ss = new HotelSearch(driver);
		return ss;
	}

	public HotelSelect getHs() {
		hs = new HotelSelect(driver);
		return hs;
	}

	public BookHotelPage getB() {
		return b;
	}

	public LogOutPage getL() {
		return l;
	}

	public BackLogIn getBl() {
		bl = new BackLogIn(driver);
		return bl;
	}
	
	
	
}
