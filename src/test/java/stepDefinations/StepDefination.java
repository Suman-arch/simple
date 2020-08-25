package stepDefinations;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObject.HomePage;
import resources.Base;

@RunWith(Cucumber.class)
public class StepDefination extends Base {

	@Given("^validate the browser$")
	public void validate_the_browser() throws Throwable {
		System.out.println("validate the browser");
	}

	@When("^navigate to browser$")
	public void navigate_to_browser() throws Throwable {
		System.out.println("navigate to the browser");
	}

	@Then("^all done$")
	public void all_done() throws Throwable {
		System.out.println("all done");
	}
//	@Before             //Before Hook
//	public void start() throws IOException
//	{
//		driver=initialize();
//		driver.get(props.getProperty("url"));
//	}

	@Given("^User is on the landing page$")
	public void user_is_on_the_landing_page() throws Throwable {
		driver = initialize();
		driver.get(props.getProperty("url"));
		System.out.println("user is on landing page");

	}

//    @When("^user enter the \"([^\"]*)\" and the \"([^\"]*)\"$")  //using tag
//    public void user_enter_the_something_and_the_something(String strArg1, String strArg2) throws Throwable {
//    	HomePage hp=new HomePage(driver);
//      hp.getEmail().sendKeys(strArg1);
//      hp.getPassword().sendKeys(strArg2);
//      hp.getClick().click();
//    }

	@When("^user enter the (.+) and the (.+)$") // using parameter
	public void user_enter_the_and_the(String username, String password) throws Throwable {

		HomePage hp = new HomePage(driver);
		hp.getEmail().sendKeys(username);
		hp.getPassword().sendKeys(password);
		hp.getClick().click();
	}

//    @When("user enter the username and the password")  //using datatable
//    public void user_enter_the_username_and_the_password(DataTable table) throws Throwable {
//    	List<String> data = table.asList(String.class);
//       // System.out.println(data.get(1)); 
//        
//        //Enter data
//       
//    	HomePage hp=new HomePage(driver);
//        hp.getEmail().sendKeys(data.get(0));
//        hp.getPassword().sendKeys(data.get(1));
//        hp.getClick().click();
//    }
//    @When("user enter the username and the password")  //using datatable as a parameter
//    public void user_enter_the_username_and_the_password(DataTable testData) throws Throwable {
//    	Map<String, String> data = testData.asMap(String.class,String.class);
//       // System.out.println(data.get(1)); 
//        
//        //Enter data
//       
//    	HomePage hp=new HomePage(driver);
//        hp.getEmail().sendKeys(data.get("username"));
//        hp.getPassword().sendKeys(data.get("password"));
//        hp.getClick().click();
//    }

	@Then("^user should be on the home page$")
	public void user_should_be_on_the_home_page() throws Throwable {
		System.out.println(driver.getCurrentUrl());
	}

	@And("^close the browser$")
	public void close_the_browser() throws Throwable {
		System.out.println("Browser is closed");
	}

//    @After                   //after hook
//    public void stop()
//    {
//    	driver.close();
//    }
}