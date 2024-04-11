package qa.test;


import base.BaseTest;
import org.testng.annotations.Test;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class Testcase1 extends BaseTest {

    ElementFetch ele = new ElementFetch();
    HomePageEvents homePageEvents = new HomePageEvents();
    LoginPageEvents loginPageEvents = new LoginPageEvents();

    @Test
    public void sampleMethodForEnteringCredentials(){
        logger.info("Sign into LoginPage");
        homePageEvents.signInButton();
        logger.info("Verifiying if login text is present");
        loginPageEvents.verifyIfLoginPageIsLoaded();
        logger.info("Verifying enter the credentials");
        loginPageEvents.enterCredentials();
    }

}
