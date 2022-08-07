package Ui.conctants.enums.newAccountPage;

/**
 * enum names of dropdown fields "Upsell Opportunity" on NewAccountPage
 */
public enum NewAccountPageUpsellOpportunityEnum implements NewAccountPageDropdownEnumInterface{
    NONE("--None--"),
    MAYBE("Maybe"),
    NO("No"),
    YES("Yes");

    private String text;

    NewAccountPageUpsellOpportunityEnum(String text){
        this.text=text;
    }

    @Override
    public String toString() {
        return text;
    }
}
