package Utils;

import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRanner {
    @BeforeTest
    public static void  Runner (){

        open("https://zoommer.ge/");
    }

}
