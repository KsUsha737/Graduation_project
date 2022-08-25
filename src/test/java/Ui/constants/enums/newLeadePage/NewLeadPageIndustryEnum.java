package Ui.constants.enums.newLeadePage;

/**
 * enum names of dropdown fields "LeadSource"
 */
public enum NewLeadPageIndustryEnum implements NewLeadPageDropdownEnumInterface{
    NONE("--None--"),
    AGRICULTURE("Agriculture"),
    APPAREL("Apparel"),
    BANKING("Banking"),
    BIOTECHNOLOGY("Biotechnology"),
    CHEMICALS("Chemicals"),
    COMMUNICATIONS("Communications"),
    CONSTRUCTION("Construction"),
    CONSULTING("Consulting"),
    EDUCATION("Education"),
    ELECTRONICS("Electronics"),
    ENERGY("Energy"),
    ENGINEERING("Engineering"),
    ENTERTAINMENT("Entertainment"),
    ENVIRONMENTAL("Environmental"),
    FINANCE("Finance"),
    FOOD_BEVERAGE("Food & Beverage"),
    GOVERNMENT("Government"),
    HEALTHCARE("Healthcare"),
    HOSPITALITY("Hospitality"),
    INSURANCE("Insurance"),
    MACHINERY("Machinery"),
    MANUFACTURING("Manufacturing");

    private String text;

    NewLeadPageIndustryEnum(String text){
        this.text=text;

    }
    @Override
    public String toString(){
        return text;
    }
}
