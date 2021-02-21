package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Locale;

public class LoginPages {
    WebDriver driver;
    public LoginPages(WebDriver driver) {

        this.driver = driver;

    }
    public WebElement getElement(String locator, String type){
        type = type.toLowerCase();
        if (type.equals("id")){
            System.out.println("用Id查找元素"+ locator);
            return this.driver.findElement(By.id(locator));
        }else if(type.equals("xpath")){
            System.out.println("用xpath查找元素"+ locator);
            return this.driver.findElement(By.xpath(locator));
        }else if(type.equals("cssselector")){
            System.out.println("用xpath查找元素"+ locator);
            return this.driver.findElement(By.cssSelector(locator));
        }else{
            System.out.println("元素查找类型不支持");
            return null;
        }

    }
    public static String DemoURL = "http://www.demo.guru99.com/V4/";
    public static String DemoURL1 = "https://www.veeva.com/";
    public static String resetButton_xpath =".//input[@name='btnReset']";
    public static String userId_xpath =".//input[@name='uid']";
    public static String password_xpath ="//input[@name='password']";
    public static String loginButton_xpath =".//input[@name='btnLogin']";
    public static String welcomeMessage ="/html/body/table/tbody/tr/td/table/tbody/tr[3]/td";
    //selectByVisibleText


}
