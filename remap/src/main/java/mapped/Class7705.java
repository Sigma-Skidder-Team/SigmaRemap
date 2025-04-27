// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.Direction;

public final class Class7705 extends VoxelShape
{
    private static String[] field30624;
    
    public Class7705(final VoxelShapePart class8260) {
        super(class8260);
    }
    
    @Override
    public DoubleList getValues(final Direction.Axis class111) {
        return new DoubleRangeList(this.part.getSize(class111));
    }
    
    @Override
    public int getClosestIndex(final Direction.Axis axis, final double position) {
        final int method27430 = this.part.getSize(axis);
        return MathHelper.method35651(MathHelper.floor(position * method27430), -1, method27430);
    }
}
