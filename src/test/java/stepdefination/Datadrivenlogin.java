package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadrivenlogin {
public static WebDriver driver;
    @Given("user again click on login button")
    public void user_again_click_on_login_button() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.whiteboxqa.com/");

    }
    @When("^user again enters (.*) and (.*)$")
    public void user_again_enters_username_and_password(String username,String password) {
        driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.id("username")).sendKeys("username");
        driver.findElement(By.id("password")).sendKeys("password");


    }
    @And("user comes on the login page again")
    public void user_comes_on_the_login_page_again() {
        driver.findElement(By.id("login")).click();

    }
    @Then("user again lands on landing page")
    public void user_again_lands_on_landing_page() {
        driver.getPageSource().contains("LogOut");
        driver.close();

    }

}
