package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement
            registrationBtn = $(byText("Create new account")),
            firstNameInput = $(byName("firstname")),
            lastNameInput = $(byName("lastname")),
            mailInput = $(byName("reg_email__")),
            mailConfirmationInput = $(byName("reg_email_confirmation__")),
            passwordInput = $(byId("password_step_input")),
            birthdayMonthInput = $(byName("birthday_month")),
            birthDayInput = $(byName("birthday_day")),
            birthDayYearInput = $(byName("birthday_year")),
            genderInput = $(byName("sex"),1),
            singUpBtn = $(byName("websubmit")),
            account = $(byText("No, create new account"));


}
