package Ui.conctants.enums.newContactPageInAccountpage;
/**
 * enum names of dropdown fields "Salutation"
 */
public enum SalutationEnum implements PageDropDownEnumInterface {

    NONE("--None--"),
    MR("Mr."),
    MS("Ms."),
    MRS("Mrs."),
    DR("Dr."),
    PROF("Prof.");

    private String text;

    private SalutationEnum (String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    @Override
    public String toString() {
        return text;
    }
}
