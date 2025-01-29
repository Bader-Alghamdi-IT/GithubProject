package ObjectsPath;

import org.openqa.selenium.By;

public class GithubPaths {

    //public static final By bader = By.xpath("");

    public static final By signIn = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/div/a");

    public static final By username = By.xpath("//input[@id='login_field']");

    public static final By password = By.xpath("//input[@id='password']");

    public static final By signInBtn = By.xpath("//input[@name='commit']");

    public static final By signUp = By.xpath("//*[@id='login']/div[5]/p/a");

    public static final By terms = By.xpath("//*[@id='terms-of-service']/a[1]");

    public static final By privacy = By.xpath("//*[@id='terms-of-service']/a[2]");

}
