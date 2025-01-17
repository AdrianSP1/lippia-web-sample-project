package lippia.web.services;


import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {
    public static  void  navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void clickMyAccount(){
        click(LoginConstants.BTN_MYACCOUNT_XPATH);
    }

    public static void inputUser(String text){
        setInput(LoginConstants.INPUT_USERNAME_ID, text);
    }
    public static void inputPassword(String text){
        setInput(LoginConstants.INPUT_PASSWORD_ID, text);
    }
    public static void clickLogin(){
        click(LoginConstants.BTN_LOGIN_XPATH);
    }


    public static void HappyLogin(){
        inputUser(LoginConstants.HAPPY_USER);
        inputPassword(LoginConstants.HAPPY_PASSWORD);
        clickLogin();

    }



}
