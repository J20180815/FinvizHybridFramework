package TestScripts;

import Pages.LoginPages;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static GeneralUntil.readdatafromExcelusingcolumnName.readdatafromExcelusingcolumnName;
import static Pages.ReversePrint.removeDuplicateElements;

public class TestLogin {

    public static void main(String[] args) throws IOException {
        WebDriver driver;
        LoginPages loginpages;
        System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe ");
        driver = new FirefoxDriver();
        loginpages = new LoginPages(driver);
        driver.get(LoginPages.DemoURL1);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link:links ){
            try {
                String keyString =   Keys.CONTROL+Keys.SHIFT.toString()+Keys.ENTER.toString();
                link.sendKeys(keyString);
                ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
                driver.switchTo().window(tabs.get(1));
                WebDriverWait wait =new WebDriverWait(driver, 5000);
                if (!driver.getCurrentUrl().toString().contains("403")){
                    System.out.println(link.toString() + "is good link");

                }else{
                    System.out.println(link.toString() + "is broken link");
                }
                driver.close();
                driver.switchTo().window(tabs.get(0));
            }catch (Exception e){
                System.out.println (e);

            }
        }


        /*WebElement context =loginpages.getElement("//input[@type='text']","xpath");
        context.sendKeys("stopwatch");
        context.sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement messageElement = wait.until(
                ExpectedConditions.presenceOfElementLocated ((By.id("loginResponse"))));
        WebElement resetButton = loginpages.getElement(LoginPages.resetButton_xpath,"xpath");
        resetButton.click();
        WebElement userId=loginpages.getElement(LoginPages.userId_xpath,"xpath");
        userId.sendKeys(readdatafromExcelusingcolumnName("UserID"));
        WebElement Password=loginpages.getElement(LoginPages.password_xpath,"xpath");
        Password.sendKeys(readdatafromExcelusingcolumnName("Password"));
        WebElement LoginButton = loginpages.getElement(LoginPages.loginButton_xpath,"xpath");
        LoginButton.click();
        WebElement welcomeMessage =null;

        try {
             welcomeMessage = loginpages.getElement(LoginPages.welcomeMessage,"xpath");
             Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager HomePage" );
        }catch (NoSuchElementException e){

            System.out.println(e.getMessage());
        }
        Assert.assertNotNull(welcomeMessage);
/*
        ReversePrint rp = new ReversePrint();
        String input ="class ReversePrint";
        String abc ="baab";
        String s ="200";
        int[] numbers= {10,1,2,3,4,5,6,7,9};
        rp.reverseArray(numbers);
        rp.reverseString(input);
        rp.PrintCharFromString(input, 2);
        System.out.println(rp.printStringtoIn(s));
        rp.ArraysSort(numbers);
        ReversePrint rp = new ReversePrint();
        Set<WeekDays> set1 = EnumSet.allOf(WeekDays.class);
        Set<WeekDays> set2 = EnumSet.noneOf(WeekDays.class);
        int[] numbers = {1,1,2,2,3,4,4,4,4,5,6,7,9};
        System.out.println("Days of Weeks:"+set2);
        System.out.println(rp.twoSum(numbers,9)[1]) ;
        System.out.println(rp.twoSum(numbers,9)[0]);
        System.out.println(rp.reverseInt(4567889));



        int arr[] = {60,20,20,30,30,60,40,50,50};
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        for (int i = 0; i < length; i++)
            System.out.print(arr[i]+" ");
 */
        //printing array elements




    }

    }
