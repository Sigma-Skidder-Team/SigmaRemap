// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class240
{
    field1177("front"), 
    field1178("side");
    
    private final String field1179;
    
    private Class240(final String field1179) {
        this.field1179 = field1179;
    }
    
    public static Class240 method888(final String s) {
        for (final Class240 class240 : values()) {
            if (class240.field1179.equals(s)) {
                return class240;
            }
        }
        throw new IllegalArgumentException("Invalid gui light: " + s);
    }
    
    public boolean method889() {
        return this == Class240.field1178;
    }
}
