package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class PhoneSearchPage {
    public SelenideElement
            searchInput = $(byId("small-searchterms")),
            Apple = $(byText("Apple MacBook Air 13 M2 Chip 8GB/256GB LL/A Silver")),
            closeBtn = $(byId("close-btn")),
            cartPhoneBtn = $(byId("add-to-cart-button-15648")),
            goToCart = $(byText("კალათაში გადასვლა")),
            clearCart = $(byId("clear-basket-button")),
            yes = $(byClassName("confirm_button"));
}
