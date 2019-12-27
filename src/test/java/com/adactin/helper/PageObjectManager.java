package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookHotelPage;
import com.adactin.pom.BookedItineraryPage;
import com.adactin.pom.BookingConfirmPage;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.SelectHotelPage;

public class PageObjectManager {
	public static WebDriver driver;
	
	private LoginPage lp;
	private BookedItineraryPage bip;
	private BookHotelPage bhp;
	private BookingConfirmPage bcp;
	private SearchHotelPage srcp;
	private SelectHotelPage selp;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage getLp() {
		lp = new LoginPage(driver);
		return lp;
	}
	
	public BookedItineraryPage getBip() {
		bip = new BookedItineraryPage(driver);
		return bip;
	}
	
	public BookHotelPage getBhp() {
		bhp = new BookHotelPage(driver);
		return bhp;
	}
	
	public BookingConfirmPage getBcp() {
		bcp = new BookingConfirmPage(driver);
		return bcp;
	}
	
	public SearchHotelPage getSrcp() {
		srcp = new SearchHotelPage(driver);
		return srcp;
	}
	
	public SelectHotelPage getSelp() {
		selp = new SelectHotelPage(driver);
		return selp;
	}

}
