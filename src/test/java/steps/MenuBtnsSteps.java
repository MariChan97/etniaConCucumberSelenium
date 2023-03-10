package steps;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.MenuBtnsPage;

public class MenuBtnsSteps {

    MenuBtnsPage menuBtnsPage = new MenuBtnsPage(); 
        @Given("I navigate to {string}")
         public void iNavigateTo(String url) {
         menuBtnsPage.navigateToEtniaDigital(url);
        }     
      
       @And("click on button{string}")
        public void clickButton(String menuOption) {
        menuBtnsPage.clickOnMenuOption();
    }

       @Then("I assert that the page goes to the proper section{string}")
        public void IassertThePageGoesToProperSection(String span) {
        String Span = menuBtnsPage.spanSobreNosIspresent();
        Assert.assertEquals("Sobre Nosotros", Span);
    }
   

} 



