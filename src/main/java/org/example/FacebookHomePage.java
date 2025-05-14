package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePage {
    WebDriver driver;
    public FacebookHomePage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
        WebElement textbox = driver.findElement(By.id("textBoxLocator"));
    }
    


    @FindBy(id="email")
    WebElement emailBody;

    @FindBy(id="pass")
    WebElement passwordBodyText;

    @FindBy(xpath="//button[@name='login']")
    WebElement loginButton;

    public void typeEmail(String email) {
        this.emailBody.sendKeys(email);
    }

    public void typePass(String pass) {
        this.passwordBodyText.sendKeys(pass);
    }

    public void clickOnLogin(){
        loginButton.click();
    }
}
