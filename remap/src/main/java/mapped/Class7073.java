// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class7073 extends Class7074
{
    private static String[] field27545;
    private final Direction field27546;
    
    public Class7073(final World class1847, final BlockPos class1848, final Direction field27546, final ItemStack class1849, final Direction class1850) {
        super(class1847, null, Class316.field1877, class1849, new BlockRayTraceResult(new Vec3d(class1848.getX() + 0.5, class1848.getY(), class1848.getZ() + 0.5), class1850, class1848, false));
        this.field27546 = field27546;
    }
    
    @Override
    public BlockPos method21639() {
        return this.field27553.getPos();
    }
    
    @Override
    public boolean method21640() {
        return this.field27554.getBlockState(this.field27553.getPos()).method21750(this);
    }
    
    @Override
    public boolean method21641() {
        return this.method21640();
    }
    
    @Override
    public Direction method21642() {
        return Direction.DOWN;
    }
    
    @Override
    public Direction[] method21643() {
        switch (Class7648.field30373[this.field27546.ordinal()]) {
            default: {
                return new Direction[] { Direction.DOWN, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP};
            }
            case 2: {
                return new Direction[] { Direction.DOWN, Direction.UP, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};
            }
            case 3: {
                return new Direction[] { Direction.DOWN, Direction.NORTH, Direction.EAST, Direction.WEST, Direction.UP, Direction.SOUTH};
            }
            case 4: {
                return new Direction[] { Direction.DOWN, Direction.SOUTH, Direction.EAST, Direction.WEST, Direction.UP, Direction.NORTH};
            }
            case 5: {
                return new Direction[] { Direction.DOWN, Direction.WEST, Direction.SOUTH, Direction.UP, Direction.NORTH, Direction.EAST};
            }
            case 6: {
                return new Direction[] { Direction.DOWN, Direction.EAST, Direction.SOUTH, Direction.UP, Direction.NORTH, Direction.WEST};
            }
        }
    }
    
    @Override
    public Direction method21644() {
        return (this.field27546.getAxis() != Direction.Axis.Y) ? this.field27546 : Direction.NORTH;
    }
    
    @Override
    public boolean method21645() {
        return false;
    }
    
    @Override
    public float method21646() {
        return (float)(this.field27546.getHorizontalIndex() * 90);
    }
}
