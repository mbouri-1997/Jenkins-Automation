package stepDefinitions;







import java.util.List;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions{
	
	WebDriver webDriver;
	private Hook hook = new Hook(webDriver);
	
	
	
	
	
//	public LoginStepDefinitions(BaseUtil base)
//	{
//		this.base=base;
//	}
	
	
	
	public LoginStepDefinitions()
	{
		
	}
	
	
	@Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        System.out.println("I navigate to the login page : ");
        hook.webDriver.navigate().to("https://www.overleaf.com/login");
    }

	@Given("I enter the following for login")
	public void i_enter_the_following_for_login(DataTable dataTable) {
	    List<Map<String,String>> list = dataTable.asMaps();
	    for(Map<String,String> map : list)
	    {
	    	String username = map.get("Username");
	    	String password = map.get("Password");
	    	String email = map.get("Email");
	    	System.out.println("Username : "+username+",password : "+password+",emai : "+email);
	    }
	    
	}

    @And("I click login button")
    public void i_click_login_button() {
        System.out.println("B");
    }
    
    @Then("I should see the userform page")
    public void i_should_see_the_userform_page() {
        System.out.println("C");
    }
    
    @Given("I enter ([^\"]*) and ([^\"]*) and ([^\"]*)$")
    public void i_enter_admin1_and_adminpassword1_and_admin1gmail_com(String Username, String Password, String Email) {
        System.out.println(Username);
        System.out.println(Password);
        System.out.println(Email);
//        throw new io.cucumber.java.PendingException();
    }
	
}
