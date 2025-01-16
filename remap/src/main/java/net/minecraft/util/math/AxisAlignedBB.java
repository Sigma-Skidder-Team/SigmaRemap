// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.util.math;

import mapped.MutableBoundingBox;
import mapped.BlockRayTraceResult;
import net.minecraft.util2.Direction;

import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.Optional;

public class AxisAlignedBB
{
    public final double minX;
    public final double minY;
    public final double minZ;
    public final double maxX;
    public final double maxY;
    public final double maxZ;

    public AxisAlignedBB(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this.minX = Math.min(n, n4);
        this.minY = Math.min(n2, n5);
        this.minZ = Math.min(n3, n6);
        this.maxX = Math.max(n, n4);
        this.maxY = Math.max(n2, n5);
        this.maxZ = Math.max(n3, n6);
    }

    public AxisAlignedBB(final BlockPos class354) {
        this(class354.getX(), class354.getY(), class354.getZ(), class354.getX() + 1, class354.getY() + 1, class354.getZ() + 1);
    }

    public AxisAlignedBB(final BlockPos class354, final BlockPos class355) {
        this(class354.getX(), class354.getY(), class354.getZ(), class355.getX(), class355.getY(), class355.getZ());
    }

    public AxisAlignedBB(final Vec3d class5487, final Vec3d class5488) {
        this(class5487.x, class5487.y, class5487.z, class5488.x, class5488.y, class5488.z);
    }

    public static AxisAlignedBB toImmutable(final MutableBoundingBox class6997) {
        return new AxisAlignedBB(class6997.minX, class6997.minY, class6997.minZ, class6997.maxX + 1, class6997.maxY + 1, class6997.maxZ + 1);
    }

    public double getMin(final Direction.Axis class111) {
        return class111.getCoordinate(this.minX, this.minY, this.minZ);
    }

    public double getMax(final Direction.Axis class111) {
        return class111.getCoordinate(this.maxX, this.maxY, this.maxZ);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof AxisAlignedBB) {
            final AxisAlignedBB class6221 = (AxisAlignedBB)o;
            return Double.compare(class6221.minX, this.minX) == 0 && Double.compare(class6221.minY, this.minY) == 0 && Double.compare(class6221.minZ, this.minZ) == 0 && Double.compare(class6221.maxX, this.maxX) == 0 && Double.compare(class6221.maxY, this.maxY) == 0 && Double.compare(class6221.maxZ, this.maxZ) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.minX);
        final int n = (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
        final long doubleToLongBits2 = Double.doubleToLongBits(this.minY);
        final int n2 = 31 * n + (int)(doubleToLongBits2 ^ doubleToLongBits2 >>> 32);
        final long doubleToLongBits3 = Double.doubleToLongBits(this.minZ);
        final int n3 = 31 * n2 + (int)(doubleToLongBits3 ^ doubleToLongBits3 >>> 32);
        final long doubleToLongBits4 = Double.doubleToLongBits(this.maxX);
        final int n4 = 31 * n3 + (int)(doubleToLongBits4 ^ doubleToLongBits4 >>> 32);
        final long doubleToLongBits5 = Double.doubleToLongBits(this.maxY);
        final int n5 = 31 * n4 + (int)(doubleToLongBits5 ^ doubleToLongBits5 >>> 32);
        final long doubleToLongBits6 = Double.doubleToLongBits(this.maxZ);
        return 31 * n5 + (int)(doubleToLongBits6 ^ doubleToLongBits6 >>> 32);
    }

    public AxisAlignedBB contract(final double n, final double n2, final double n3) {
        double field25073 = this.minX;
        double field25074 = this.minY;
        double field25075 = this.minZ;
        double field25076 = this.maxX;
        double field25077 = this.maxY;
        double field25078 = this.maxZ;
        if (n >= 0.0) {
            if (n > 0.0) {
                field25076 -= n;
            }
        }
        else {
            field25073 -= n;
        }
        if (n2 >= 0.0) {
            if (n2 > 0.0) {
                field25077 -= n2;
            }
        }
        else {
            field25074 -= n2;
        }
        if (n3 >= 0.0) {
            if (n3 > 0.0) {
                field25078 -= n3;
            }
        }
        else {
            field25075 -= n3;
        }
        return new AxisAlignedBB(field25073, field25074, field25075, field25076, field25077, field25078);
    }

    public AxisAlignedBB expand(final Vec3d class5487) {
        return this.expand(class5487.x, class5487.y, class5487.z);
    }

