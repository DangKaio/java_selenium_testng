import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NGtest {
    private static final Logger log = LoggerFactory.getLogger("MainControl");

    @BeforeClass
    public void beforeClass(){
        System.out.println("用例执行前打印改语句");
        System.out.println("每条Test用例是互不相干的");
        System.out.println("用例开始执行…………");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("用例结束后运行");
    }
    @Test
    public void actions(){
        //设置驱动所在位置
        System.setProperty("webdriver.chrome.driver", "D:\\Software\\Python37\\Scripts\\chromedriver.exe");
        //引用谷歌浏览器驱动
        WebDriver driver = new ChromeDriver();
        // 设置等待页面加载时间是10秒，如果10秒内加载完毕，剩余时间不再等待
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        // 最大化浏览器
        driver.manage().window().maximize();
        //打开百度界面
        driver.get("https://www.baidu.com");
        try {
            //页面等待
            Thread.sleep(300);
            driver.quit();
            log.info("退出");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//    public static void main(String[] args) {
//        WebDriver dr;
//        dr=new ChromeDriver();
//        dr.get("https://www.baidu.com");
//        dr.quit();
//        log.info("error");
//    }
}
