package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(


        tags = "@current",
        features = "src/test/resources/features", // path to the feature files folder
        glue = "stepDefs" // path to step definition classes (glue code, implementation code)
//       , dryRun = true    // skips the actual run of the scenarios, we enable this to generate implementation snippets quickly
        ,stepNotifications = true  // will enable detailed step reports
        ,plugin = {"summary",  // generates  a detailed report after each run and also generates snippets for unimplemented steps
        "pretty",  // adds more details to a console output
        "html:target/html-report.html", // generates cucumber's built in html report in indicated path
        "json:target/Cucumber.json",     // generate json report in target folder
        "rerun:target/failed-scenarios.txt"
        }

//
)
public class CukeRunner {


}
