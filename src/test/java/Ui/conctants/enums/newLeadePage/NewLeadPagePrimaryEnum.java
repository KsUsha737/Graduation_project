package Ui.conctants.enums.newLeadePage;

/**
 * enum names of dropdown fields "Primary"
 */
public enum NewLeadPagePrimaryEnum implements NewLeadPageDropdownEnumInterface{
    NONE("--None--"),
    NO("No"),
    YES("Yes");

    private String text;

    NewLeadPagePrimaryEnum(String text){
        this.text=text;
    }

    @Override
    public String toString() {
        return text;
    }
}
