package starter.n11selleroffice.tasks;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.n11selleroffice.user_interface.n11SellerOfficeHomePage;



public class NavigateTo {
    public static Performable theN11HomePage() {
        return Task.where("{0} opens the n11 seller office home page",
                Open.browserOn().the(n11SellerOfficeHomePage.class));
    }
}