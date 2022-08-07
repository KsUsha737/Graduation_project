package Ui.conctants.enums.newAccountPage;

/**
 * enum dropdown field names "Active" on NewAccountPage
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
