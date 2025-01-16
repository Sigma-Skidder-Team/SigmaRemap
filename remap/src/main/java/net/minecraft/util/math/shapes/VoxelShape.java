// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.util.math.shapes;

import com.google.common.math.DoubleMath;
import javax.annotation.Nullable;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public abstract class VoxelShape
{
    public final VoxelShapePart part;
    private VoxelShape[] projectionCache;
    
    public VoxelShape(final VoxelShapePart part) {
        this.part = part;
    }
    
    public double getStart(final Direction.Axis class111) {
        final int method27417 = this.part.getStart(class111);
        return (method27417 < this.part.getSize(class111)) ? this.getValueUnchecked(class111, method27417) : Double.POSITIVE_INFINITY;
    }
    
    public double getEnd(final Direction.Axis class111) {
        final int method27418 = this.part.getEnd(class111);
        return (method27418 > 0) ? this.getValueUnchecked(class111, method27418) : Double.NEGATIVE_INFINITY;
    }
    
    public AxisAlignedBB getBoundingBox() {
        if (!this.isEmpty()) {
            return new AxisAlignedBB(this.getStart(Direction.Axis.X), this.getStart(Direction.Axis.Y), this.getStart(Direction.Axis.Z), this.getEnd(Direction.Axis.X), this.getEnd(Direction.Axis.Y), this.getEnd(Direction.Axis.Z));
        }
        throw Util.pauseDevMode(new UnsupportedOperationException("No bounds for empty shape."));
    }
    
    public double getValueUnchecked(final Direction.Axis class111, final int n) {
        return this.getValues(class111).getDouble(n);
    }
    
    public abstract DoubleList getValues(final Direction.Axis p0);
    
    public boolean isEmpty() {
        return this.part.isEmpty();
    }
    
    public VoxelShape withOffset(final double n, final double n2, final double n3) {
        return this.isEmpty() ? VoxelShapes.empty() : new VoxelShapeArray(this.part, (DoubleList)new Class87(this.getValues(Direction.Axis.X), n), (DoubleList)new Class87(this.getValues(Direction.Axis.Y), n2), (DoubleList)new Class87(this.getValues(Direction.Axis.Z), n3));
    }
    
    public VoxelShape simplify() {
        final VoxelShape[] array = { VoxelShapes.empty() };
        this.forEachBox((n, n2, n3, n4, n5, n6) -> array[0] = VoxelShapes.method24495(array[0], VoxelShapes.method24488(n, n2, n3, n4, n5, n6), IBooleanFunction.OR));
        return array[0];
    }
    
    public void forEachEdge(final VoxelShapes.ILineConsumer class9252) {
        this.part.forEachEdge((n, n2, n3, n4, n5, n6) -> class9252.consume(this.getValueUnchecked(Direction.Axis.X, n), this.getValueUnchecked(Direction.Axis.Y, n2), this.getValueUnchecked(Direction.Axis.Z, n3), this.getValueUnchecked(Direction.Axis.X, n4), this.getValueUnchecked(Direction.Axis.Y, n5), this.getValueUnchecked(Direction.Axis.Z, n6)), true);
    }

    public void forEachBox(VoxelShapes.ILineConsumer action)
    {
        DoubleList doublelist = this.getValues(Direction.Axis.X);
        DoubleList doublelist1 = this.getValues(Direction.Axis.Y);
        DoubleList doublelist2 = this.getValues(Direction.Axis.Z);
        this.part.forEachBox((p_224789_4_, p_224789_5_, p_224789_6_, p_224789_7_, p_224789_8_, p_224789_9_) ->
        {
            action.consume(doublelist.getDouble(p_224789_4_), doublelist1.getDouble(p_224789_5_), doublelist2.getDouble(p_224789_6_), doublelist.getDouble(p_224789_7_), doublelist1.getDouble(p_224789_8_), doublelist2.getDouble(p_224789_9_));
        }, true);
    }
    
    public List<AxisAlignedBB> toBoundingBoxList() {
        final ArrayList arrayList = Lists.newArrayList();
        this.forEachBox((n, n2, n3, n4, n5, n6) -> arrayList.add(new AxisAlignedBB(n, n2, n3, n4, n5, n6)));
        return arrayList;
    }
    
    public double min(final Direction.Axis class111, final double n, final double n2) {
        final int method27428 = this.part.firstFilled(class111, this.getClosestIndex(AxisRotation.FORWARD.rotate(class111), n), this.getClosestIndex(AxisRotation.BACKWARD.rotate(class111), n2));
        return (method27428 < this.part.getSize(class111)) ? this.getValueUnchecked(class111, method27428) : Double.POSITIVE_INFINITY;
    }
    
    public double max(final Direction.Axis class111, final double n, final double n2) {
        final int method27429 = this.part.lastFilled(class111, this.getClosestIndex(AxisRotation.FORWARD.rotate(class111), n), this.getClosestIndex(AxisRotation.BACKWARD.rotate(class111), n2));
        return (method27429 > 0) ? this.getValueUnchecked(class111, method27429) : Double.NEGATIVE_INFINITY;
    }
    
    public int getClosestIndex(final Direction.Axis axis, final double position) {
        return MathHelper.method35699(0, this.part.getSize(axis) + 1, n4 -> {
            if (n4 >= 0) {
                if (n4 <= this.part.getSize(axis)) {
                    return position < this.getValueUnchecked(axis, n4);
                }
                else {
                    return true;
                }
            }
            else {
                return false;
            }
        }) - 1;
    }
    
    public boolean contains(final double n, final double n2, final double n3) {
        return this.part.contains(this.getClosestIndex(Direction.Axis.X, n), this.getClosestIndex(Direction.Axis.Y, n2), this.getClosestIndex(Direction.Axis.Z, n3));
    }
    
    @Nullable
    public BlockRayTraceResult rayTrace(final Vec3d p_212433_1_, final Vec3d p_212433_2_, final BlockPos p_212433_3_) {
        if (this.isEmpty()) {
            return null;
        }
        final Vec3d vec3d = p_212433_2_.subtract(p_212433_1_);
        if (vec3d.lengthSquared() >= 1.0E-7) {
            final Vec3d vec3d1 = p_212433_1_.add(vec3d.scale(0.001));
            return this.contains(vec3d1.x - p_212433_3_.getX(), vec3d1.y - p_212433_3_.getY(), vec3d1.z - p_212433_3_.getZ()) ? new BlockRayTraceResult(vec3d1, Direction.getFacingFromVector(vec3d.x, vec3d.y, vec3d.z).getOpposite(), p_212433_3_, true) : AxisAlignedBB.rayTrace(this.toBoundingBoxList(), p_212433_1_, p_212433_2_, p_212433_3_);
        }
        return null;
    }
    
    public VoxelShape project(final Direction side) {
        if (!this.isEmpty() && this != VoxelShapes.fullCube()) {
            if (this.projectionCache == null) {
                this.projectionCache = new VoxelShape[6];
            }
            else {
                final VoxelShape voxelshape = this.projectionCache[side.ordinal()];
                if (voxelshape != null) {
                    return voxelshape;
                }
            }
            return this.projectionCache[side.ordinal()] = this.doProject(side);
        }
        return this;
    }
    
    private VoxelShape doProject(final Direction side) {
        final Direction.Axis method790 = side.getAxis();
        final AxisDirection method791 = side.getAxisDirection();
        final DoubleList method792 = this.getValues(method790);
        if (method792.size() == 2) {
            if (DoubleMath.fuzzyEquals(method792.getDouble(0), 0.0, 1.0E-7)) {
                if (DoubleMath.fuzzyEquals(method792.getDouble(1), 1.0, 1.0E-7)) {
                    return this;
                }
            }
        }
        return new SplitVoxelShape(this, method790, this.getClosestIndex(method790, (method791 != AxisDirection.POSITIVE) ? 1.0E-7 : 0.9999999));
    }
    
    public double getAllowedOffset(final Direction.Axis class111, final AxisAlignedBB class112, final double n) {
        return this.getAllowedOffset(AxisRotation.from(class111, Direction.Axis.X), class112, n);
    }
    
    public double getAllowedOffset(final AxisRotation axisRotation, final AxisAlignedBB class310, double a) {
        if (this.isEmpty()) {
            return a;
        }
        if (Math.abs(a) >= 1.0E-7) {
            final AxisRotation axisrotation = axisRotation.reverse();
            final Direction.Axis direction$axis = axisrotation.rotate(Direction.Axis.X);
            final Direction.Axis direction$axis1 = axisrotation.rotate(Direction.Axis.Y);
            final Direction.Axis direction$axis2 = axisrotation.rotate(Direction.Axis.Z);
            final double d0 = class310.getMax(direction$axis);
            final double d1 = class310.getMin(direction$axis);
            final int method990 = this.getClosestIndex(direction$axis, d1 + 1.0E-7);
            final int method991 = this.getClosestIndex(direction$axis, d0 - 1.0E-7);
            final int max = Math.max(0, this.getClosestIndex(direction$axis1, class310.getMin(direction$axis1) + 1.0E-7));
            final int min = Math.min(this.part.getSize(direction$axis1), this.getClosestIndex(direction$axis1, class310.getMax(direction$axis1) - 1.0E-7) + 1);
            final int max2 = Math.max(0, this.getClosestIndex(direction$axis2, class310.getMin(direction$axis2) + 1.0E-7));
            final int min2 = Math.min(this.part.getSize(direction$axis2), this.getClosestIndex(direction$axis2, class310.getMax(direction$axis2) - 1.0E-7) + 1);
            final int method992 = this.part.getSize(direction$axis);
            if (a <= 0.0) {
                if (a < 0.0) {
                    for (int i = method990 - 1; i >= 0; --i) {
                        for (int j = max; j < min; ++j) {
                            for (int k = max2; k < min2; ++k) {
                                if (this.part.containsWithRotation(axisrotation, i, j, k)) {
                                    final double b = this.getValueUnchecked(direction$axis, i + 1) - d1;
                                    if (b <= 1.0E-7) {
                                        a = Math.max(a, b);
                                    }
                                    return a;
                                }
                            }
                        }
                    }
                }
            }
            else {
                for (int l = method991 + 1; l < method992; ++l) {
                    for (int n = max; n < min; ++n) {
                        for (int n2 = max2; n2 < min2; ++n2) {
                            if (this.part.containsWithRotation(axisrotation, l, n, n2)) {
                                final double b2 = this.getValueUnchecked(direction$axis, l) - d0;
                                if (b2 >= -1.0E-7) {
                                    a = Math.min(a, b2);
                                }
                                return a;
                            }
                        }
                    }
                }
            }
            return a;
        }
        return 0.0;
    }
    
    @Override
    public String toString() {
        return this.isEmpty() ? "EMPTY" : ("VoxelShape[" + this.getBoundingBox() + "]");
    }
}
