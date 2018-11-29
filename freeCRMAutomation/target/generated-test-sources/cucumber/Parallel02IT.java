import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/MyW10_Stuff/MyJavaWork/freeCRMAutomation/src/test/java/features/Deals.feature"},
        plugin = {"json:C:/MyW10_Stuff/MyJavaWork/freeCRMAutomation/target/cucumber-parallel/2.json", "html:C:/MyW10_Stuff/MyJavaWork/freeCRMAutomation/target/cucumber-parallel/2"},
        monochrome = false,
        tags = {},
        glue = {"steps"})
public class Parallel02IT {
}
