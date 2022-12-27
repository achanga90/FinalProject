package StepObject;

import PageObject.NewGroupPage;

import javax.swing.*;

import static com.codeborne.selenide.Selenide.sleep;

public class NewGroupPageStep extends NewGroupPage {
    public NewGroupPageStep email (String email){
        emailInput.setValue(email);
        return this;
    }
    public NewGroupPageStep password (String password){
        passwordInput.setValue(password);
        return this;
    }
    public NewGroupPageStep logIn (){
        logInBtn.pressEnter();
        return this;
    }
    public NewGroupPageStep group (){
        sleep(100);
        group.click();
        return this;
    }
    public NewGroupPageStep newGroup (){
        newGroup.click();
        return this;
    }
    public NewGroupPageStep groupName (String groupName){
        GroupName.setValue(groupName);
        return this;
    }
    public NewGroupPageStep choosePrivacy (){
        choosePrivacy.selectOption("Private");
        return this;
    }
    public NewGroupPageStep create (){
        create.click();
        return this;
    }
    public NewGroupPageStep newpost (){
        post.click();
        return this;
    }
    public NewGroupPageStep newpost (String post){
        newPost.setValue(post);
        return this;
    }
    public NewGroupPageStep post (){
        post.click();
        return this;
    }
}
