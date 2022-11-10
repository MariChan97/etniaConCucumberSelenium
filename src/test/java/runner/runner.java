package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Ger",
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "steps"
)

public class runner {
    @AfterClass
    public static void cleanBrowser(){
        BasePage.closeBrowser();
    }
}
