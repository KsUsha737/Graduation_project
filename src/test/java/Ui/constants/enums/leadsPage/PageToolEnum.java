package Ui.constants.enums.leadsPage;

/**
 * enum to select an action on LeadsPage
 */
public enum PageToolEnum {
    NEW("New"),
    IMPORT("Import"),
    ADD_TO_CAMPAIGN("Add to Campaign"),
    CHANGE_STATUS("Change Status"),
    CHANGE_OWNER("Change Owner");

    private final String text;

    PageToolEnum(String text){
        this.text=text;
    }

    public String getText() {
        return text;
    }

}
