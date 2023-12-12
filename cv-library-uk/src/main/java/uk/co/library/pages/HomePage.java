package uk.co.library.pages;


import org.openqa.selenium.By;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    By jobTitleField = By.id("keywords");
    By locationField = By.id("location");
    By distanceDropDownField = By.xpath("//div[@class='hps-distance hps-transition']/select");
    By moreSearchOptionsLink =By.xpath("//button[@id='toggle-hp-search']");
    By salaryMin = By.xpath("//div[@class='hps-sal-min']/input");
    By salaryMax = By.xpath("//input[@id=\"salarymax\"]");
    By salaryTypeDropDown = By.xpath("//select[@id=\"salarytype\"]");
    By jobTypeDropDown = By.xpath("//select[@id=\"tempperm\"]");
    By findJobsBtn = By.xpath("//input[@id=\"hp-search-btn\"]");


// public void acceptCookies(){
// switchToIframe(By .ById"//button[@id=\"save\"]");
// }

    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitleField,jobTitle);
    }
    public void enterLocation(String location) {
        sendTextToElement(locationField,location);
    }
    public void selectDistance(String distance) {
        sendTextToElement(distanceDropDownField,distance);
}
    public void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearchOptionsLink);
    }
    public void enterMinSalary(String minSalary){
        sendTextToElement(salaryMin,minSalary);

}
    public void enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMax,maxSalary);
}
    public void selectSalaryType(String salaryType){
        sendTextToElement(salaryTypeDropDown,salaryType);
    }
    public void selectJobType(String jobType){
        sendTextToElement(jobTypeDropDown,jobType);
    }
    public void clickOnFindJobsButton(){
     clickOnElement(findJobsBtn);
    }
}
