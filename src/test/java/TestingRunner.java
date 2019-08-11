import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingRunner {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();

        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(Arrays.asList("src/test/resources/testing.xml"));

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);

        testNG.setXmlSuites(suites);
        testNG.run();
    }
}
