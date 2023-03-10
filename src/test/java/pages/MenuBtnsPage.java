package pages;

import org.openqa.selenium.WebDriver;

public class MenuBtnsPage extends BasePage{

    public MenuBtnsPage() {
        super(driver);
        
    }
    private String homeButton = "//div[@class='menu']/ul/li[1]";
    private String nosotrosButton = "//div[@class='menu']/ul/li[2]";
    private String portfolioButton = "//div[@class='menu']/ul/li[3]";
    private String serviciosButton = "//div[@class='menu']/ul/li[4]";
    private String contactoButton = "//div[@class='menu']/ul/li[5]";
    private String spanSobreNosotros = "//div[@class='center']/div/span[@class='small']";
    private String spanAlgunosDe = "//*[@id='portfolio']/div/div/div[1]/span";
    private String spanServicios = "//*[@id='service']/div/div/div/ul/li[1]/div/div/h3[1]";
    private String spanConectaComunidad = "//*[@id='contact']/div/div/div[1]/h3";

    public void navigateToEtniaDigital(String url) {
        navigateTo("https://" + url);
    }

    public void clickOnMenuOption(){
       clickElement(nosotrosButton);
    }

    public String spanSobreNosIspresent(){
      return textFromElement(spanSobreNosotros);
    }

    public void clickOnPortfolioOption(){
        clickElement(portfolioButton);
    }
    public String spanAlgunosDe(){
        return textFromElement(spanAlgunosDe);
      }
    public void clickOnServiciosButton(){
        clickElement(serviciosButton);
    }
    public String spanDeServicios(){
        return textFromElement(spanServicios);
    }
    public void clickOnContactoButton(){
        clickElement(contactoButton);
    }
    public String spanConectaConNuestra(){
        return textFromElement(spanConectaComunidad);
    }
}
