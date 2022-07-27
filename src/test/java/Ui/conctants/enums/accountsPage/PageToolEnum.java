package Ui.conctants.enums.accountsPage;

/**
 * enum для выбора действия на AccountsPage
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
