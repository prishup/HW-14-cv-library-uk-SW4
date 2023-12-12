package uk.co.library.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {
    HomePage homepage = new HomePage();
    ResultPage resultPage = new ResultPage();
    @Test
    public void verifyJobSearchResultUsingDifferentDataSet() {

//        enter job title 'jobTitle'
        homepage.enterJobTitle("Tester");

//        enter Location 'location'
        homepage.enterLocation("Brent");

//        select distance 'distance'
        homepage.selectDistance("up to 5 miles");

//        click on moreSearchOptionsLink
        homepage.clickOnMoreSearchOptionLink();

//        enter salaryMin 'salaryMin'
        homepage.enterMinSalary("40000");

//        enter salaryMax 'salaryMax'
        homepage.enterMaxSalary("50000");

//        select salaryType 'salaryType'
        homepage.selectSalaryType("Per annum");

//        select jobType 'jobType'
        homepage.selectJobType("Permanent");

//        click on 'Find Jobs' button
        homepage.clickOnFindJobsButton();

//        verify the result 'result'
        String actual = resultPage.verifyTheResults();
        System.out.println(actual);
        String expected = "Permanent Tester jobs in Brent\n" +
                "Displaying 1-25 of 38 jobs";
        Assert.assertEquals(actual, expected);
//    }
    }
}
