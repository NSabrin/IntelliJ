package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {


    @Before
    public void beforeMethod(Scenario sce){

        System.out.println("Welcome");
        System.out.println(sce.getId());
        System.out.println(sce.getSourceTagNames());


    }

    @After
    public void afterMethod(Scenario sce){
        System.out.println("Goodbye");
    }
}
