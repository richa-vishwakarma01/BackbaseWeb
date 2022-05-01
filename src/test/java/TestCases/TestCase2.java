package TestCases;

import CustomeReports.CustomeReporter;
import Executor.BaseTest;
import PageActions.HomePage.HomePageActions;
import org.testng.annotations.Test;

public class TestCase2 extends BaseTest {


    @Test

    public void ValidateTag(){
        HomePageActions.getInstance(driver).validatePopularTags("PopularTag");
    }



}
