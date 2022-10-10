package lippia.web.Validator;

import lippia.web.constants.RegistrationConstants;
import org.testng.asserts.SoftAssert;

import static com.crowdar.core.actions.ActionManager.isVisible;

public class RegistrationValidate {
    static SoftAssert softAssert = new SoftAssert();

    public static void verificarPassNull() {
        softAssert.assertTrue(isVisible(RegistrationConstants.ERROR_PASSWORD_XPATH));


    }

    public static void verificarEmailInvalido() {
        softAssert.assertTrue(isVisible(RegistrationConstants.ERROR_EMAIL_XPATH));
    }
    public static void verificarRegistro(){
        softAssert.assertTrue(isVisible(RegistrationConstants.BTN_DASHBOARD_XPATH));
    }
}

