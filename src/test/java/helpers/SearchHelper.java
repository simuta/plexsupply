package helpers;

import pages.MainPage;

import static com.codeborne.selenide.Selenide.$;

public class SearchHelper {
    public static void feelAndClick(String item) {
        $(MainPage.searchFieldBy).setValue(item);
        $(MainPage.searchButtondBy).click();
    }
}
