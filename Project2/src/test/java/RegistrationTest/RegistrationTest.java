package RegistrationTest;

import StepObject.RegistrationPageStep;
import Utils.ChromeRanner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.RegistrationPageData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationTest extends ChromeRanner {
    @Test
    public void RegistrationTest(){
        RegistrationPageStep step = new RegistrationPageStep();
        step.profile()
              .registration()
              .iAgree()
              .close()
              .password(password);
        Assert.assertEquals(step.Password.getValue(),password,"password");
        Assert.assertTrue(step.email.is(Condition.empty));
    }
}
