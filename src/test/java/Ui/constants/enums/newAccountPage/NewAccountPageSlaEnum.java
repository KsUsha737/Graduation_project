package Ui.constants.enums.newAccountPage;

/**
 * enum names of dropdown fields "Sla" on NewAccountPage
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
