package Ui.conctants.enums.newAccountPage;

/**
 * enum наименований полей дропдауна "Active" на NewAccountPage
 */
public enum NewAccountPageActiveEnum implements NewAccountPageDropdownEnumInterface{
    NONE("--None--"),
    NO("No"),
    YES("Yes");

    String text;

    NewAccountPageActiveEnum(String text){
        this.text=text;
    }

    @Override
    public String toString() {
        return text;
    }
}
