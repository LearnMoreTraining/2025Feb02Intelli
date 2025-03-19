package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.junit.Test;
import utilils.TestContext;

import java.io.IOException;

public class Hooks {
        TestContext context;
    public Hooks(TestContext context){
        this.context = context ;
    }
    @Before
    public void precondition(){
        System.out.println("execution statred");
    }


    @After
    public void postCondition()  {
       context.browser.browserBase().close();
        System.out.println("execution stop");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("after step");
    }

    @BeforeStep
    public void beforeStep(){
        System.out.println("before step");
    }

}
