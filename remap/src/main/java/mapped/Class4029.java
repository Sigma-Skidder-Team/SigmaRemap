// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.IBlockReader;

public class Class4029 extends Class4027
{
    private static String[] field18119;
    private final MaterialColor field18122;
    
    public Class4029(final MaterialColor field18122, final Class9288 class9288) {
        super(class9288);
        this.field18122 = field18122;
    }
    
    @Override
    public MaterialColor method11783(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return (class7096.get(Class4029.field18120) != Direction.Axis.Y) ? this.field17402 : this.field18122;
    }
}
