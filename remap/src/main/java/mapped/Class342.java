// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class342
{
    field2105("progress"), 
    field2106("notched_6"), 
    field2107("notched_10"), 
    field2108("notched_12"), 
    field2109("notched_20");
    
    private final String field2110;
    
    Class342(final String field2110) {
        this.field2110 = field2110;
    }
    
    public String method1019() {
        return this.field2110;
    }
    
    public static Class342 method1020(final String anObject) {
        for (final Class342 class342 : values()) {
            if (class342.field2110.equals(anObject)) {
                return class342;
            }
        }
        return Class342.field2105;
    }
}
