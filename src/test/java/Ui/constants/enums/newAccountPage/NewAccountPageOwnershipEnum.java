package Ui.constants.enums.newAccountPage;

/**
 * enum names of dropdown fields "Ownership" on NewAccountPage
 */
public enum NewAccountPageOwnershipEnum implements NewAccountPageDropdownEnumInterface {

    NONE("--None--"),
    PUBLIC("Public"),
    PRIVATE("Private"),
    SUBSIDIARY("Subsidiary"),
    OTHER("Other");

    private final String text;

    NewAccountPageOwnershipEnum(String text) {
        this.text=text;
    }

    @Override
    public String toString() {
        return text;
    }
}
