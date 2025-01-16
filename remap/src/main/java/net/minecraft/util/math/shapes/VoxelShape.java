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
import net.minecraft.util2.Direction;
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
    
    public double method24535(final Axis class111) {
        final int method27417 = this.part.getStart(class111);
        return (method27417 < this.part.getSize(class111)) ? this.getValueUnchecked(class111, method27417) : Double.POSITIVE_INFINITY;
    }
    
    public double method24536(final Axis class111) {
        final int method27418 = this.part.getEnd(class111);
        return (method27418 > 0) ? this.getValueUnchecked(class111, method27418) : Double.NEGATIVE_INFINITY;
    }
    
    public AxisAlignedBB method24537() {
        if (!this.isEmpty()) {
            return new AxisAlignedBB(this.method24535(Axis.X), this.method24535(Axis.Y), this.method24535(Axis.Z), this.method24536(Axis.X), this.method24536(Axis.Y), this.method24536(Axis.Z));
        }
        throw Class8349.method27859(new UnsupportedOperationException("No bounds for empty shape."));
    }
    
    public double getValueUnchecked(final Axis class111, final int n) {
        return this.getValues(class111).getDouble(n);
    }
    
    public abstract DoubleList getValues(final Axis p0);
    
    public boolean isEmpty() {
        return this.part.isEmpty();
    }
    
    public VoxelShape withOffset(final double n, final double n2, final double n3) {
        return this.isEmpty() ? VoxelShapes.empty() : new VoxelShapeArray(this.part, (DoubleList)new Class87(this.getValues(Axis.X), n), (DoubleList)new Class87(this.getValues(Axis.Y), n2), (DoubleList)new Class87(this.getValues(Axis.Z), n3));
    }
    
    public VoxelShape simplify() {
        final VoxelShape[] array = { VoxelShapes.empty() };
        this.forEachBox((n, n2, n3, n4, n5, n6) -> array[0] = VoxelShapes.method24495(array[0], VoxelShapes.method24488(n, n2, n3, n4, n5, n6), IBooleanFunction.OR));
        return array[0];
    }
    
    public void forEachEdge(final VoxelShapes.ILineConsumer class9252) {
        this.part.forEachEdge((n, n2, n3, n4, n5, n6) -> class9252.consume(this.getValueUnchecked(Axis.X, n), this.getValueUnchecked(Axis.Y, n2), this.getValueUnchecked(Axis.Z, n3), this.getValueUnchecked(Axis.X, n4), this.getValueUnchecked(Axis.Y, n5), this.getValueUnchecked(Axis.Z, n6)), true);
    }

    public void forEachBox(VoxelShapes.ILineConsumer action)
    {
        DoubleList doublelist = this.getValues(Axis.X);
        DoubleList doublelist1 = this.getValues(Axis.Y);
        DoubleList doublelist2 = this.getValues(Axis.Z);
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
    
    public double min(final Axis class111, final double n, final double n2) {
        final int method27428 = this.part.firstFilled(class111, this.method24548(AxisRotation.FORWARD.rotate(class111), n), this.method24548(AxisRotation.BACKWARD.rotate(class111), n2));
        return (method27428 < this.part.getSize(class111)) ? this.getValueUnchecked(class111, method27428) : Double.POSITIVE_INFINITY;
    }
    
    public double max(final Axis class111, final double n, final double n2) {
        final int method27429 = this.part.lastFilled(class111, this.method24548(AxisRotation.FORWARD.rotate(class111), n), this.method24548(AxisRotation.BACKWARD.rotate(class111), n2));
        return (method27429 > 0) ? this.getValueUnchecked(class111, method27429) : Double.NEGATIVE_INFINITY;
    }
    
    public int method24548(final Axis class111, final double n) {
        return MathHelper.method35699(0, this.part.getSize(class111) + 1, n4 -> {
            if (n4 >= 0) {
                if (n4 <= this.part.getSize(class112)) {
                    return n3 < this.getValueUnchecked(class112, n4);
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
    
    public boolean method24549(final double n, final double n2, final double n3) {
        return this.part.contains(this.method24548(Axis.X, n), this.method24548(Axis.Y, n2), this.method24548(Axis.Z, n3));
    }
    
    @Nullable
    public BlockRayTraceResult method24550(final Vec3d class5487, final Vec3d class5488, final BlockPos class5489) {
        if (this.isEmpty()) {
            return null;
        }
        final Vec3d method16741 = class5488.subtract(class5487);
        if (method16741.lengthSquared() >= 1.0E-7) {
            final Vec3d method16742 = class5487.add(method16741.scale(0.001));
            return this.method24549(method16742.x - class5489.getX(), method16742.y - class5489.getY(), method16742.z - class5489.getZ()) ? new BlockRayTraceResult(method16742, Direction.getFacingFromVector(method16741.x, method16741.y, method16741.z).getOpposite(), class5489, true) : AxisAlignedBB.method18513(this.toBoundingBoxList(), class5487, class5488, class5489);
        }
        return null;
    }
    
    public VoxelShape method24551(final Direction class179) {
        if (!this.isEmpty() && this != VoxelShapes.method24487()) {
            if (this.projectionCache == null) {
                this.projectionCache = new VoxelShape[6];
            }
            else {
                final VoxelShape class180 = this.projectionCache[class179.ordinal()];
                if (class180 != null) {
                    return class180;
                }
            }
            return this.projectionCache[class179.ordinal()] = this.method24552(class179);
        }
        return this;
    }
    
    private VoxelShape method24552(final Direction class179) {
        final Axis method790 = class179.getAxis();
        final AxisDirection method791 = class179.getAxisDirection();
        final DoubleList method792 = this.getValues(method790);
        if (method792.size() == 2) {
            if (DoubleMath.fuzzyEquals(method792.getDouble(0), 0.0, 1.0E-7)) {
                if (DoubleMath.fuzzyEquals(method792.getDouble(1), 1.0, 1.0E-7)) {
                    return this;
                }
            }
        }
        return new Class7703(this, method790, this.method24548(method790, (method791 != AxisDirection.POSITIVE) ? 1.0E-7 : 0.9999999));
    }
    
    public double method24553(final Axis class111, final AxisAlignedBB class112, final double n) {
        return this.method24554(AxisRotation.from(class111, Axis.X), class112, n);
    }
    
    public double method24554(final AxisRotation axisRotation, final AxisAlignedBB class310, double a) {
        if (this.isEmpty()) {
            return a;
        }
        if (Math.abs(a) >= 1.0E-7) {
            final AxisRotation method984 = axisRotation.reverse();
            final Axis method985 = method984.rotate(Axis.X);
            final Axis method986 = method984.rotate(Axis.Y);
            final Axis method987 = method984.rotate(Axis.Z);
            final double method988 = class310.method18491(method985);
            final double method989 = class310.method18490(method985);
            final int method990 = this.method24548(method985, method989 + 1.0E-7);
            final int method991 = this.method24548(method985, method988 - 1.0E-7);
            final int max = Math.max(0, this.method24548(method986, class310.method18490(method986) + 1.0E-7));
            final int min = Math.min(this.part.getSize(method986), this.method24548(method986, class310.method18491(method986) - 1.0E-7) + 1);
            final int max2 = Math.max(0, this.method24548(method987, class310.method18490(method987) + 1.0E-7));
            final int min2 = Math.min(this.part.getSize(method987), this.method24548(method987, class310.method18491(method987) - 1.0E-7) + 1);
            final int method992 = this.part.getSize(method985);
            if (a <= 0.0) {
                if (a < 0.0) {
                    for (int i = method990 - 1; i >= 0; --i) {
                        for (int j = max; j < min; ++j) {
                            for (int k = max2; k < min2; ++k) {
                                if (this.part.containsWithRotation(method984, i, j, k)) {
                                    final double b = this.getValueUnchecked(method985, i + 1) - method989;
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
                            if (this.part.containsWithRotation(method984, l, n, n2)) {
                                final double b2 = this.getValueUnchecked(method985, l) - method988;
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
        return this.isEmpty() ? "EMPTY" : ("VoxelShape[" + this.method24537() + "]");
    }
}
