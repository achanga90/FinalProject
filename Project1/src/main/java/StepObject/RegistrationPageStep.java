package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.sleep;


public class RegistrationPageStep extends RegistrationPage {

    public RegistrationPageStep gotoRegistrationPage(){
        registrationBtn.click();
        return this;
    }
    public RegistrationPageStep firstName(String Name){
        firstNameInput.setValue(Name);
        return this;
    }
    public RegistrationPageStep lastName(String lastName){
        lastNameInput.setValue(lastName).shouldBe(Condition.visible, Duration.ofMillis(3000));
        return this;
    }
    public RegistrationPageStep mail (String mail) {
        mailInput.setValue(mail);
        return this;
    }
    public RegistrationPageStep mailConfirmation (String mail) {
        mailConfirmationInput.setValue(mail);
        return this;
    }
    public RegistrationPageStep password (String password) {
        passwordInput.setValue(password);
        return this;
    }
    public RegistrationPageStep birthdayMonth(String birthdayMonth) {
        birthdayMonthInput.selectOption(birthdayMonth);
        return this;
    }
    public RegistrationPageStep birthDay (String birthDay) {
        birthDayInput.selectOptionByValue(birthDay);
        return this;
    }

    public RegistrationPageStep birthDayYear(int birthDayYear) {
        birthDayYearInput.selectOption(birthDayYear);
        return this;
    }
    public RegistrationPageStep gender() {
        genderInput.click();
        return this;
    }
    public RegistrationPageStep singUp () {
        singUpBtn.click();
        return this;
    }
    public RegistrationPageStep account () {
        account.click();
        return this;
    }
}
