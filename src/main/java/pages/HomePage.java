package pages;

/**
 * Created by yuliua on 2017/12/24.
 */
import common.CapPage;
import common.WaitUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

/**
 * Created by yuliua on 2017/12/24.
 */
public class HomePage extends CapPage<HomePage> {
    public HomePage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    private WebElement allowBtn;

    @AndroidFindBy(id = "com.tencent.mm:id/cu1")
    private WebElement loginBtn;

    @AndroidFindBy(id = "com.tencent.mm:id/cu0")
    private WebElement registerBtn;

    @AndroidFindBy(xpath = "//*[@resource-id='com.tencent.mm:id/he' and @text='请填写手机号']")
    private WebElement inputMobileNumber;

    /**
     * 进入页面，一直点击允许
     */
    public void clickAllowBtn(){
        while (allowBtn.isDisplayed()){
            WaitUtils.sleepSecond(1000);
            allowBtn.click();
            WaitUtils.sleepSecond(1000);
        }

        if (WaitUtils.isPageElementExist(loginBtn)){
            System.out.println("请登录之后，再执行用例");
        }
    }

    public boolean allowBtnIsDisplayed(){
        if (WaitUtils.isPageElementExist(allowBtn)){
            return true;
//            WaitUtils.sleepSecond(1000);
        }else {
            return false;
        }
    }

    public boolean isHomePage(){
        while (allowBtnIsDisplayed()){

            allowBtn.click();
            WaitUtils.sleepSecond(1000);
        }

        if (WaitUtils.isPageElementExist(loginBtn)){
            System.out.println("请登录之后，再执行用例");
        }
        boolean Flag=true;
        if (WaitUtils.isPageElementExist(loginBtn)){
            Flag= true;
        }else{
            Flag= false;
        }
        return Flag;
    }


    public void clickToLoginPage(){
        if (WaitUtils.isPageElementExist(loginBtn)){
            loginBtn.click();
        }
    }

}

