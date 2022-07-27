package Ui.conctants.enums.newAccountPage;

/**
 * enum наименований полей дропдауна "Upsell Opportunity" на NewAccountPage
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
