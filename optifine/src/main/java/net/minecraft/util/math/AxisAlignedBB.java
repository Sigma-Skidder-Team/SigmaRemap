package net.minecraft.util.math;

import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.util.Direction;

public class AxisAlignedBB
{
    public final double minX;
    public final double minY;
    public final double minZ;
    public final double maxX;
    public final double maxY;
    public final double maxZ;

    public AxisAlignedBB(double p_i4205_1_, double p_i4205_3_, double p_i4205_5_, double p_i4205_7_, double p_i4205_9_, double p_i4205_11_)
    {
        this.minX = Math.min(p_i4205_1_, p_i4205_7_);
        this.minY = Math.min(p_i4205_3_, p_i4205_9_);
        this.minZ = Math.min(p_i4205_5_, p_i4205_11_);
        this.maxX = Math.max(p_i4205_1_, p_i4205_7_);
        this.maxY = Math.max(p_i4205_3_, p_i4205_9_);
        this.maxZ = Math.max(p_i4205_5_, p_i4205_11_);
    }

    public AxisAlignedBB(BlockPos p_i4206_1_)
    {
        this((double)p_i4206_1_.getX(), (double)p_i4206_1_.getY(), (double)p_i4206_1_.getZ(), (double)(p_i4206_1_.getX() + 1), (double)(p_i4206_1_.getY() + 1), (double)(p_i4206_1_.getZ() + 1));
    }

    public AxisAlignedBB(BlockPos p_i4207_1_, BlockPos p_i4207_2_)
    {
        this((double)p_i4207_1_.getX(), (double)p_i4207_1_.getY(), (double)p_i4207_1_.getZ(), (double)p_i4207_2_.getX(), (double)p_i4207_2_.getY(), (double)p_i4207_2_.getZ());
    }

    public AxisAlignedBB(Vec3d p_i4208_1_, Vec3d p_i4208_2_)
    {
        this(p_i4208_1_.x, p_i4208_1_.y, p_i4208_1_.z, p_i4208_2_.x, p_i4208_2_.y, p_i4208_2_.z);
    }

    public static AxisAlignedBB toImmutable(MutableBoundingBox p_216363_0_)
    {
        return new AxisAlignedBB((double)p_216363_0_.minX, (double)p_216363_0_.minY, (double)p_216363_0_.minZ, (double)(p_216363_0_.maxX + 1), (double)(p_216363_0_.maxY + 1), (double)(p_216363_0_.maxZ + 1));
    }

    public double getMin(Direction.Axis axis)
    {
        return axis.getCoordinate(this.minX, this.minY, this.minZ);
    }

    public double getMax(Direction.Axis axis)
    {
        return axis.getCoordinate(this.maxX, this.maxY, this.maxZ);
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else if (!(p_equals_1_ instanceof AxisAlignedBB))
        {
            return false;
        }
        else
        {
            AxisAlignedBB axisalignedbb = (AxisAlignedBB)p_equals_1_;

            if (Double.compare(axisalignedbb.minX, this.minX) != 0)
            {
                return false;
            }
            else if (Double.compare(axisalignedbb.minY, this.minY) != 0)
            {
                return false;
            }
            else if (Double.compare(axisalignedbb.minZ, this.minZ) != 0)
            {
                return false;
            }
            else if (Double.compare(axisalignedbb.maxX, this.maxX) != 0)
            {
                return false;
            }
            else if (Double.compare(axisalignedbb.maxY, this.maxY) != 0)
            {
                return false;
            }
            else
            {
                return Double.compare(axisalignedbb.maxZ, this.maxZ) == 0;
            }
        }
    }

