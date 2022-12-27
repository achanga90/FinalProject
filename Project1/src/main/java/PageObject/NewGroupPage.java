package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class NewGroupPage {
    public SelenideElement
            emailInput = $(byName("email")),
            passwordInput = $(byName("pass")),
            logInBtn = $(byName("login")),
            group = $(byText("Groups")),
            newGroup = $(byText("Create new group")),
            GroupName = $(byXpath("//*[@id=\"mount_0_0_HE\"]/div/div[1]/div/div[5]/div/div/div[3]/div[2]/div[1]/div/div[4]/div[1]/div[2]/div/div[2]/div/div/label/div/div/input")),
            choosePrivacy = $(byText("Choose privacy")),
            create = $(byClassName("x6ikm8r")).$(byText("Create")),
            newPost = $(byText("Write something...")),
            post = $(byText("Post"));









}
