package testCase;

import common.LAppium;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;

/**
 * Created by yuliua on 2017/12/24.
 */
public class CaseInHomePage extends LAppium {
    @Test
    public void newHomePage(){

        AppiumDriver driver=getDriver();

        HomePage homePage=new HomePage(driver);
//        homePage.clickAllowBtn();

        Assert.assertTrue(homePage.isHomePage());




    }
}
