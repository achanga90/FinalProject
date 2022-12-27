package StepObject;

import PageObject.PhoneSelectPage;

public class PhoneSelectPageStep extends PhoneSelectPage {
    public PhoneSelectPageStep close (){
        closeBtn.click();
        return this;
    }
    public PhoneSelectPageStep phone (){
        phone.click();
        return this;
    }
    public PhoneSelectPageStep scroll (){
        scroll.scrollTo();
        return this;
    }
    public PhoneSelectPageStep apple (){
        apple.click();
        return this;
    }
    public PhoneSelectPageStep samsung (){
        samsung.click();
        return this;
    }
    public PhoneSelectPageStep phoneSelectPrice (String min, String max){
        minPrice.setValue(min);
        maxPrice.setValue(max);
        okBtn.click();
        return this;
    }
    public PhoneSelectPageStep filterClear (){
        filterClear.click();
        return this;
    }
}
