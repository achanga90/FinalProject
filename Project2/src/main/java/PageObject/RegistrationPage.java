package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement
            profile = $(byClassName("welcome-text-desktop")),
            registrationBtn = $(byClassName("registration_link")),
            closeBtn = $(byId("close-btn")),
            iAgree = $(byClassName("registration_checkmark")),
            Password = $(byId("register-password")),
            email = $(byId("Email"));


}
