package Ui.constants.enums.newContactPageInAccountpage;
/**
 * enum to select action
 */
public enum PageToolEnum {

    NEW("New"),
    ADD_TO_CAMPAIGN("Add to Campaign");

    private final String text;

    PageToolEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}


