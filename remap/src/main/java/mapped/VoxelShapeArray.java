// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import java.util.Arrays;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util2.Direction;

public final class VoxelShapeArray extends VoxelShape
{
    private final DoubleList xPoints;
    private final DoubleList yPoints;
    private final DoubleList zPoints;
    
    public VoxelShapeArray(final VoxelShapePart class8260, final double[] original, final double[] original2, final double[] original3) {
        this(class8260, (DoubleList)DoubleArrayList.wrap(Arrays.copyOf(original, class8260.getXSize() + 1)), (DoubleList)DoubleArrayList.wrap(Arrays.copyOf(original2, class8260.getYSize() + 1)), (DoubleList)DoubleArrayList.wrap(Arrays.copyOf(original3, class8260.getZSize() + 1)));
    }
    
    public VoxelShapeArray(final VoxelShapePart class8260, final DoubleList xPoints, final DoubleList yPoints, final DoubleList zPoints) {
        super(class8260);
        final int n = class8260.getXSize() + 1;
        final int n2 = class8260.getYSize() + 1;
        final int n3 = class8260.getZSize() + 1;
        if (n == xPoints.size()) {
            if (n2 == yPoints.size()) {
                if (n3 == zPoints.size()) {
                    this.xPoints = xPoints;
                    this.yPoints = yPoints;
                    this.zPoints = zPoints;
                    return;
                }
            }
        }
        throw Class8349.method27859(new IllegalArgumentException("Lengths of point arrays must be consistent with the size of the VoxelShape."));
    }
    
    @Override
    public DoubleList getValues(final Direction.Axis class111) {
        switch (class111.ordinal()) {
            case 1: {
                return this.xPoints;
            }
            case 2: {
                return this.yPoints;
            }
            case 3: {
                return this.zPoints;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }
}
