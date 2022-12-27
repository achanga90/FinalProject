package RegistrationTest;

import StepObject.RegistrationPageStep;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static DataObject.RegistrationPageData.*;
import static DataObject.RegistrationPageData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationTest extends ChromeRunner {
    @Test
    @Description("Checking facebook create new account")
    public void RegistrationTest(){
        RegistrationPageStep step = new RegistrationPageStep();
        Assert.assertTrue(step.registrationBtn.is(Condition.visible),"Create new account");
        step.gotoRegistrationPage()
                .firstName(firstName)
                .lastName(lastName)
                .mail(mail)
                .mailConfirmation(mail)
                .password(password)
                .birthdayMonth(birthDayMonth)
                .birthDay(birthDay)
                .birthDayYear(birthDayYear)
                .gender()
                .singUp();

        Assert.assertFalse(step.firstNameInput.is(Condition.empty),"firstname");
        Assert.assertEquals(step.mailInput.getValue(),mail,"mail");
        Assert.assertEquals(step.birthDayInput.getValue(),birthDay,"birthDay");
        Assert.assertTrue(step.singUpBtn.is(Condition.enabled),"Sing Up");


    }
}