    public int hashCode()
    {
        long i = Double.doubleToLongBits(this.minX);
        int j = (int)(i ^ i >>> 32);
        i = Double.doubleToLongBits(this.minY);
        j = 31 * j + (int)(i ^ i >>> 32);
        i = Double.doubleToLongBits(this.minZ);
        j = 31 * j + (int)(i ^ i >>> 32);
        i = Double.doubleToLongBits(this.maxX);
        j = 31 * j + (int)(i ^ i >>> 32);
        i = Double.doubleToLongBits(this.maxY);
        j = 31 * j + (int)(i ^ i >>> 32);
        i = Double.doubleToLongBits(this.maxZ);
        j = 31 * j + (int)(i ^ i >>> 32);
        return j;
    }

    public AxisAlignedBB contract(double x, double y, double z)
    {
        double d0 = this.minX;
        double d1 = this.minY;
        double d2 = this.minZ;
        double d3 = this.maxX;
        double d4 = this.maxY;
        double d5 = this.maxZ;

        if (x < 0.0D)
        {
            d0 -= x;
        }
        else if (x > 0.0D)
        {
            d3 -= x;
        }

        if (y < 0.0D)
        {
            d1 -= y;
        }
        else if (y > 0.0D)
        {
            d4 -= y;
        }

        if (z < 0.0D)
        {
            d2 -= z;
        }
        else if (z > 0.0D)
        {
            d5 -= z;
        }

        return new AxisAlignedBB(d0, d1, d2, d3, d4, d5);
    }

    public AxisAlignedBB expand(Vec3d p_216361_1_)
    {
        return this.expand(p_216361_1_.x, p_216361_1_.y, p_216361_1_.z);
    }

    public AxisAlignedBB expand(double x, double y, double z)
    {
        double d0 = this.minX;
        double d1 = this.minY;
        double d2 = this.minZ;
        double d3 = this.maxX;
        double d4 = this.maxY;
        double d5 = this.maxZ;

        if (x < 0.0D)
        {
            d0 += x;
        }
        else if (x > 0.0D)
        {
            d3 += x;
        }

        if (y < 0.0D)
        {
            d1 += y;
        }
        else if (y > 0.0D)
        {
            d4 += y;
        }

        if (z < 0.0D)
        {
            d2 += z;
        }
        else if (z > 0.0D)
        {
            d5 += z;
        }

        return new AxisAlignedBB(d0, d1, d2, d3, d4, d5);
    }

    public AxisAlignedBB grow(double x, double y, double z)
    {
        double d0 = this.minX - x;
        double d1 = this.minY - y;
        double d2 = this.minZ - z;
        double d3 = this.maxX + x;
        double d4 = this.maxY + y;
        double d5 = this.maxZ + z;
        return new AxisAlignedBB(d0, d1, d2, d3, d4, d5);
    }

    public AxisAlignedBB grow(double value)
    {
        return this.grow(value, value, value);
    }

    public AxisAlignedBB intersect(AxisAlignedBB other)
    {
        double d0 = Math.max(this.minX, other.minX);
        double d1 = Math.max(this.minY, other.minY);
        double d2 = Math.max(this.minZ, other.minZ);
        double d3 = Math.min(this.maxX, other.maxX);
        double d4 = Math.min(this.maxY, other.maxY);
        double d5 = Math.min(this.maxZ, other.maxZ);
        return new AxisAlignedBB(d0, d1, d2, d3, d4, d5);
    }

    public AxisAlignedBB union(AxisAlignedBB other)
    {
        double d0 = Math.min(this.minX, other.minX);
        double d1 = Math.min(this.minY, other.minY);
        double d2 = Math.min(this.minZ, other.minZ);
        double d3 = Math.max(this.maxX, other.maxX);
        double d4 = Math.max(this.maxY, other.maxY);
        double d5 = Math.max(this.maxZ, other.maxZ);
        return new AxisAlignedBB(d0, d1, d2, d3, d4, d5);
    }

    public AxisAlignedBB offset(double x, double y, double z)
    {
        return new AxisAlignedBB(this.minX + x, this.minY + y, this.minZ + z, this.maxX + x, this.maxY + y, this.maxZ + z);
    }

