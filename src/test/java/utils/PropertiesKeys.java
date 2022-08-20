package utils;

public enum PropertiesKeys {

    LOGIN("salesforce.ui.login"),
    PASSWORD("salesforce.ui.password"),
    CONFIGURATION_BASE_URL("Configuration.baseurl"),
    CONFIGURATION_BROWSER("Configuration.browser"),
    CONFIGURATION_HEADLESS("Configuration.headless"),
    CONFIGURATION_BROWSER_SIZE ("Configuration.browserSize"),
    CONFIGURATION_TIMEOUT ("Configuration.timeout"),
    CONFIGURATION_SCREENSHOTS ("Configuration.screenshots"),
    API_USERNAME("salesforce.api.login"),
    API_PASSWORD("salesforce.api.password"),
    API_CLIENT_ID("salesforce.api.client.id"),
    API_CLIENT_SECRET("salesforce.api.client.secret"),
    API_TOKEN_URL("salesforce.api.token.url"),
    API_SOBJ_URL_LEAD("salesforce.api.sobj.url.lead");

    String key;
    private PropertiesKeys(String key){
        this.key=key;
    }

    public String getKey() {
        return key;
    }
}
