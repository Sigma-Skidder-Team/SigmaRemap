// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2157
{
    field12809(0), 
    field12810(1), 
    field12811(2);
    
    private static final Class2157[] field12812;
    private final int field12813;
    
    Class2157(final int field12813) {
        this.field12813 = field12813;
    }
    
    public int method8322() {
        return this.field12813;
    }
    
    public static Class2157 method8323(final int i) {
        if (i >= 0 && i < Class2157.field12812.length) {
            return Class2157.field12812[i];
        }
        throw new IllegalArgumentException("No operation with value " + i);
    }
    
    static {
        field12812 = new Class2157[] { Class2157.field12809, Class2157.field12810, Class2157.field12811 };
    }
}
