package Ui.conctants.enums.newContactPageInAccountpage;
/**
 * enum names of dropdown fields "Level"
 */
public enum LevelEnum implements PageDropDownEnumInterface{

    NONE("--None--"),
    SECONDARY("Secondary"),
    TERTIARY("Tertiary"),
    PRIMARY("Primary");

    private String text;

   LevelEnum (String text){
        this.text=text;
    }

    @Override
    public String toString() {
        return text;
    }
}
