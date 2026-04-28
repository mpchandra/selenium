package runner;

import io.cucumber.testng.*;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features",
glue={"stepdefs","hooks"})
public class TestRunner extends AbstractTestNGCucumberTests{}