package net.minecraft.util.math;

import com.google.common.base.MoreObjects;
import net.minecraft.nbt.IntArrayNBT;
import net.minecraft.util.Direction;

public class MutableBoundingBox
{
    public int minX;
    public int minY;
    public int minZ;
    public int maxX;
    public int maxY;
    public int maxZ;

    public MutableBoundingBox()
    {
    }

    public MutableBoundingBox(int[] p_i2853_1_)
    {
        if (p_i2853_1_.length == 6)
        {
            this.minX = p_i2853_1_[0];
            this.minY = p_i2853_1_[1];
            this.minZ = p_i2853_1_[2];
            this.maxX = p_i2853_1_[3];
            this.maxY = p_i2853_1_[4];
            this.maxZ = p_i2853_1_[5];
        }
    }

    public static MutableBoundingBox getNewBoundingBox()
    {
        return new MutableBoundingBox(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public static MutableBoundingBox getComponentToAddBoundingBox(int structureMinX, int structureMinY, int structureMinZ, int xMin, int yMin, int zMin, int xMax, int yMax, int zMax, Direction facing)
    {
        switch (facing)
        {
            case NORTH:
                return new MutableBoundingBox(structureMinX + xMin, structureMinY + yMin, structureMinZ - zMax + 1 + zMin, structureMinX + xMax - 1 + xMin, structureMinY + yMax - 1 + yMin, structureMinZ + zMin);

            case SOUTH:
                return new MutableBoundingBox(structureMinX + xMin, structureMinY + yMin, structureMinZ + zMin, structureMinX + xMax - 1 + xMin, structureMinY + yMax - 1 + yMin, structureMinZ + zMax - 1 + zMin);

            case WEST:
                return new MutableBoundingBox(structureMinX - zMax + 1 + zMin, structureMinY + yMin, structureMinZ + xMin, structureMinX + zMin, structureMinY + yMax - 1 + yMin, structureMinZ + xMax - 1 + xMin);

            case EAST:
                return new MutableBoundingBox(structureMinX + zMin, structureMinY + yMin, structureMinZ + xMin, structureMinX + zMax - 1 + zMin, structureMinY + yMax - 1 + yMin, structureMinZ + xMax - 1 + xMin);

            default:
                return new MutableBoundingBox(structureMinX + xMin, structureMinY + yMin, structureMinZ + zMin, structureMinX + xMax - 1 + xMin, structureMinY + yMax - 1 + yMin, structureMinZ + zMax - 1 + zMin);
        }
    }

    public static MutableBoundingBox createProper(int x1, int y1, int z1, int x2, int y2, int z2)
    {
        return new MutableBoundingBox(Math.min(x1, x2), Math.min(y1, y2), Math.min(z1, z2), Math.max(x1, x2), Math.max(y1, y2), Math.max(z1, z2));
    }

    public MutableBoundingBox(MutableBoundingBox p_i2854_1_)
    {
        this.minX = p_i2854_1_.minX;
        this.minY = p_i2854_1_.minY;
        this.minZ = p_i2854_1_.minZ;
        this.maxX = p_i2854_1_.maxX;
        this.maxY = p_i2854_1_.maxY;
        this.maxZ = p_i2854_1_.maxZ;
    }

    public MutableBoundingBox(int p_i2855_1_, int p_i2855_2_, int p_i2855_3_, int p_i2855_4_, int p_i2855_5_, int p_i2855_6_)
    {
        this.minX = p_i2855_1_;
        this.minY = p_i2855_2_;
        this.minZ = p_i2855_3_;
        this.maxX = p_i2855_4_;
        this.maxY = p_i2855_5_;
        this.maxZ = p_i2855_6_;
    }

    public MutableBoundingBox(Vec3i p_i2856_1_, Vec3i p_i2856_2_)
    {
        this.minX = Math.min(p_i2856_1_.getX(), p_i2856_2_.getX());
        this.minY = Math.min(p_i2856_1_.getY(), p_i2856_2_.getY());
        this.minZ = Math.min(p_i2856_1_.getZ(), p_i2856_2_.getZ());
        this.maxX = Math.max(p_i2856_1_.getX(), p_i2856_2_.getX());
        this.maxY = Math.max(p_i2856_1_.getY(), p_i2856_2_.getY());
        this.maxZ = Math.max(p_i2856_1_.getZ(), p_i2856_2_.getZ());
    }

    public MutableBoundingBox(int p_i2857_1_, int p_i2857_2_, int p_i2857_3_, int p_i2857_4_)
    {
        this.minX = p_i2857_1_;
        this.minZ = p_i2857_2_;
        this.maxX = p_i2857_3_;
        this.maxZ = p_i2857_4_;
        this.minY = 1;
        this.maxY = 512;
    }

    public boolean intersectsWith(MutableBoundingBox structurebb)
    {
        return this.maxX >= structurebb.minX && this.minX <= structurebb.maxX && this.maxZ >= structurebb.minZ && this.minZ <= structurebb.maxZ && this.maxY >= structurebb.minY && this.minY <= structurebb.maxY;
    }

    public boolean intersectsWith(int minXIn, int minZIn, int maxXIn, int maxZIn)
    {
        return this.maxX >= minXIn && this.minX <= maxXIn && this.maxZ >= minZIn && this.minZ <= maxZIn;
    }

    public void expandTo(MutableBoundingBox sbb)
    {
        this.minX = Math.min(this.minX, sbb.minX);
        this.minY = Math.min(this.minY, sbb.minY);
        this.minZ = Math.min(this.minZ, sbb.minZ);
        this.maxX = Math.max(this.maxX, sbb.maxX);
        this.maxY = Math.max(this.maxY, sbb.maxY);
        this.maxZ = Math.max(this.maxZ, sbb.maxZ);
    }

    public void offset(int x, int y, int z)
    {
        this.minX += x;
        this.minY += y;
        this.minZ += z;
        this.maxX += x;
        this.maxY += y;
        this.maxZ += z;
    }

    public MutableBoundingBox func_215127_b(int p_215127_1_, int p_215127_2_, int p_215127_3_)
    {
        return new MutableBoundingBox(this.minX + p_215127_1_, this.minY + p_215127_2_, this.minZ + p_215127_3_, this.maxX + p_215127_1_, this.maxY + p_215127_2_, this.maxZ + p_215127_3_);
    }

    public boolean isVecInside(Vec3i vec)
    {
        return vec.getX() >= this.minX && vec.getX() <= this.maxX && vec.getZ() >= this.minZ && vec.getZ() <= this.maxZ && vec.getY() >= this.minY && vec.getY() <= this.maxY;
    }

    public Vec3i getLength()
    {
        return new Vec3i(this.maxX - this.minX, this.maxY - this.minY, this.maxZ - this.minZ);
    }

    public int getXSize()
    {
        return this.maxX - this.minX + 1;
    }

    public int getYSize()
    {
        return this.maxY - this.minY + 1;
    }

    public int getZSize()
    {
        return this.maxZ - this.minZ + 1;
    }

    public Vec3i func_215126_f()
    {
        return new BlockPos(this.minX + (this.maxX - this.minX + 1) / 2, this.minY + (this.maxY - this.minY + 1) / 2, this.minZ + (this.maxZ - this.minZ + 1) / 2);
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("x0", this.minX).add("y0", this.minY).add("z0", this.minZ).add("x1", this.maxX).add("y1", this.maxY).add("z1", this.maxZ).toString();
    }

    public IntArrayNBT toNBTTagIntArray()
    {
        return new IntArrayNBT(new int[] {this.minX, this.minY, this.minZ, this.maxX, this.maxY, this.maxZ});
    }
}
