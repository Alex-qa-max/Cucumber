package mixcloud.cucumber.steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;


@RunWith(SerenityRunner.class)

public class loginsteps {
    @Managed  WebDriver driver;


    @Test

    @Given("^User navigates to mixcloud website$")
    public void user_navigates_to_mixcloud_website() {
        driver.get("https://www.mixcloud.com/");
        this.driver.manage().window().maximize();
    }

    @Step
    @When("^User clicks on the login button on homepage$")
    public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
        driver.findElement(By.xpath("//span[contains(text(), 'Log in')]")).click();
    }

    @Step
    @When("^User enters a valid username \"([^\"]*)\"$")
    public void user_enters_a_valid_username(String username) {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]//div/form/div[1]//input")).sendKeys(username);


    }
    @Step
    @When("^User enters a valid password \"([^\"]*)\"$")
    public void user_enters_a_valid(String password) {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]//div/form/div[2]//input")).sendKeys(password);

    }
    @Step
    @When("^User clicks on the login button$")
    public void user_clicks_on_the_login_button() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();

    }
    @Step
    @Then("^User should be logged in$")
    public void user_should_be_logged_in() throws Throwable {
        Thread.sleep(5000);
        WebElement Names=driver.findElement(By.xpath("//span[contains(text(), 'Poilo')]"));
        Assert.assertEquals(true,  Names.isDisplayed());
    }
    @Then("^User enters searchkey$")
    public void user_enters_searchkey() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/div/div/header/div/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/div/div/header/div/div[2]/input")).sendKeys("Martin Garrix");

    }

    @When("^User find searchkey and click on it$")
    public void user_find_searchkey_and_click_on_it() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/div/div/div[1]/div/div/section/div[1]/div[2]/div[2]/section/div/ul/li[1]/span/b/span[1]/a")).click();

    }

    @When("^User use Play all$")
    public void user_use_Play_all() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/div/div/div/div/div[2]/section/div/div[1]/div/button")).click();


    }

    @When("^User Follow it$")
    public void user_Follow_it() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/div/div/div/div/div[2]/section/div/div[1]/div/div/span")).click();


    }

    @Then("^User check that searchkey add to favorite in profile$")
    public void user_check_that_searchkey_add_to_favorite_in_profile() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/div/div/header/div/div[3]/div[1]/div/span")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/div/div/header/div/div[3]/div[1]/span/div/div/ul/li[1]/a")).click();
        Thread.sleep(5000);
        WebElement Followname=driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/div/div/div/div/div[4]/main/div[2]/section/ul/li/span/b/span[1]/a"));
        Assert.assertEquals(true,  Followname.isDisplayed());
    }

    @When("^User delete searchkey from favorite$")
    public void user_delete_searchkey_from_favorite() throws Throwable {
        Thread.sleep(9000);
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/div/div/div/div/div[4]/main/div[2]/section/ul/li/span/span/a/div/img")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/div/div/div/div/div[2]/section/div/div[1]/div/div/div/div")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/div/div/div/div/div[2]/section/div/div[1]/div/div/div/div[2]/div/ul/li[2]/a")).click();

    }

}