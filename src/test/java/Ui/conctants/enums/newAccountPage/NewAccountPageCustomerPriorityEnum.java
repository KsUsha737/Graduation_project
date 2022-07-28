package Ui.conctants.enums.newAccountPage;

/**
 * enum наименований полей дропдауна "CustomerPriority" на NewAccountPage
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
