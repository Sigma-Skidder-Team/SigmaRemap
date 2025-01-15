// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class9575
{
    public String field41612;
    public String field41613;
    public String field41614;
    public String field41615;
    public long field41616;
    public int field41617;
    public String field41618;
    public boolean field41619;
    public String field41620;
    private Class2203 field41621;
    private String field41622;
    private boolean field41623;
    
    public Class9575(final String field41612, final String field41613, final boolean field41614) {
        this.field41617 = Class9528.method35579().getProtocolVersion();
        this.field41618 = Class9528.method35579().getName();
        this.field41621 = Class2203.field13414;
        this.field41612 = field41612;
        this.field41613 = field41613;
        this.field41623 = field41614;
    }
    
    public Class51 method35865() {
        final Class51 class51 = new Class51();
        class51.method306("name", this.field41612);
        class51.method306("ip", this.field41613);
        if (this.field41622 != null) {
            class51.method306("icon", this.field41622);
        }
        if (this.field41621 != Class2203.field13412) {
            if (this.field41621 == Class2203.field13413) {
                class51.method312("acceptTextures", false);
            }
        }
        else {
            class51.method312("acceptTextures", true);
        }
        return class51;
    }
    
    public Class2203 method35866() {
        return this.field41621;
    }
    
    public void method35867(final Class2203 field41621) {
        this.field41621 = field41621;
    }
    
    public static Class9575 method35868(final Class51 class51) {
        final Class9575 class52 = new Class9575(class51.method323("name"), class51.method323("ip"), false);
        if (class51.method316("icon", 8)) {
            class52.method35870(class51.method323("icon"));
        }
        if (!class51.method316("acceptTextures", 1)) {
            class52.method35867(Class2203.field13414);
        }
        else if (!class51.method329("acceptTextures")) {
            class52.method35867(Class2203.field13413);
        }
        else {
            class52.method35867(Class2203.field13412);
        }
        return class52;
    }
    
    @Nullable
    public String method35869() {
        return this.field41622;
    }
    
    public void method35870(final String field41622) {
        this.field41622 = field41622;
    }
    
    public boolean method35871() {
        return this.field41623;
    }
    
    public void method35872(final Class9575 class9575) {
        this.field41613 = class9575.field41613;
        this.field41612 = class9575.field41612;
        this.method35867(class9575.method35866());
        this.field41622 = class9575.field41622;
        this.field41623 = class9575.field41623;
    }
}
