package utils;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Browsers.*;

public abstract class SelenideConfiguration {

    public static void Configure() {
        Configuration.baseUrl = PropertyReader.getProperty(PropertiesKeys.CONFIGURATION_BASE_URL);
        switch (PropertyReader.getProperty(PropertiesKeys.CONFIGURATION_BROWSER)) {
            case "safari":
                Configuration.browser = SAFARI;
                break;
            case "firefox":
                Configuration.browser = FIREFOX;
                break;
            default:
                Configuration.browser = CHROME;
                break;
        }
        Configuration.headless = Boolean.parseBoolean(PropertyReader.getProperty(PropertiesKeys.CONFIGURATION_HEADLESS));
        Configuration.browserSize = PropertyReader.getProperty(PropertiesKeys.CONFIGURATION_BROWSER_SIZE);
        Configuration.timeout= Integer.parseInt(PropertyReader.getProperty(PropertiesKeys.CONFIGURATION_TIMEOUT));
        Configuration.screenshots=Boolean.parseBoolean(PropertyReader.getProperty(PropertiesKeys.CONFIGURATION_SCREENSHOTS));

    }
}
