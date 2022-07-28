package Ui.conctants.enums.newAccountPage;

/**
 * enum наименований полей дропдауна "Sla" на NewAccountPage
 */
public enum NewAccountPageSlaEnum implements NewAccountPageDropdownEnumInterface{
    NONE("--None--"),
    GOLD("Gold"),
    Silver("Silver") ,
    PLATINUM("Platinum"),
    BRONZE("Bronze");

   private String text;
    NewAccountPageSlaEnum(String text){
        this.text=text;

    }
    @Override
    public String toString() {
        return text;
    }

}
