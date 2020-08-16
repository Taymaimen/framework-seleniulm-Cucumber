package com.orange.e2eTests;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/spec/features"},
		//glue={""},
		plugin= {"pretty","html:target/cucumber-html-report"},
		snippets = SnippetType.CAMELCASE,
		tags= {("@connexion")},
		monochrome = true
		)

public class TestRunner {


}