// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.VoxelShape;

public final class Class7705 extends VoxelShape
{
    private static String[] field30624;
    
    public Class7705(final VoxelShapePart class8260) {
        super(class8260);
    }
    
    @Override
    public DoubleList getValues(final Axis class111) {
        return (DoubleList)new Class81(this.part.getSize(class111));
    }
    
    @Override
    public int method24548(final Axis class111, final double n) {
        final int method27430 = this.part.getSize(class111);
        return MathHelper.method35651(MathHelper.floor(n * method27430), -1, method27430);
    }
}
