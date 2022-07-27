package Ui.conctants.enums.newAccountPage;

/**
 * enum наименований полей дропдауна "Rating" на NewAccountPage
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
