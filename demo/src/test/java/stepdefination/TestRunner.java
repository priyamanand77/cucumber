package stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"D:\\SpringBoot-workspace\\demo\\features"},
glue = {"stepdefination"})
public class TestRunner {

}