    public AxisAlignedBB expand(final double n, final double n2, final double n3) {
        double field25073 = this.minX;
        double field25074 = this.minY;
        double field25075 = this.minZ;
        double field25076 = this.maxX;
        double field25077 = this.maxY;
        double field25078 = this.maxZ;
        if (n >= 0.0) {
            if (n > 0.0) {
                field25076 += n;
            }
        }
        else {
            field25073 += n;
        }
        if (n2 >= 0.0) {
            if (n2 > 0.0) {
                field25077 += n2;
            }
        }
        else {
            field25074 += n2;
        }
        if (n3 >= 0.0) {
            if (n3 > 0.0) {
                field25078 += n3;
            }
        }
        else {
            field25075 += n3;
        }
        return new AxisAlignedBB(field25073, field25074, field25075, field25076, field25077, field25078);
    }

    public AxisAlignedBB grow(final double n, final double n2, final double n3) {
        return new AxisAlignedBB(this.minX - n, this.minY - n2, this.minZ - n3, this.maxX + n, this.maxY + n2, this.maxZ + n3);
    }

    public AxisAlignedBB intersect(final double n) {
        return this.grow(n, n, n);
    }

    public AxisAlignedBB union(final AxisAlignedBB class6221) {
        return new AxisAlignedBB(Math.max(this.minX, class6221.minX), Math.max(this.minY, class6221.minY), Math.max(this.minZ, class6221.minZ), Math.min(this.maxX, class6221.maxX), Math.min(this.maxY, class6221.maxY), Math.min(this.maxZ, class6221.maxZ));
    }

    public AxisAlignedBB offset(final AxisAlignedBB class6221) {
        return new AxisAlignedBB(Math.min(this.minX, class6221.minX), Math.min(this.minY, class6221.minY), Math.min(this.minZ, class6221.minZ), Math.max(this.maxX, class6221.maxX), Math.max(this.maxY, class6221.maxY), Math.max(this.maxZ, class6221.maxZ));
    }

    public AxisAlignedBB offset(final double n, final double n2, final double n3) {
        return new AxisAlignedBB(this.minX + n, this.minY + n2, this.minZ + n3, this.maxX + n, this.maxY + n2, this.maxZ + n3);
    }

    public AxisAlignedBB offset(final BlockPos class354) {
        return new AxisAlignedBB(this.minX + class354.getX(), this.minY + class354.getY(), this.minZ + class354.getZ(), this.maxX + class354.getX(), this.maxY + class354.getY(), this.maxZ + class354.getZ());
    }

    public AxisAlignedBB offset(final Vec3d class5487) {
        return this.offset(class5487.x, class5487.y, class5487.z);
    }

    public boolean intersects(final AxisAlignedBB class6221) {
        return this.intersects(class6221.minX, class6221.minY, class6221.minZ, class6221.maxX, class6221.maxY, class6221.maxZ);
    }

