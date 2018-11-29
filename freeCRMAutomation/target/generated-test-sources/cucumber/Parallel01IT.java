import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/MyW10_Stuff/MyJavaWork/freeCRMAutomation/src/test/java/features/CreatContacts.feature"},
        plugin = {"json:C:/MyW10_Stuff/MyJavaWork/freeCRMAutomation/target/cucumber-parallel/1.json", "html:C:/MyW10_Stuff/MyJavaWork/freeCRMAutomation/target/cucumber-parallel/1"},
        monochrome = false,
        tags = {},
        glue = {"steps"})
public class Parallel01IT {
}
