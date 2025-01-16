// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public enum Class2018
{
    field11500(Direction.DOWN, false),
    field11501(Direction.UP, false),
    field11502(Direction.NORTH, false),
    field11503(Direction.SOUTH, false),
    field11504(Direction.WEST, false),
    field11505(Direction.EAST, false),
    field11506(Direction.DOWN, true),
    field11507(Direction.UP, true),
    field11508(Direction.NORTH, true),
    field11509(Direction.SOUTH, true),
    field11510(Direction.WEST, true),
    field11511(Direction.EAST, true);
    
    private final int field11512;
    
    private Class2018(final Direction class179, final boolean b) {
        this.field11512 = class179.getIndex() + (b ? Direction.values().length : 0);
    }
}
