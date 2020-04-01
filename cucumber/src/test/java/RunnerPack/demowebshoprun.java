package RunnerPack;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\SRINADH\\Documents\\cucumber\\features\\demowebshop.feature",
glue= {"cucumber.cucumber"})

public class demowebshoprun {
	

}
