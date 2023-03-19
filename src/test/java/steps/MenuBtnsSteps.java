package steps;
import io.cucumber.java.en.*;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import pages.MenuBtnsPage;

public class MenuBtnsSteps {

    MenuBtnsPage menuBtnsPage = new MenuBtnsPage(); 
        @Given("^I navigating on (.*) {string}$")
         public void iNavigateTo(String url) {
         menuBtnsPage.navigateToEtniaDigital(url);
        }     
      
       @And("^click on button(.*){string}$")
       public void iClickOnMainMenuOption(String mainMenuOption){
        menuBtnsPage.iClickOnMenuOption(mainMenuOption);
       }
          
       @Then("^I assert that the page goes to the proper section(.*){string}$")
        public void IassertThePageGoesToProperSpan(String span) {
        String Span = menuBtnsPage.spanSobreNosotros(span);
        Assert.assertEquals("Sobre Nosotros", Span);

        String Span1 = menuBtnsPage.spanAlgunosDe(span);
        Assert.assertEquals("Algunos De", Span1);

        String Span2 = menuBtnsPage.spanDeServicios(span);
        Assert.assertEquals("Algunos De", Span2);

        String Span3 = menuBtnsPage.spanConectaConNuestra(span);
        Assert.assertEquals("Conecta con nuestra comunidad", Span3);
    }
   
}




