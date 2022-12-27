package PhoneSelectTest;

import StepObject.PhoneSelectPageStep;
import Utils.ChromeRanner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhoneSelectTest extends ChromeRanner {
    @Test
    @Description("Phone filter Checking")
    public void PhoneSelectTest (){
        PhoneSelectPageStep step = new PhoneSelectPageStep();
        step.close()
            .phone()
            .scroll()
            .close()
            .apple();
        Assert.assertTrue(step.apple.is(Condition.appear));
            step.samsung()
            .phoneSelectPrice("1500","2500");
        Assert.assertNotNull(step.minPrice,"minPrice");
            step.close()
            .filterClear();
            Assert.assertTrue(step.filterClear.is(Condition.enabled));
    }
}
