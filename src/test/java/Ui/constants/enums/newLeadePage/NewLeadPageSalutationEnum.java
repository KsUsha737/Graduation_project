package Ui.constants.enums.newLeadePage;

/**
 * enum names of dropdown fields "Salutation"
 */
public enum NewLeadPageSalutationEnum implements NewLeadPageDropdownEnumInterface {
    None("--None--"),
    MR("Mr."),
    MS("Ms."),
    MRS("Mrs."),
    DR("Dr."),
    PROF("Prof.");

    private String text;

    NewLeadPageSalutationEnum(String text){
                this.text=text;
    }

    @Override
    public String toString(){
        return text;
    }
}
