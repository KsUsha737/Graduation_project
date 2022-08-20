package Ui.constants.enums;

/**
 * enum applications of "Apps"
 * contains software packages for work in areas
 */

public enum AppsEnum {
    SERVICE("Service"),
    MARKETING("Marketing"),
    COMMUNITY("Community"),
    SALESFORCE_CHATTER("Salesforce Chatter"),
    CONTENT("Content"),
    SALES_CONSOLE ("Sales Console"),
    SERVICE_CONSOLE ("Service Console"),
    SALES ("Sales"),
    LIGHTNING_USAGE_APP ("Lightning Usage App"),
    DIGITAL_EXPERIENCES ("Digital Experiences"),
    SALESFORCE_SCHEDULER_SETUP ("Salesforce Scheduler Setup"),
    BOLT_SOLUTIONS ("Bolt Solutions");

    private final String title;

    AppsEnum(String title){
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

}
