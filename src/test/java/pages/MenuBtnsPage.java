package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuBtnsPage extends BasePage{

    public MenuBtnsPage() {
        super(driver);
        
    }
    /*private String homeButton = "//div[@class='menu']/ul/li[1]";
    private String nosotrosButton = "//div[@class='menu']/ul/li[2]";
    private String portfolioButton = "//div[@class='menu']/ul/li[3]";
    private String contactoButton = "//div[@class='menu']/ul/li[5]";
    private String serviciosButton = "//div[@class='menu']/ul/li[4]";*/
    private String mainMenu = "anchor_nav";
    
    private String spanSobreNosotros = "//div[@class='center']/div/span[@class='small']";
    private String spanAlgunosDe = "//*[@id='portfolio']/div/div/div[1]/span";
    private String spanServicios = "//*[@id='service']/div/div/div/ul/li[1]/div/div/h3[1]";
    private String spanConectaComunidad = "//*[@id='contact']/div/div/div[1]/h3";

    public void navigateToEtniaDigital(String url) {
        navigateTo("https://" + url);
    }
      public WebElement iClickOnMenuOption(String mainMenuOption) {
        List<WebElement> menuOption = bringMeAllElements(mainMenu); 
        List<WebElement> btnFromMenu = new ArrayList<WebElement>();
        for (WebElement e : menuOption) {
            btnFromMenu.add(e);
        }
        WebElement nosotrosButton = btnFromMenu.get(1);
        WebElement portfolioButton = btnFromMenu.get(2);
        WebElement servicioButton = btnFromMenu.get(3);
        WebElement contactoButton = btnFromMenu.get(4);
        return null;
    }
    

      /*public void clickOnNosOption(String mainMenuOption){
        //textFromElement(nosotrosButton);
        clickElement(nosotrosButton);
    } */

     public String spanSobreNosotros(String span){
      return textFromElement(spanSobreNosotros);
    }

    /* public void clickOnPortfolioOption(String mainMenuOption){
        clickElement(portfolioButton);
     }*/
     public String spanAlgunosDe(String span){
        return textFromElement(spanAlgunosDe);
      }
    /* public void clickOnServiciosButton(String mainMenuOption){
        clickElement(serviciosButton);
    }*/
    public String spanDeServicios(String span){
        return textFromElement(spanServicios);
    }
     /*public void clickOnContactoButton(String mainMenuOption){
        clickElement(contactoButton);
    }*/
    public String spanConectaConNuestra(String span){
        return textFromElement(spanConectaComunidad);
    }

}