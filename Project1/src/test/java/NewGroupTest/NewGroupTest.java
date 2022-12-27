package NewGroupTest;

import StepObject.NewGroupPageStep;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.NewGroupPageData.*;
import static com.codeborne.selenide.Selenide.sleep;


public class NewGroupTest extends ChromeRunner {
    @Test
    @Description("facebook create new group")
    public void NewGroupTest (){
        NewGroupPageStep step = new NewGroupPageStep();
        step.email(email)
            .password(password)
            .logIn()
            .group()
            .newGroup()
            .groupName(groupName) // არ ავსებს
            .choosePrivacy()
            .create()
            .newpost();
        Assert.assertTrue(step.post.is(Condition.not(Condition.enabled)));
         step.newpost(post)
            .post();
        Assert.assertEquals(step.emailInput.setValue(email),email,"email");
        Assert.assertTrue(step.logInBtn.is(Condition.enabled));
        Assert.assertTrue(step.GroupName.is(Condition.not(Condition.empty)));
        Assert.assertTrue(step.create.is(Condition.visible));
        Assert.assertTrue(step.post.is(Condition.enabled));








        
    }
}
