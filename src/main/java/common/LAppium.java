package common; /**
 * Created by yuliua on 2017/12/24.
 */
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
public class LAppium {
    private AppiumDriver driver;
    private String apkName = "weixin_1180.apk";
    private String deviceName = "5LM0216726000767";
    private String platformVersion = "7.0";
    //    private String appActivity = "com.xt.lxl.stock.page.StockMainActivity ";
//    private String appActivity =" com.tencent.mm.ui.account.LoginPasswordUI";
    private String appActivity ="com.tencent.mm.ui.LauncherUI";

    @Before
    public void setup() throws MalformedURLException {
        File root = new File(System.getProperty("user.dir"));
        File apk = new File(root, "apk" + File.separator + apkName);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("app", apk.getAbsolutePath());
        capabilities.setCapability("appActivity", appActivity);
        capabilities.setCapability("noSign", true);
        capabilities.setCapability("noRest", true);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }


//因为其他方法地方调用该方法，完了会跑After,导致会关闭driver，此处注掉
//    @After
//    public void tearDown() {
//        driver.quit();
//    }


    public AppiumDriver getDriver(){
        return this.driver;
    }
}
