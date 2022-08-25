package Ui.constants.enums.newLeadePage;

/**
 * enum names of dropdown fields "Rating"
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
