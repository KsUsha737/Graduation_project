package Ui.constants.enums.newAccountPage;

/**
 * enum dropdown field names "CustomerPriority" on NewAccountPage
 */
public enum NewAccountPageCustomerPriorityEnum implements NewAccountPageDropdownEnumInterface{
    NONE("--None--"),
    HIGH("High"),
    LOW("Low"),
    MEDIUM("Medium");

    private String text;

    NewAccountPageCustomerPriorityEnum(String text){
        this.text=text;
    }

    @Override
    public String toString() {
        return text;
    }

}
