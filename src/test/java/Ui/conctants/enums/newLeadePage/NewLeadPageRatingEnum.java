package Ui.conctants.enums.newLeadePage;

/**
 * enum наименований полей дропдауна "Rating" на NewAccountPage
 */
public enum NewLeadPageRatingEnum implements NewLeadPageDropdownEnumInterface{
    NONE("--None--"),
    HOT("Hot"),
    WARM("Warm"),
    COLD("Cold");

    private String text;

    NewLeadPageRatingEnum(String text) {
        this.text=text;
    }

    @Override
    public String toString() {
        return text;
    }

}