    public AxisAlignedBB offset(BlockPos pos)
    {
        return new AxisAlignedBB(this.minX + (double)pos.getX(), this.minY + (double)pos.getY(), this.minZ + (double)pos.getZ(), this.maxX + (double)pos.getX(), this.maxY + (double)pos.getY(), this.maxZ + (double)pos.getZ());
    }

    public AxisAlignedBB offset(Vec3d vec)
    {
        return this.offset(vec.x, vec.y, vec.z);
    }

    public boolean intersects(AxisAlignedBB other)
    {
        return this.intersects(other.minX, other.minY, other.minZ, other.maxX, other.maxY, other.maxZ);
    }

    public boolean intersects(double x1, double y1, double z1, double x2, double y2, double z2)
    {
        return this.minX < x2 && this.maxX > x1 && this.minY < y2 && this.maxY > y1 && this.minZ < z2 && this.maxZ > z1;
    }

    public boolean intersects(Vec3d min, Vec3d max)
    {
        return this.intersects(Math.min(min.x, max.x), Math.min(min.y, max.y), Math.min(min.z, max.z), Math.max(min.x, max.x), Math.max(min.y, max.y), Math.max(min.z, max.z));
    }

    public boolean contains(Vec3d vec)
    {
        return this.contains(vec.x, vec.y, vec.z);
    }

    public boolean contains(double x, double y, double z)
    {
        return x >= this.minX && x < this.maxX && y >= this.minY && y < this.maxY && z >= this.minZ && z < this.maxZ;
    }

    public double getAverageEdgeLength()
    {
        double d0 = this.getXSize();
        double d1 = this.getYSize();
        double d2 = this.getZSize();
        return (d0 + d1 + d2) / 3.0D;
    }

    public double getXSize()
    {
        return this.maxX - this.minX;
    }

    public double getYSize()
    {
        return this.maxY - this.minY;
    }

    public double getZSize()
    {
        return this.maxZ - this.minZ;
    }

    public AxisAlignedBB shrink(double value)
    {
        return this.grow(-value);
    }

    public Optional<Vec3d> rayTrace(Vec3d p_216365_1_, Vec3d p_216365_2_)
    {
        double[] adouble = new double[] {1.0D};
        double d0 = p_216365_2_.x - p_216365_1_.x;
        double d1 = p_216365_2_.y - p_216365_1_.y;
        double d2 = p_216365_2_.z - p_216365_1_.z;
        Direction direction = func_197741_a(this, p_216365_1_, adouble, (Direction)null, d0, d1, d2);

        if (direction == null)
        {
            return Optional.empty();
        }
        else
        {
            double d3 = adouble[0];
            return Optional.of(p_216365_1_.add(d3 * d0, d3 * d1, d3 * d2));
        }
    }

    @Nullable
    public static BlockRayTraceResult rayTrace(Iterable<AxisAlignedBB> boxes, Vec3d start, Vec3d end, BlockPos pos)
    {
        double[] adouble = new double[] {1.0D};
        Direction direction = null;
        double d0 = end.x - start.x;
        double d1 = end.y - start.y;
        double d2 = end.z - start.z;

        for (AxisAlignedBB axisalignedbb : boxes)
        {
            direction = func_197741_a(axisalignedbb.offset(pos), start, adouble, direction, d0, d1, d2);
        }

        if (direction == null)
        {
            return null;
        }
        else
        {
            double d3 = adouble[0];
            return new BlockRayTraceResult(start.add(d3 * d0, d3 * d1, d3 * d2), direction, pos, false);
        }
    }

