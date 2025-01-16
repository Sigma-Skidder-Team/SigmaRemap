// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.Direction;

public class SplitVoxelShape extends VoxelShape
{
    private final VoxelShape shape;
    private final Direction.Axis axis;
    private static final DoubleList field_223415_d = new DoubleRangeList(1);

    public SplitVoxelShape(final VoxelShape field30618, final Direction.Axis field30619, final int n) {
        super(makeShapePart(field30618.part, field30619, n));
        this.shape = field30618;
        this.axis = field30619;
    }
    
    private static VoxelShapePart makeShapePart(final VoxelShapePart class8260, final Direction.Axis class8261, final int n) {
        return new PartSplitVoxelShape(class8260, class8261.getCoordinate(n, 0, 0), class8261.getCoordinate(0, n, 0), class8261.getCoordinate(0, 0, n), class8261.getCoordinate(n + 1, class8260.xSize, class8260.xSize), class8261.getCoordinate(class8260.ySize, n + 1, class8260.ySize), class8261.getCoordinate(class8260.zSize, class8260.zSize, n + 1));
    }
    
    @Override
    public DoubleList getValues(final Direction.Axis class111) {
        return (class111 != this.axis) ? this.shape.getValues(class111) : SplitVoxelShape.field_223415_d;
    }
}
