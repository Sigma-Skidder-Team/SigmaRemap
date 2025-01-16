// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

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
    
    public static Class99 method577(final Direction class179) {
        return Class99.field283[class179.getIndex()];
    }
    
    static {
        field283 = Util.method27851(new Class99[6], array -> {
            array[Direction.DOWN.getIndex()] = Class99.field273;
            array[Direction.UP.getIndex()] = Class99.field274;
            array[Direction.NORTH.getIndex()] = Class99.field275;
            array[Direction.SOUTH.getIndex()] = Class99.field276;
            array[Direction.WEST.getIndex()] = Class99.field277;
            array[Direction.EAST.getIndex()] = Class99.field278;
        });
    }
}
