package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/Feature/Dominos.feature"},
        dryRun = !true,
        glue= {"org.Stepdef","org.Hook"},
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        plugin = {"pretty","html:reports/myreport.html","json:reports/myreports.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
	    publish = true
	         )

public class Run_Dominos {

}
