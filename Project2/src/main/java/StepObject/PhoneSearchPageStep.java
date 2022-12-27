package StepObject;

import PageObject.PhoneSearchPage;

import static com.codeborne.selenide.Selenide.sleep;

public class PhoneSearchPageStep extends PhoneSearchPage {

    public PhoneSearchPageStep close (){
        closeBtn.click();
        return this;
    }
    public PhoneSearchPageStep search (String apple){
        searchInput.setValue(apple);
        return this;
    }
    public PhoneSearchPageStep Apple (){
        Apple.click();
        return this;
    }
    public PhoneSearchPageStep cartPhone (){
        cartPhoneBtn.click();
        return this;
    }
    public PhoneSearchPageStep goToCart (){
        goToCart.click();
        return this;
    }
    public PhoneSearchPageStep clearCart (){
        clearCart.click();
        yes.click();
        return this;
    }
}
