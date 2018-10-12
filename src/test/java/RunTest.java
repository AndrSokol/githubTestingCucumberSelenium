import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {"@1"},
        plugin = {"pretty", "html:target/cucumber"},
        features = {"src/test/resources/features/"}
)
public class RunTest {

}
