package utils;

public enum PropertiesKeys {

    LOGIN("salesforce.api.login"),
    PASSWORD("salesforce.api.password"),
    CONFIGURATION_BASE_URL("Configuration.baseurl"),
    CONFIGURATION_BROWSER("Configuration.browser"),
    CONFIGURATION_HEADLESS("Configuration.headless"),
    CONFIGURATION_BROWSER_SIZE ("Configuration.browserSize"),
    CONFIGURATION_TIMEOUT ("Configuration.timeout"),
    CONFIGURATION_SCREENSHOTS ("Configuration.screenshots");

    String key;
    private PropertiesKeys(String key){
        this.key=key;
    }

    public String getKey() {
        return key;
    }
}
