// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.MoreObjects;
import net.minecraft.nbt.IntArrayNBT;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.Vec3i;

public class MutableBoundingBox
{
    public int minX;
    public int minY;
    public int minZ;
    public int maxX;
    public int maxY;
    public int maxZ;
    
    public MutableBoundingBox() {
    }
    
    public MutableBoundingBox(final int[] array) {
        if (array.length == 6) {
            this.minX = array[0];
            this.minY = array[1];
            this.minZ = array[2];
            this.maxX = array[3];
            this.maxY = array[4];
            this.maxZ = array[5];
        }
    }
    
    public static MutableBoundingBox getNewBoundingBox() {
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
    
    public static MutableBoundingBox createProper(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return new MutableBoundingBox(Math.min(n, n4), Math.min(n2, n5), Math.min(n3, n6), Math.max(n, n4), Math.max(n2, n5), Math.max(n3, n6));
    }
    
    public MutableBoundingBox(final MutableBoundingBox class6997) {
        this.minX = class6997.minX;
        this.minY = class6997.minY;
        this.minZ = class6997.minZ;
        this.maxX = class6997.maxX;
        this.maxY = class6997.maxY;
        this.maxZ = class6997.maxZ;
    }
    
    public MutableBoundingBox(final int field27293, final int field27294, final int field27295, final int field27296, final int field27297, final int field27298) {
        this.minX = field27293;
        this.minY = field27294;
        this.minZ = field27295;
        this.maxX = field27296;
        this.maxY = field27297;
        this.maxZ = field27298;
    }
    
    public MutableBoundingBox(final Vec3i class352, final Vec3i class353) {
        this.minX = Math.min(class352.getX(), class353.getX());
        this.minY = Math.min(class352.getY(), class353.getY());
        this.minZ = Math.min(class352.getZ(), class353.getZ());
        this.maxX = Math.max(class352.getX(), class353.getX());
        this.maxY = Math.max(class352.getY(), class353.getY());
        this.maxZ = Math.max(class352.getZ(), class353.getZ());
    }
    
    public MutableBoundingBox(final int field27293, final int field27294, final int field27295, final int field27296) {
        this.minX = field27293;
        this.minZ = field27294;
        this.maxX = field27295;
        this.maxZ = field27296;
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
    
    public void expandTo(final MutableBoundingBox class6997) {
        this.minX = Math.min(this.minX, class6997.minX);
        this.minY = Math.min(this.minY, class6997.minY);
        this.minZ = Math.min(this.minZ, class6997.minZ);
        this.maxX = Math.max(this.maxX, class6997.maxX);
        this.maxY = Math.max(this.maxY, class6997.maxY);
        this.maxZ = Math.max(this.maxZ, class6997.maxZ);
    }
    
    public void offset(final int n, final int n2, final int n3) {
        this.minX += n;
        this.minY += n2;
        this.minZ += n3;
        this.maxX += n;
        this.maxY += n2;
        this.maxZ += n3;
    }
    
    public MutableBoundingBox func_215127_b(final int n, final int n2, final int n3) {
        return new MutableBoundingBox(this.minX + n, this.minY + n2, this.minZ + n3, this.maxX + n, this.maxY + n2, this.maxZ + n3);
    }

    public boolean isVecInside(Vec3i vec)
    {
        return vec.getX() >= this.minX && vec.getX() <= this.maxX && vec.getZ() >= this.minZ && vec.getZ() <= this.maxZ && vec.getY() >= this.minY && vec.getY() <= this.maxY;
    }

    public Vec3i getLength()
    {
        return new Vec3i(this.maxX - this.minX, this.maxY - this.minY, this.maxZ - this.minZ);
    }
    
    public int getXSize() {
        return this.maxX - this.minX + 1;
    }
    
    public int getYSize() {
        return this.maxY - this.minY + 1;
    }
    
    public int getZSize() {
        return this.maxZ - this.minZ + 1;
    }
    
    public Vec3i func_215126_f() {
        return new BlockPos(this.minX + (this.maxX - this.minX + 1) / 2, this.minY + (this.maxY - this.minY + 1) / 2, this.minZ + (this.maxZ - this.minZ + 1) / 2);
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("x0", this.minX).add("y0", this.minY).add("z0", this.minZ).add("x1", this.maxX).add("y1", this.maxY).add("z1", this.maxZ).toString();
    }
    
    public IntArrayNBT toNBTTagIntArray() {
        return new IntArrayNBT(new int[] { this.minX, this.minY, this.minZ, this.maxX, this.maxY, this.maxZ});
    }
}
