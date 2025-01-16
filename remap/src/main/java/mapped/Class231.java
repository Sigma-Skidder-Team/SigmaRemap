// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

public enum Class231
{
    field859(Direction.UP, 0, -1),
    field860(Direction.DOWN, 0, 1),
    field861(Direction.EAST, -1, 0),
    field862(Direction.WEST, 1, 0);
    
    private final Direction field863;
    private final int field864;
    private final int field865;
    
    private Class231(final Direction field863, final int field864, final int field865) {
        this.field863 = field863;
        this.field864 = field864;
        this.field865 = field865;
    }
    
    public Direction method862() {
        return this.field863;
    }
    
    public int method863() {
        return this.field864;
    }
    
    public int method864() {
        return this.field865;
    }
    
    private boolean method865() {
        return this == Class231.field860 || this == Class231.field859;
    }
}
