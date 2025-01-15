// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class99
{
    field273(0, 1, 2, 3), 
    field274(2, 3, 0, 1), 
    field275(3, 0, 1, 2), 
    field276(0, 1, 2, 3), 
    field277(3, 0, 1, 2), 
    field278(1, 2, 3, 0);
    
    private final int field279;
    private final int field280;
    private final int field281;
    private final int field282;
    private static final Class99[] field283;
    
    private Class99(final int field279, final int field280, final int field281, final int field282) {
        this.field279 = field279;
        this.field280 = field280;
        this.field281 = field281;
        this.field282 = field282;
    }
    
    public static Class99 method577(final Class179 class179) {
        return Class99.field283[class179.method779()];
    }
    
    static {
        field283 = Class8349.method27851(new Class99[6], array -> {
            array[Class179.field511.method779()] = Class99.field273;
            array[Class179.field512.method779()] = Class99.field274;
            array[Class179.field513.method779()] = Class99.field275;
            array[Class179.field514.method779()] = Class99.field276;
            array[Class179.field515.method779()] = Class99.field277;
            array[Class179.field516.method779()] = Class99.field278;
        });
    }
}
