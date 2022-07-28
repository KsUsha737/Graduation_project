package Ui.conctants.enums.newLeadePage;

/**
 * enum наименований полей дропдауна "Primary" на NewAccountPage
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
