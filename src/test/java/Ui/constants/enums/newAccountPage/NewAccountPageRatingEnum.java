package Ui.constants.enums.newAccountPage;

/**
 * enum names of dropdown fields "Rating" on NewAccountPage
 */
public enum NewAccountPageRatingEnum implements NewAccountPageDropdownEnumInterface {
       NONE("--None--"),
    HOT("Hot"),
    WARM("Warm"),
    COLD("Cold");

    private String text;

    NewAccountPageRatingEnum(String text) {
        this.text=text;
    }

    @Override
    public String toString() {
        return text;
    }
}
