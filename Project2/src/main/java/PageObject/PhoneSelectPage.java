package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class PhoneSelectPage {
    public SelenideElement
            closeBtn = $(byId("close-btn")),
            phone = $(byClassName("navigation")).$(byText("მობილურები")),
            minPrice = $(byId("min_price")),
            maxPrice = $(byId("max_price")),
            okBtn = $(byText("ok")),
            apple = $(byClassName("accordion_checkbox_container"),0),
            samsung = $(byClassName("accordion_checkbox_container"),4),
            scroll = $(byClassName("product_list_page")),
            filterClear = $(byClassName("filter_clear_all"));





}
