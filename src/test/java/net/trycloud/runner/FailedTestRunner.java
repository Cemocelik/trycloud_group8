package net.trycloud.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "net/trycloud/step_def"
)
public class FailedTestRunner {
}

// This runner class will be running only failed scenarios