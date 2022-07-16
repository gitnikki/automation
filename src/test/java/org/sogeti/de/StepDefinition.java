package org.sogeti.de;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class StepDefinition {
    WebDriver driver = null;
    @Given("I navigate to {string}")
    public void iNavigateTo(String url) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("url");
        WebElement we = driver.findElement(By.className("acceptCookie"));
        we.click();
    }

    @When("I hover on Services Link")
    public void iHoverOnServicesLink() {
        /* driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Actions action = new Actions(driver);

        WebElement we = driver.findElement(By.xpath("//li[3]/div"));
        action.moveToElement(we).build().perform();*/
    }

    @And("I clicked Automation Link")
    public void iClickedAutomationLink() {
        WebElement we = driver.findElement(By.linkText("Automation"));
        we.click();
    }

    @Then("Automation screen should be displayed")
    public void automationScreenShouldBeDisplayed() {
    }

    @And("Automation text should be visible")
    public void automationTextShouldBeVisible() {
    }

    @Then("Service and Automation should be selected")
    public void serviceAndAutomationShouldBeSelected() {
    }

    @And("I close browser")
    public void iCloseBrowser() {
        driver.close();
    }
}
