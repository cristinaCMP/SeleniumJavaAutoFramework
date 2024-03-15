package base;

import org.junit.After;
import org.junit.Before;
import propertiesFile.PropertiesUtility;

import java.util.HashMap;

public class Hooks extends  BaseTest {

    public HashMap<String, String> testData;
    @Before
    public void prepareEnvironment(){
        setup();
        String className = this.getClass().getSimpleName();
        PropertiesUtility propertiesUtility = new PropertiesUtility(className);
       testData =  propertiesUtility.getAllKeyValues();
    }

    @After
    public void clearEnvironment(){
        driver.quit();
    }
}
