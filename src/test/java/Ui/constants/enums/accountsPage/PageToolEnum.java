package Ui.constants.enums.accountsPage;

/**
 * enum to select action on AccountsPage
 */
public enum PageToolEnum {

    NEW("New"),
    IMPORT("Import");

    private final String text;

    PageToolEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
