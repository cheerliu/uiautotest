package common;


import com.thoughtworks.selenium.Wait;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Wait;

/**
 * Created by yuliua on 2017/12/18.
 */
public class WaitUtils {
    public WaitUtils(){

    }

    public  static boolean isPageElementExist(WebElement element){
        try{
            untilPageElementExit(element);
            return true;
        }catch (Exception var2){
            return false;
        }
    }

    public  static boolean isPageElementExist(WebElement element,long timeoutInSeconds){
        try{
            untilPageElementExit(element,timeoutInSeconds);
            return true;
        }catch (Exception var2){
            return false;
        }
    }

    public static void untilPageElementExit(final WebElement element){
        (new Wait(){
            public boolean until(){
                try{
                    element.getLocation();
                    return true;
                }catch (Exception var2){
                    return false;
                }
            }
        }).wait("Wait Page Element to be exist");
    }

    public static void untilPageElementExit(final WebElement element,long timeoutInSeconds){
        (new Wait(){
            public boolean until(){
                try{
                    element.getLocation();
                    return true;
                }catch (Exception var2){
                    return false;
                }
            }
        }).wait("Wait Page Element to be exist",timeoutInSeconds*1000L);
    }

    /**
     * 等N秒钟
     */
    public static void sleepSecond(long timeoutSeconds){
        try {
            Thread.sleep(timeoutSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

