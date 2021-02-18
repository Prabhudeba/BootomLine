package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class loginPage extends PageObject {
    @FindBy(xpath="//*[@type='email']")
    public WebElementFacade email;

    @FindBy(xpath="//*[text()='Next']")
    public WebElementFacade nextBtn;

    @FindBy(xpath="//*[@type='password']")
    public WebElementFacade password;

    @FindBy(id="signIn")
    public WebElementFacade signIn;

    @FindBy(xpath = "//div[@id=':jb']/div[@class='z0']/div")
    public WebElementFacade composeEmail;

    @FindBy(xpath = "//div[@class='wO nr l1']//textarea[@name='to']")
    public WebElementFacade emailTo;
    @FindBy(xpath = "///div[@class='aoD az6']//input[@name='subjectbox']")
    public WebElementFacade composeEmailSub;
    @FindBy(xpath = "//div[@class='Ar Au']/div[@class='Am Al editable LW-avf']")
    public WebElementFacade composeEmailbody;
    @FindBy(xpath = "//div[@class='J-J5-Ji']/div[@class='T-I J-J5-Ji aoO T-I-atl L3']")
    public WebElementFacade sendBtn;
    @FindBy(xpath = "//*[contains(text(), 'Here comes an attachment')]")
    public WebElementFacade emailList;

    @FindBy(xpath = "//a[@title='Demo inbox']")
    public WebElementFacade gmailInbox;





}
