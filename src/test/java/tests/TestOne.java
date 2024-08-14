package tests;

import helpers.ConfProperties;
import helpers.SearchHelper;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.SearchResultPage;

import static com.codeborne.selenide.Selenide.*;

public class TestOne extends BaseTest {

    @DataProvider(name = "searchContent")
    public Object[][] dataThree() {
        return new Object[][]{{"mug"}};
    }

    @Test(dataProvider = "searchContent")
    public void checkSearch(String item) {
        open(ConfProperties.getProperty("url"));

        SearchHelper.feelAndClick(item);

        Assert.assertEquals($(SearchResultPage.elementBy).innerText(), "Search results for: '" + item + "'");
    }
}