    @Nullable
    private static Direction func_197741_a(AxisAlignedBB aabb, Vec3d p_197741_1_, double[] p_197741_2_, @Nullable Direction facing, double p_197741_4_, double p_197741_6_, double p_197741_8_)
    {
        if (p_197741_4_ > 1.0E-7D)
        {
            facing = func_197740_a(p_197741_2_, facing, p_197741_4_, p_197741_6_, p_197741_8_, aabb.minX, aabb.minY, aabb.maxY, aabb.minZ, aabb.maxZ, Direction.WEST, p_197741_1_.x, p_197741_1_.y, p_197741_1_.z);
        }
        else if (p_197741_4_ < -1.0E-7D)
        {
            facing = func_197740_a(p_197741_2_, facing, p_197741_4_, p_197741_6_, p_197741_8_, aabb.maxX, aabb.minY, aabb.maxY, aabb.minZ, aabb.maxZ, Direction.EAST, p_197741_1_.x, p_197741_1_.y, p_197741_1_.z);
        }

        if (p_197741_6_ > 1.0E-7D)
        {
            facing = func_197740_a(p_197741_2_, facing, p_197741_6_, p_197741_8_, p_197741_4_, aabb.minY, aabb.minZ, aabb.maxZ, aabb.minX, aabb.maxX, Direction.DOWN, p_197741_1_.y, p_197741_1_.z, p_197741_1_.x);
        }
        else if (p_197741_6_ < -1.0E-7D)
        {
            facing = func_197740_a(p_197741_2_, facing, p_197741_6_, p_197741_8_, p_197741_4_, aabb.maxY, aabb.minZ, aabb.maxZ, aabb.minX, aabb.maxX, Direction.UP, p_197741_1_.y, p_197741_1_.z, p_197741_1_.x);
        }

        if (p_197741_8_ > 1.0E-7D)
        {
            facing = func_197740_a(p_197741_2_, facing, p_197741_8_, p_197741_4_, p_197741_6_, aabb.minZ, aabb.minX, aabb.maxX, aabb.minY, aabb.maxY, Direction.NORTH, p_197741_1_.z, p_197741_1_.x, p_197741_1_.y);
        }
        else if (p_197741_8_ < -1.0E-7D)
        {
            facing = func_197740_a(p_197741_2_, facing, p_197741_8_, p_197741_4_, p_197741_6_, aabb.maxZ, aabb.minX, aabb.maxX, aabb.minY, aabb.maxY, Direction.SOUTH, p_197741_1_.z, p_197741_1_.x, p_197741_1_.y);
        }

        return facing;
    }

    @Nullable
    private static Direction func_197740_a(double[] p_197740_0_, @Nullable Direction p_197740_1_, double p_197740_2_, double p_197740_4_, double p_197740_6_, double p_197740_8_, double p_197740_10_, double p_197740_12_, double p_197740_14_, double p_197740_16_, Direction p_197740_18_, double p_197740_19_, double p_197740_21_, double p_197740_23_)
    {
        double d0 = (p_197740_8_ - p_197740_19_) / p_197740_2_;
        double d1 = p_197740_21_ + d0 * p_197740_4_;
        double d2 = p_197740_23_ + d0 * p_197740_6_;

        if (0.0D < d0 && d0 < p_197740_0_[0] && p_197740_10_ - 1.0E-7D < d1 && d1 < p_197740_12_ + 1.0E-7D && p_197740_14_ - 1.0E-7D < d2 && d2 < p_197740_16_ + 1.0E-7D)
        {
            p_197740_0_[0] = d0;
            return p_197740_18_;
        }
        else
        {
            return p_197740_1_;
        }
    }

    public String toString()
    {
        return "box[" + this.minX + ", " + this.minY + ", " + this.minZ + "] -> [" + this.maxX + ", " + this.maxY + ", " + this.maxZ + "]";
    }

    public boolean hasNaN()
    {
        return Double.isNaN(this.minX) || Double.isNaN(this.minY) || Double.isNaN(this.minZ) || Double.isNaN(this.maxX) || Double.isNaN(this.maxY) || Double.isNaN(this.maxZ);
    }

    public Vec3d getCenter()
    {
        return new Vec3d(MathHelper.lerp(0.5D, this.minX, this.maxX), MathHelper.lerp(0.5D, this.minY, this.maxY), MathHelper.lerp(0.5D, this.minZ, this.maxZ));
    }
}
