package starter.n11selleroffice.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class n11SellerOfficeValidationPageElements {


    public static Target CHECK_VALIDATION = Target.the("validation").located(By.xpath("//span[contains(text(),'Lütfen bir üyelik tipi seçin.')]"));
    //public static Target CHECK_VALIDATION = Target.the("validation").located(By.className(".ui-message-error-detail"));
}
