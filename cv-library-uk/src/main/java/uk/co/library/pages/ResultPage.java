package uk.co.library.pages;

import org.openqa.selenium.By;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    By resultText = By.xpath("//div[@class=\"page-main\"]/div[1]/div[1]");
    public String verifyTheResults() {
        return getTextFromElement(resultText);

    }

}
