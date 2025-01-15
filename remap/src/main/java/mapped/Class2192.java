// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public enum Class2192
{
    field13330(Direction.DOWN),
    field13331(Direction.UP),
    field13332(Direction.NORTH),
    field13333(Direction.SOUTH),
    field13334(Direction.WEST),
    field13335(Direction.EAST),
    field13336(Direction.NORTH, Direction.WEST),
    field13337(Direction.NORTH, Direction.EAST),
    field13338(Direction.SOUTH, Direction.WEST),
    field13339(Direction.SOUTH, Direction.EAST),
    field13340(Direction.DOWN, Direction.NORTH),
    field13341(Direction.DOWN, Direction.SOUTH),
    field13342(Direction.UP, Direction.NORTH),
    field13343(Direction.UP, Direction.SOUTH),
    field13344(Direction.DOWN, Direction.WEST),
    field13345(Direction.DOWN, Direction.EAST),
    field13346(Direction.UP, Direction.WEST),
    field13347(Direction.UP, Direction.EAST);
    
    private Direction field13348;
    private Direction field13349;
    
    private Class2192(final Direction field13348) {
        this.field13348 = field13348;
    }
    
    private Class2192(final Direction field13348, final Direction field13349) {
        this.field13348 = field13348;
        this.field13349 = field13349;
    }
    
    public Direction method8362() {
        return this.field13348;
    }
    
    public Direction method8363() {
        return this.field13349;
    }
    
    public BlockPos method8364(BlockPos class354) {
        class354 = class354.method1150(this.field13348, 1);
        if (this.field13349 != null) {
            class354 = class354.method1150(this.field13349, 1);
        }
        return class354;
    }
    
    public int method8365() {
        int method785 = this.field13348.getXOffset();
        if (this.field13349 != null) {
            method785 += this.field13349.getXOffset();
        }
        return method785;
    }
    
    public int method8366() {
        int method786 = this.field13348.getYOffset();
        if (this.field13349 != null) {
            method786 += this.field13349.getYOffset();
        }
        return method786;
    }
    
    public int method8367() {
        int method787 = this.field13348.getZOffset();
        if (this.field13349 != null) {
            method787 += this.field13349.getZOffset();
        }
        return method787;
    }
    
    public boolean method8368() {
        return this.field13349 != null;
    }
}
