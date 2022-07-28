package Ui.conctants.enums.newLeadePage;

/**
 * enum наименований полей дропдауна "ProductInterest" на NewAccountPage
 */
public enum NewLeadPageProductInterestEnum implements NewLeadPageDropdownEnumInterface{
    NONE("--None--"),
    GC1000("GC1000 series"),
    GC5000("GC5000 series"),
    GC3000("GC3000 series");

    private String text;

    NewLeadPageProductInterestEnum(String text){
        this.text=text;
    }

    @Override
    public String toString(){
        return text;
    }
}