    public boolean intersects(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        if (this.minX < n4) {
            if (this.maxX > n) {
                if (this.minY < n5) {
                    if (this.maxY > n2) {
                        if (this.minZ < n6) {
                            if (this.maxZ > n3) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean intersects(final Vec3d class5487, final Vec3d class5488) {
        return this.intersects(Math.min(class5487.x, class5488.x), Math.min(class5487.y, class5488.y), Math.min(class5487.z, class5488.z), Math.max(class5487.x, class5488.x), Math.max(class5487.y, class5488.y), Math.max(class5487.z, class5488.z));
    }

    public boolean contains(final Vec3d class5487) {
        return this.contains(class5487.x, class5487.y, class5487.z);
    }

    public boolean contains(final double n, final double n2, final double n3) {
        if (n >= this.minX) {
            if (n < this.maxX) {
                if (n2 >= this.minY) {
                    if (n2 < this.maxY) {
                        if (n3 >= this.minZ) {
                            if (n3 < this.maxZ) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public double getAverageEdgeLength() {
        return (this.getXSize() + this.getYSize() + this.getZSize()) / 3.0;
    }

    public double getXSize() {
        return this.maxX - this.minX;
    }

    public double getYSize() {
        return this.maxY - this.minY;
    }

    public double getZSize() {
        return this.maxZ - this.minZ;
    }

    public AxisAlignedBB shrink(final double n) {
        return this.intersect(-n);
    }

    public Optional<Vec3d> rayTrace(final Vec3d class5487, final Vec3d class5488) {
        final double[] array = { 1.0 };
        final double n = class5488.x - class5487.x;
        final double n2 = class5488.y - class5487.y;
        final double n3 = class5488.z - class5487.z;
        if (func_197741_a(this, class5487, array, null, n, n2, n3) != null) {
            final double n4 = array[0];
            return Optional.of(class5487.add(n4 * n, n4 * n2, n4 * n3));
        }
        return Optional.empty();
    }

    @Nullable
    public static BlockRayTraceResult rayTrace(final Iterable<AxisAlignedBB> iterable, final Vec3d class5487, final Vec3d class5488, final BlockPos class5489) {
        final double[] array = { 1.0 };
        Direction method18514 = null;
        final double n = class5488.x - class5487.x;
        final double n2 = class5488.y - class5487.y;
        final double n3 = class5488.z - class5487.z;
        final Iterator<AxisAlignedBB> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            method18514 = func_197741_a(iterator.next().offset(class5489), class5487, array, method18514, n, n2, n3);
        }
        if (method18514 != null) {
            final double n4 = array[0];
            return new BlockRayTraceResult(class5487.add(n4 * n, n4 * n2, n4 * n3), method18514, class5489, false);
        }
        return null;
    }

    @Nullable
    private static Direction func_197741_a(final AxisAlignedBB class6221, final Vec3d class6222, final double[] array, Direction class6223, final double n, final double n2, final double n3) {
        if (n <= 1.0E-7) {
            if (n < -1.0E-7) {
                class6223 = func_197740_a(array, class6223, n, n2, n3, class6221.maxX, class6221.minY, class6221.maxY, class6221.minZ, class6221.maxZ, Direction.EAST, class6222.x, class6222.y, class6222.z);
            }
        }
        else {
            class6223 = func_197740_a(array, class6223, n, n2, n3, class6221.minX, class6221.minY, class6221.maxY, class6221.minZ, class6221.maxZ, Direction.WEST, class6222.x, class6222.y, class6222.z);
        }
        if (n2 <= 1.0E-7) {
            if (n2 < -1.0E-7) {
                class6223 = func_197740_a(array, class6223, n2, n3, n, class6221.maxY, class6221.minZ, class6221.maxZ, class6221.minX, class6221.maxX, Direction.UP, class6222.y, class6222.z, class6222.x);
            }
        }
        else {
            class6223 = func_197740_a(array, class6223, n2, n3, n, class6221.minY, class6221.minZ, class6221.maxZ, class6221.minX, class6221.maxX, Direction.DOWN, class6222.y, class6222.z, class6222.x);
        }
        if (n3 <= 1.0E-7) {
            if (n3 < -1.0E-7) {
                class6223 = func_197740_a(array, class6223, n3, n, n2, class6221.maxZ, class6221.minX, class6221.maxX, class6221.minY, class6221.maxY, Direction.SOUTH, class6222.z, class6222.x, class6222.y);
            }
        }
        else {
            class6223 = func_197740_a(array, class6223, n3, n, n2, class6221.minZ, class6221.minX, class6221.maxX, class6221.minY, class6221.maxY, Direction.NORTH, class6222.z, class6222.x, class6222.y);
        }
        return class6223;
    }

    @Nullable
    private static Direction func_197740_a(final double[] array, final Direction class179, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final double n7, final double n8, final Direction class180, final double n9, final double n10, final double n11) {
        final double n12 = (n4 - n9) / n;
        final double n13 = n10 + n12 * n2;
        final double n14 = n11 + n12 * n3;
        if (0.0 < n12) {
            if (n12 < array[0]) {
                if (n5 - 1.0E-7 < n13) {
                    if (n13 < n6 + 1.0E-7) {
                        if (n7 - 1.0E-7 < n14) {
                            if (n14 < n8 + 1.0E-7) {
                                array[0] = n12;
                                return class180;
                            }
                        }
                    }
                }
            }
        }
        return class179;
    }

    @Override
    public String toString() {
        return "box[" + this.minX + ", " + this.minY + ", " + this.minZ + "] -> [" + this.maxX + ", " + this.maxY + ", " + this.maxZ + "]";
    }

    public boolean hasNaN() {
        if (!Double.isNaN(this.minX)) {
            if (!Double.isNaN(this.minY)) {
                if (!Double.isNaN(this.minZ)) {
                    if (!Double.isNaN(this.maxX)) {
                        if (!Double.isNaN(this.maxY)) {
                            if (!Double.isNaN(this.maxZ)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public Vec3d getCenter() {
        return new Vec3d(MathHelper.lerp(0.5, this.minX, this.maxX), MathHelper.lerp(0.5, this.minY, this.maxY), MathHelper.lerp(0.5, this.minZ, this.maxZ));
    }
}
