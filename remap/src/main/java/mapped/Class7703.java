// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util2.Direction;

public class Class7703 extends VoxelShape
{
    private static String[] field30617;
    private final VoxelShape field30618;
    private final Direction.Axis field30619;
    private static final DoubleList field30620;
    
    public Class7703(final VoxelShape field30618, final Direction.Axis field30619, final int n) {
        super(method24560(field30618.part, field30619, n));
        this.field30618 = field30618;
        this.field30619 = field30619;
    }
    
    private static VoxelShapePart method24560(final VoxelShapePart class8260, final Direction.Axis class8261, final int n) {
        return new Class8261(class8260, class8261.getCoordinate(n, 0, 0), class8261.getCoordinate(0, n, 0), class8261.getCoordinate(0, 0, n), class8261.getCoordinate(n + 1, class8260.xSize, class8260.xSize), class8261.getCoordinate(class8260.ySize, n + 1, class8260.ySize), class8261.getCoordinate(class8260.zSize, class8260.zSize, n + 1));
    }
    
    @Override
    public DoubleList getValues(final Direction.Axis class111) {
        return (class111 != this.field30619) ? this.field30618.getValues(class111) : Class7703.field30620;
    }
    
    static {
        field30620 = (DoubleList)new Class81(1);
    }
}
