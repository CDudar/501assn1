package assignment1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ URLUtilityTester.class, SuccessfulDownloadTester.class})
public class TestAll {

}