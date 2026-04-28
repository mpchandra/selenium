package hooks;

import core.DriverFactory;
import io.cucumber.java.*;

public class Hooks {

@Before
public void setUp(){
DriverFactory.init();
DriverFactory.get().get("http://leaftaps.com/opentaps/control/main");
}

@After
public void tearDown(){
DriverFactory.quit();
}
}