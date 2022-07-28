package Ui.conctants.enums.newLeadePage;

/**
 * enum наименований полей дропдауна "Salutation" на NewAccountPage
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
