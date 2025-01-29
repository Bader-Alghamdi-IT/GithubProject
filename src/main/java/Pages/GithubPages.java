package Pages;

import ObjectsPath.GithubPaths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.GithubPaths.signIn;
import static ObjectsPath.GithubPaths.*;


public class GithubPages {

    WebDriver driver = null;

    public GithubPages (WebDriver driver){
        this.driver = driver;

    }
    public void openGitUrl(){
        driver.get("https://github.com/");
    }
    public void clickOnSignIn(){
        WebElement SignInBt = driver.findElement(signIn);
        SignInBt.click();
    }

    public void clickOnSignUp(){
        WebElement SignUpBtn = driver.findElement(signUp);
        SignUpBtn.click();
    }

    public void clickOnTermsLink(){
        WebElement Terms = driver.findElement(termsLink);
        Terms.click();
    }

    public void clickOnPrivacyLink(){
        WebElement Privacy = driver.findElement(githubPrivacy);
        Privacy.click();
    }

}
