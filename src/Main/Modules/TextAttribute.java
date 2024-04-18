package Main.Modules;

import javax.persistence.Entity;

@Entity
public class TextAttribute extends Attribute {
    private boolean large;
    private String placeholder;

    public TextAttribute(String name, boolean large, String placeholder){
        this.name = name;
        this.large = large;
        this.placeholder = placeholder;
    }

    public TextAttribute() {

    }

    public String getPlaceholder() {
        return placeholder;
    }

    public boolean getlarge() {
        return large;
    }

    public void setPlaceholder(String placeholder) {
        //TODO Validation
        this.placeholder = placeholder;
    }

    public void setlarge( boolean large) {
        //TODO Validation
        this.large = large;
    }
}
