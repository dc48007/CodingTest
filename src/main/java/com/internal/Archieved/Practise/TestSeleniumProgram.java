package com.internal.Archieved.Practise;
import com.internal.Archieved.TestNG.Listerners;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * @author deepak chaudhary
 */
@Listeners(Listerners.class)
public class TestSeleniumProgram {


    WebDriver webDriver = null;
    public static ThreadLocal<WebDriver> currentDriver = new ThreadLocal<>();

    @BeforeTest
    public void setUp() {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\deepakc\\Desktop\\CNH\\CodingTest\\src\\main\\resources\\drivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
        currentDriver.set(webDriver);
        webDriver.manage().window().maximize();
    }



    @Test
    public void testShadowDomElement(){
        webDriver.get("http://watir.com/examples/shadow_dom.html");
        webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        WebElement shadowHost = webDriver.findElement(By.cssSelector("[id='shadow_host']"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        try{
            shadowRoot.findElement(By.cssSelector("#shadow_content > span")).isDisplayed();
            Assert.assertEquals(shadowRoot.findElement(By.cssSelector("#shadow_content > span")).getText(), "some text");
        }catch (Exception e){
            throw new RuntimeException("Element not found", e);
        }

    }


    @Test
    public void testMakeMyTripApp() {
        webDriver.get("https://www.makemytrip.com/");
        webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        clickOnFlights();
        clickOnRoundTripRadioButton();
        selectDeparture("Tue May 23 2023");
        selectArrival("Sun May 25 2023");
        clickSearch();
    }

    public static WebDriver getDriver() {
        return currentDriver.get();
    }



    @AfterTest public void tearDown() {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }

    public void clickSearch() {
        getDriver().findElement(By.xpath(search)).click();
    }

    public void clickOnRoundTripRadioButton() {
        WebElement element;
        try {
            element = webDriver.findElement(By.cssSelector(roundTrip));
            element.click();
        } catch (Exception e) {
            new WebDriverWait(getDriver(), Duration.ofMillis(20000)).until(d -> {
                try {
                    return d.findElement(By.cssSelector(roundTrip)).isEnabled();
                } catch (Exception e1) {
                    return false;
                }
            });
            element = getDriver().findElement(By.xpath(flight));
            element.click();
        }
    }

    public void clickOnFlights() {
        WebElement element;
        try {
            element = webDriver.findElement(By.xpath(flight));
            element.click();
        } catch (Exception e) {
            new WebDriverWait(getDriver(), Duration.ofMillis(20000)).until(d -> {
                try {
                    return d.findElement(By.xpath(flight)).isDisplayed();
                } catch (Exception e1) {
                    return false;
                }
            });
            element = getDriver().findElement(By.xpath(flight));
            element.click();
        }
    }


    public void selectDeparture(String depDate) {
        WebElement element;
        try {
            element = webDriver.findElement(By.xpath(departureDateDropDown));
            element.click();
        } catch (Exception e) {
            new WebDriverWait(getDriver(), Duration.ofMillis(20000)).until(d -> {
                try {
                    return d.findElement(By.xpath(departureDateDropDown)).isDisplayed();
                } catch (Exception e1) {
                    return false;
                }
            });
            element = getDriver().findElement(By.xpath(departureDateDropDown));
            element.click();
        }
        webDriver.findElement(By.xpath("//div[@aria-label='" + depDate + "']//div[@class='dateInnerCell']")).click();
    }


    public void selectArrival(String arrDate) {
        WebElement element;
        try {
            element = webDriver.findElement(By.xpath(arrivalDateDropDown));
            element.click();
        } catch (Exception e) {
            new WebDriverWait(getDriver(), Duration.ofMillis(20000)).until(d -> {
                try {
                    return d.findElement(By.xpath(arrivalDateDropDown)).isDisplayed();
                } catch (Exception e1) {
                    return false;
                }
            });
            element = getDriver().findElement(By.xpath(arrivalDateDropDown));
            element.click();
        }
        webDriver.findElement(By.xpath("//div[@aria-label='" + arrDate + "']//div[@class='dateInnerCell']")).click();
    }
    //Locators below here

    String flight = "//li[@class='menu_Flights']//a[@href='https://www.makemytrip.com/flights/']";
    String roundTrip = "li[data-cy='roundTrip']";
    String departureDateDropDown = "//span[normalize-space()='Departure']";
    String arrivalDateDropDown = "//span[normalize-space()='Return']";
    String search = "//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']";
}
