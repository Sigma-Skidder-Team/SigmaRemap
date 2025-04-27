// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public enum Class101
{
    field297(-1, ""), 
    field298(0, "survival"), 
    field299(1, "creative"), 
    field300(2, "adventure"), 
    field301(3, "spectator");
    
    private final int field302;
    private final String field303;
    
    Class101(final int field302, final String field303) {
        this.field302 = field302;
        this.field303 = field303;
    }
    
    public int method585() {
        return this.field302;
    }
    
    public String method586() {
        return this.field303;
    }
    
    public ITextComponent method587() {
        return new Class2259("gameMode." + this.field303);
    }
    
    public void method588(final Class6999 class6999) {
        if (this != Class101.field299) {
            if (this != Class101.field301) {
                class6999.field27303 = false;
                class6999.field27304 = false;
                class6999.field27301 = false;
                class6999.field27302 = false;
            }
            else {
                class6999.field27303 = true;
                class6999.field27304 = false;
                class6999.field27301 = true;
                class6999.field27302 = true;
            }
        }
        else {
            class6999.field27303 = true;
            class6999.field27304 = true;
            class6999.field27301 = true;
        }
        class6999.field27305 = !this.method589();
    }
    
    public boolean method589() {
        return this == Class101.field300 || this == Class101.field301;
    }
    
    public boolean method590() {
        return this == Class101.field299;
    }
    
    public boolean method591() {
        return this == Class101.field298 || this == Class101.field300;
    }
    
    public static Class101 method592(final int n) {
        return method593(n, Class101.field298);
    }
    
    public static Class101 method593(final int n, final Class101 class101) {
        for (final Class101 class102 : values()) {
            if (class102.field302 == n) {
                return class102;
            }
        }
        return class101;
    }
    
    public static Class101 method594(final String s) {
        return method595(s, Class101.field298);
    }
    
    public static Class101 method595(final String anObject, final Class101 class101) {
        for (final Class101 class102 : values()) {
            if (class102.field303.equals(anObject)) {
                return class102;
            }
        }
        return class101;
    }
}
