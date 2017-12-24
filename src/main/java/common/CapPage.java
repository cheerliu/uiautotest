package common;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import java.util.concurrent.TimeUnit;

/**
 * Created by yuliua on 2017/12/18.
 */
public class CapPage<T extends LoadableComponent<T>> extends LoadableComponent<T> {
    public static long globalImplicitlyWaitInSeconds = 6L;
    private AppiumFieldDecorator afd;
    protected AppiumDriver driver;
    public CapPage(AppiumDriver driver){
        this.driver=(AppiumDriver) driver;
        this.afd=new AppiumFieldDecorator(driver,globalImplicitlyWaitInSeconds, TimeUnit.SECONDS);
        PageFactory.initElements(this.afd,this);


    }


    @Override
    protected void load(){

    }
    @Override
    protected void isLoaded() throws Error {

    }
}
