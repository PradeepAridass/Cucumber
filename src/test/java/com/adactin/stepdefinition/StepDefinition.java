package com.adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.base.BaseClass;
import com.adactin.pom.BackLogIn;
import com.adactin.pom.BookHotelPage;
import com.adactin.pom.HotelSearch;
import com.adactin.pom.HotelSelect;
import com.adactin.pom.LogInPage;
import com.adactin.pom.LogOutPage;
import com.adactin.pomanager.PageObjectManager;
import com.adactin.runner.TestRunner;
import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
//	LogInPage lp = new LogInPage(driver);
//	HotelSearch ss = new HotelSearch(driver);
//	HotelSelect hs = new HotelSelect(driver);
//	BookHotelPage b = new BookHotelPage(driver);
//	LogOutPage	l = new LogOutPage(driver);
//	BackLogIn bl = new BackLogIn(driver);

	@Given("^User launch the application$")
	public void user_launch_the_application() throws IOException {
		getUrl("https://adactinhotelapp.com/");
	}

	@When("^User enter the valid username in the username field$")
	public void user_enter_the_valid_username_in_the_username_field() {
		sendValue(pom.getSp().getUsername(), "PradeepStar");
	}

	@When("^user enter the valid password in the password field$")
	public void user_enter_the_valid_password_in_the_password_field() {
		sendValue(pom.getSp().getPassword(), "123456789");
	}

	@When("^user is able to click the login button$")
	public void user_is_able_to_click_the_login_button() {
		clickElement(pom.getSp().getLogin());
	}

	@Then("^user verify the navigate to search hotel page$")
	public void user_verify_the_navigate_to_search_hotel_page() {

	}
	
	@When("^user search and select the location of the hotel in the dropdown of location field$")
	public void user_search_and_select_the_location_of_the_hotel_in_the_dropdown_of_location_field() {
		dropDownValue(pom.getSs().getLocation(), "New York");
	}

	@When("^user is able to choose the hotel in the dropdown of hotels field$")
	public void user_is_able_to_choose_the_hotel_in_the_dropdown_of_hotels_field() {
		dropDownValue(pom.getSs().getHotels(), "Hotel Sunshine");
	}

	@When("^user is able to choose the room type in the dropdown of room type field$")
	public void user_is_able_to_choose_the_room_type_in_the_dropdown_of_room_type_field() {
		dropDownValue(pom.getSs().getRoomtype(), "Standard");
	}

	@When("^user is able to select the number of rooms in the dropdown of number of rooms field$")
	public void user_is_able_to_select_the_number_of_rooms_in_the_dropdown_of_number_of_rooms_field() {
		dropDownValue(pom.getSs().getNrooms(), "1");
	}

	@When("^user enter the valid check in date in the check in date field$")
	public void user_enter_the_valid_check_in_date_in_the_check_in_date_field() {
		sendValue(pom.getSs().getCheckin(), "28/11/2021");
	}

	@When("^user enter the valid check out date in the check out date filed$")
	public void user_enter_the_valid_check_out_date_in_the_check_out_date_filed() {
		sendValue(pom.getSs().getCheckout(), "30/11/2021");
	}

	@When("^user is able to select the adults per room in the adults per room field$")
	public void user_is_able_to_select_the_adults_per_room_in_the_adults_per_room_field() {
	dropDownValue(pom.getSs().getAdult(), "2");
	}

	@When("^user is able to select the children per room in the children per room field$")
	public void user_is_able_to_select_the_children_per_room_in_the_children_per_room_field() {
		dropDownValue(pom.getSs().getChild(), "0");
	}

	@Then("^user verify the navigate to select the chosen hotel page$")
	public void user_verify_the_navigate_to_select_the_chosen_hotel_page() {
		clickElement(pom.getSs().getSearchbutton());
	}

	@When("^user is able to click the chosen hotel in the select hotel field$")
	public void user_is_able_to_click_the_chosen_hotel_in_the_select_hotel_field() {
		clickElement(pom.getHs().getRadioButton());
	}

	@When("^user is able to click the continue button$")
	public void user_is_able_to_click_the_continue_button() {
	clickElement(pom.getHs().getSelectButton());
	}

	@Then("^user verify the navigate to book a hotel page$")
	public void user_verify_the_navigate_to_book_a_hotel_page() {
	}
	
	@When("^user enter the valid first name in the first name field$")
	public void user_enter_the_valid_first_name_in_the_first_name_field() {
		sendValue(pom.getB().getfName(), "Pradeep");
	}

	@When("^user enter the valid last name in the last name field$")
	public void user_enter_the_valid_last_name_in_the_last_name_field() {
	sendValue(pom.getB().getlName(), "A");
	}

	@When("^user enter the valid billing address in the billing address field$")
	public void user_enter_the_valid_billing_address_in_the_billing_address_field() {
	sendValue(pom.getB().getBillAddr(), "Chennai");
	}

	@When("^user enter the valid credit card number in the credit card no field$")
	public void user_enter_the_valid_credit_card_number_in_the_credit_card_no_field() {
	sendValue(pom.getB().getCcno(), "6582425265845135");
	}

	@When("^user is able to select the credit card type in the dropdown of credit card type field$")
	public void user_is_able_to_select_the_credit_card_type_in_the_dropdown_of_credit_card_type_field() {
	dropDownValue(pom.getB().getTypecc(), "VISA");
	}

	@When("^user is able to select the valid month of the credit card validation in the expiry date$")
	public void user_is_able_to_select_the_valid_month_of_the_credit_card_validation_in_the_expiry_date() {
		dropDownVisible(pom.getB().getEmonth(), "May");
	}

	@When("^user is able to select the valid year of the credit card validation in the expiry date$")
	public void user_is_able_to_select_the_valid_year_of_the_credit_card_validation_in_the_expiry_date() {
	dropDownValue(pom.getB().getEyear(), "2022");
	}

	@When("^user enter the valid cvv number in the cvv number field$")
	public void user_enter_the_valid_cvv_number_in_the_cvv_number_field() {
	sendValue(pom.getB().getCc(), "125");
	}

	@When("^user is able to click the book now button$")
	public void user_is_able_to_click_the_book_now_button() {
	clickElement(pom.getB().getBook());
	}

	@Then("^user verify the navigate to confirm the booking confirmation page$")
	public void user_verify_the_navigate_to_confirm_the_booking_confirmation_page() {
	}
	

	@When("^user is able to click the logout button$")
	public void user_is_able_to_click_the_logout_button() {
	clickElement(pom.getL().getLogOut());
	}

	@Then("^user verify the navigate to logout as a successful logout page$")
	public void user_verify_the_navigate_to_logout_as_a_successful_logout_page() {
	}

	
	@When("^user is able to click the login again text$")
	public void user_is_able_to_click_the_login_again_text() {
	clickElement(pom.getBl().getBackLogIn());
	}

	@Then("^user verify the navigate to login home page$")
	public void user_verify_the_navigate_to_login_home_page() {
	}
}
