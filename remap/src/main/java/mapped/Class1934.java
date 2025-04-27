// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class1934 implements Comparable<Class1934>
{
    private final String field10545;
    private final String field10546;
    private final long field10547;
    private final long field10548;
    private final boolean field10549;
    private final Class101 field10550;
    private final boolean field10551;
    private final boolean field10552;
    private final String field10553;
    private final int field10554;
    private final boolean field10555;
    private final Class9505 field10556;
    
    public Class1934(final WorldInfo class8660, final String field10545, final String field10546, final long field10547, final boolean field10548) {
        this.field10545 = field10545;
        this.field10546 = field10546;
        this.field10547 = class8660.method29553();
        this.field10548 = field10547;
        this.field10550 = class8660.method29564();
        this.field10549 = field10548;
        this.field10551 = class8660.method29568();
        this.field10552 = class8660.method29574();
        this.field10553 = class8660.method29607();
        this.field10554 = class8660.method29605();
        this.field10555 = class8660.method29606();
        this.field10556 = class8660.method29570();
    }
    
    public String method7808() {
        return this.field10545;
    }
    
    public String method7809() {
        return this.field10546;
    }
    
    public long method7810() {
        return this.field10548;
    }
    
    public boolean method7811() {
        return this.field10549;
    }
    
    public long method7812() {
        return this.field10547;
    }
    
    @Override
    public int compareTo(final Class1934 class1934) {
        if (this.field10547 >= class1934.field10547) {
            return (this.field10547 <= class1934.field10547) ? this.field10545.compareTo(class1934.field10545) : -1;
        }
        return 1;
    }
    
    public Class101 method7813() {
        return this.field10550;
    }
    
    public boolean method7814() {
        return this.field10551;
    }
    
    public boolean method7815() {
        return this.field10552;
    }
    
    public ITextComponent method7816() {
        return Class8272.method27500(this.field10553) ? new Class2259("selectWorld.versionUnknown") : new StringTextComponent(this.field10553);
    }
    
    public boolean method7817() {
        if (!this.method7818()) {
            if (Class9528.method35579().isStable() || this.field10555) {
                if (!this.method7820()) {
                    return this.method7819();
                }
            }
        }
        return true;
    }
    
    public boolean method7818() {
        return this.field10554 > Class9528.method35579().getWorldVersion();
    }
    
    public boolean method7819() {
        return this.field10556 == Class9505.field40896 && this.field10554 < 1466;
    }
    
    public boolean method7820() {
        return this.field10554 < Class9528.method35579().getWorldVersion();
    }
}
