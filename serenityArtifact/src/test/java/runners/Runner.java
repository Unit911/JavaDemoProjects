package runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Created by demch on 4/23/2018.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"stepDefinition"})
public class Runner {
}
