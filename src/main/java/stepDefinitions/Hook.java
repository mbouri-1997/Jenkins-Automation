package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook{
	
	//private BaseUtil base;
	
	public WebDriver webDriver;
	
//	public Hook(BaseUtil base)
//	{
//		this.base=base;
//	}
	
	public Hook(WebDriver webDriver)
	{
		this.webDriver=webDriver;
	}
	
	public Hook()
	{

	}
	
	@Before
	public void beforInitializer(Scenario scenario )
	{
		System.out.println("Openin the browser");
		WebDriverManager.chromedriver().setup();
	    ChromeOptions options = new ChromeOptions();
	    this.webDriver = new ChromeDriver(options);
	    
	   
	}
	
	@After
	public void tearDownTest(Scenario scenario)
	{
		System.out.println("Closing the browser");
	}
	
	public void before_or_after(io.cucumber.java.Scenario scenario) {}
	public void before_or_after() {}

}
