package Ui.conctants.enums.newAccountPage;

/**
 * enum наименований полей дропдауна "Type" на NewAccountPage
 */
public enum NewAccountPageTypeEnum implements NewAccountPageDropdownEnumInterface {
    NONE("--None--"),
    PROSPECT("Prospect"),
    CUSTOMER_DIRECT("Customer - Direct"),
    COLD("Cold"),
    CUSTOMER_CHANNEL("Customer - Channel"),
    CHANNEL_PARENT_RESELLER("Channel Partner / Reseller"),
    INSTALLATION_PARTNER("Installation Partner"),
    TECHNOLOGY_PARTNER("Technology Partner"),
    OTHER("Other");

    private String text;

    NewAccountPageTypeEnum(String text) {
        this.text=text;
    }

    @Override
    public String toString() {
        return text;
    }
}
