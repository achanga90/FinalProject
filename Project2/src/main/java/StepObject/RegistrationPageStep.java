package StepObject;

import PageObject.RegistrationPage;

import static DataObject.RegistrationPageData.password;


public class RegistrationPageStep extends RegistrationPage {
    public RegistrationPageStep profile (){
        profile.click();
        return this;
    }
    public RegistrationPageStep registration (){
        registrationBtn.click();
        return this;
    }
    public RegistrationPageStep iAgree (){
        iAgree.click();
        return this;
    }
    public RegistrationPageStep password (String password){
        Password.setValue(password);
        return this;
    }

    public RegistrationPageStep close (){
        closeBtn.click();
        return this;
    }
}
