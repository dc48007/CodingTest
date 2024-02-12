package com.internal.Archieved.Practise.SeleniumPractise;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;

public class AutomationScriptForBloombergSite {



    WebDriver driver;

    @BeforeTest public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @Test public void TestBloomBergStocks() {
        HashMap<String, Queue<CurrencyEntity>> currencyMap = new HashMap<>();
        driver.get("https://www.bloomberg.com/markets/currencies");
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(d -> ((JavascriptExecutor) d).executeScript("return document.readyState").equals("complete"));
        List<WebElement> rows = driver.findElements(By.xpath("(//tr[@class='data-table-row'])"));
        for (WebElement row : rows) {
            //     String currency1 =row.findElement(By.xpath(".//td")).getText();
            String currency = row.findElement(By.xpath(".//th//div[@data-type='full']")).getText();
            String value = row.findElement(By.xpath(".//td[1]")).getText();
            String change = row.findElement(By.xpath(".//td[2]")).getText();
            String netChange = row.findElement(By.xpath(".//td[3]")).getText();
            System.out.println(currency + ", " + value + ", " + change + ", " + netChange);
            Queue<CurrencyEntity> queue = new PriorityQueue();
            queue.offer(new CurrencyEntity(value, change, netChange));
            currencyMap.put(currency, queue);
        }
        Optional<Queue> currencyEntityQueue = currencyMap.entrySet().stream().filter(curr -> curr.getKey().contains("EUR-USD")).map(f -> (Queue) f.getValue()).findFirst();
        CurrencyEntity currencyEntityQueue1 = (CurrencyEntity) currencyEntityQueue.get();
        System.out.println(currencyEntityQueue1.currencyValue + ", " + currencyEntityQueue1.currencyChange + ", " + currencyEntityQueue1.currencyNetChange);
    }

    @AfterTest public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
//



