package demo;

import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import data.accessability.AccessabilityItemsData;
import data.accessability.AccessabilityTextViewData;
import extensions.AppiumExtension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.openqa.selenium.By;
import pages.MainPage;
import pages.accessability.AccessabilityNodeProviderPage;
import providers.SelenideWebDriver;

@ExtendWith(AppiumExtension.class)
public class Demo_Test {

  private MainPage mainPage = new MainPage();
  private AccessabilityNodeProviderPage accessabilityNodeProviderPage = new AccessabilityNodeProviderPage();

  @Test
  public void firstTest() {
    mainPage.open()
        .clickMenuItem(AccessabilityItemsData.NODE_PROVIDER);

    accessabilityNodeProviderPage
        .checkViewText(AccessabilityTextViewData.NODE_PROVIDER)
        .checkColorView();
  }
}
