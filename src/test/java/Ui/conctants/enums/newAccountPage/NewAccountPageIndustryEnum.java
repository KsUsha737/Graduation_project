package Ui.conctants.enums.newAccountPage;

/**
 * enum наименований полей дропдауна "Industry" на NewAccountPage
 */
public enum NewAccountPageIndustryEnum implements NewAccountPageDropdownEnumInterface{
    None("--None--"),
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

    NewAccountPageIndustryEnum(String text) {
        this.text=text;
    }

    @Override
    public String toString() {
        return text;
    }
}
