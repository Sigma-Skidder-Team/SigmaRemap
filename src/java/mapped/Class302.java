// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;

public enum Class302
{
    field1758, 
    field1759, 
    field1760, 
    field1761;
    
    private static final Class302[] field1762;
    
    private static Class302 method958(final String s) {
        for (final Class302 class302 : Class302.field1762) {
            if (s.equalsIgnoreCase(class302.name())) {
                return class302;
            }
        }
        return Class302.field1758;
    }
    
    public String method959() {
        return this.name().toLowerCase(Locale.ROOT);
    }
    
    static {
        field1762 = values();
    }
}
