package steps;

import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.loginPage;

import java.util.List;

public class loginStep extends ScenarioSteps {
    loginPage loginP;

    public void loginToApplication(){
            getDriver().get("https://mail.google.com/");
        getDriver().manage().window().maximize();
// Enter UserName
        loginP.email.sendKeys("userName");
// Enter Password
        loginP.password.sendKeys("password");
// Wait For Page To Load
        waitABit(5000);
// Click on 'Sign In' button
        loginP.signIn.click();

    }

    public void sentEMail(){
        waitABit(5000);
        loginP.composeEmail.click();
        loginP.emailTo.type("prabhudebaparida@gmail.com");
        loginP.composeEmailSub.type("Email Subject");
        loginP.composeEmailbody.type("Email body");
        loginP.sendBtn.click();

    }

    public void verifyEmail() {
        loginP.gmailInbox.click();
        List<WebElement> unreademeil = getDriver().findElements(By.xpath("//*[@class='zF']"));
        String MyMailer = "Email body";
        for (int i = 0; i < unreademeil.size(); i++) {
            if (unreademeil.get(i).isDisplayed() == true) {
                // now verify if you have got mail form a specific mailer (Note Un-read mails)
                // for read mails xpath loactor will change but logic will remain same
                if (unreademeil.get(i).getText().equals(MyMailer)) {
                    System.out.println("Yes we have got mail form " + MyMailer);
                    // also you can perform more actions here
                    // like if you want to open email form the mailer
                    break;
                } else {
                    System.out.println("No mail form " + MyMailer);
                }
            }

        }
    }
}
