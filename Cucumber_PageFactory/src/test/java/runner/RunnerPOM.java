package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\mS\\Documents\\Mona_QA_Programs_Eclipse"
		+ "\\Cucumber_PageFactory\\src\\test\\resources\\resources\\Features\\Login_Pom.feature",
		glue = {"stepDefinitions"},
		monochrome = true
		)
public class RunnerPOM {

}
