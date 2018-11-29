import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/MyW10_Stuff/MyJavaWork/freeCRMAutomation/src/test/java/features/Login.feature"},
        plugin = {"json:C:/MyW10_Stuff/MyJavaWork/freeCRMAutomation/target/cucumber-parallel/3.json", "html:C:/MyW10_Stuff/MyJavaWork/freeCRMAutomation/target/cucumber-parallel/3"},
        monochrome = false,
        tags = {},
        glue = {"steps"})
public class Parallel03IT {
}
