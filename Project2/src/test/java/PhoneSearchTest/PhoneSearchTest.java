package PhoneSearchTest;

import StepObject.PhoneSearchPageStep;
import Utils.ChromeRanner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.PhoneSearch.apple;
import static com.codeborne.selenide.Selenide.sleep;

public class PhoneSearchTest extends ChromeRanner {
    @Test
    @Description("Phone Search")
    public void PhoneSearchTest (){
        PhoneSearchPageStep step = new PhoneSearchPageStep();
        step.search(apple);
        Assert.assertEquals(step.searchInput.getValue(),apple);
        step.Apple()
            .cartPhone();
        Assert.assertTrue(step.Apple.is(Condition.enabled));
        step.goToCart()
            .clearCart();
        Assert.assertTrue(step.goToCart.is(Condition.empty));
    }
}
