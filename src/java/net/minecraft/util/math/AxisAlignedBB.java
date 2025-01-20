package net.minecraft.util.math;

import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3d;

import java.util.Optional;
import javax.annotation.Nullable;

public class AxisAlignedBB {
   public final double minX;
   public final double minY;
   public final double minZ;
   public final double maxX;
   public final double maxY;
   public final double maxZ;

   public AxisAlignedBB(double x1, double y1, double z1, double x2, double y2, double z2)
   {
      this.minX = Math.min(x1, x2);
      this.minY = Math.min(y1, y2);
      this.minZ = Math.min(z1, z2);
      this.maxX = Math.max(x1, x2);
      this.maxY = Math.max(y1, y2);
      this.maxZ = Math.max(z1, z2);
   }

   public AxisAlignedBB(BlockPos pos)
   {
      this((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (double)(pos.getX() + 1), (double)(pos.getY() + 1), (double)(pos.getZ() + 1));
   }

   public AxisAlignedBB(BlockPos pos1, BlockPos pos2)
   {
      this((double)pos1.getX(), (double)pos1.getY(), (double)pos1.getZ(), (double)pos2.getX(), (double)pos2.getY(), (double)pos2.getZ());
   }

   public AxisAlignedBB(Vector3d min, Vector3d max)
   {
      this(min.x, min.y, min.z, max.x, max.y, max.z);
   }

   public static AxisAlignedBB toImmutable(MutableBoundingBox mutableBox) {
      return new AxisAlignedBB(
         (double)mutableBox.minX,
         (double)mutableBox.minY,
         (double)mutableBox.minZ,
         (double)(mutableBox.maxX + 1),
         (double)(mutableBox.maxY + 1),
         (double)(mutableBox.maxZ + 1)
      );
   }

   public static AxisAlignedBB fromVector(Vector3d vector) {
      return new AxisAlignedBB(vector.x, vector.y, vector.z, vector.x + 1.0, vector.y + 1.0, vector.z + 1.0);
   }

   public double getMin(Direction.Axis axis) {
      return axis.getCoordinate(this.minX, this.minY, this.minZ);
   }

   public double getMax(Direction.Axis axis) {
      return axis.getCoordinate(this.maxX, this.maxY, this.maxZ);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof AxisAlignedBB) {
            AxisAlignedBB var4 = (AxisAlignedBB)var1;
            if (Double.compare(var4.minX, this.minX) == 0) {
               if (Double.compare(var4.minY, this.minY) == 0) {
                  if (Double.compare(var4.minZ, this.minZ) == 0) {
                     if (Double.compare(var4.maxX, this.maxX) == 0) {
                        return Double.compare(var4.maxY, this.maxY) == 0 ? Double.compare(var4.maxZ, this.maxZ) == 0 : false;
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      long var3 = Double.doubleToLongBits(this.minX);
      int var5 = (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.minY);
      var5 = 31 * var5 + (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.minZ);
      var5 = 31 * var5 + (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.maxX);
      var5 = 31 * var5 + (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.maxY);
      var5 = 31 * var5 + (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.maxZ);
      return 31 * var5 + (int)(var3 ^ var3 >>> 32);
   }

   /**
    * Creates a new {@link AxisAlignedBB} that has been contracted by the given amount, with positive changes
    * decreasing max values and negative changes increasing min values.
    * <br/>
    * If the amount to contract by is larger than the length of a side, then the side will wrap (still creating a valid
    * AABB - see last sample).
    *
    * <h3>Samples:</h3>
    * <table>
    * <tr><th>Input</th><th>Result</th></tr>
    * <tr><td><pre><code>new AxisAlignedBB(0, 0, 0, 4, 4, 4).contract(2, 2, 2)</code></pre></td><td><pre><samp>box[0.0,
    * 0.0, 0.0 -> 2.0, 2.0, 2.0]</samp></pre></td></tr>
    * <tr><td><pre><code>new AxisAlignedBB(0, 0, 0, 4, 4, 4).contract(-2, -2,
    * -2)</code></pre></td><td><pre><samp>box[2.0, 2.0, 2.0 -> 4.0, 4.0, 4.0]</samp></pre></td></tr>
    * <tr><td><pre><code>new AxisAlignedBB(5, 5, 5, 7, 7, 7).contract(0, 1,
    * -1)</code></pre></td><td><pre><samp>box[5.0, 5.0, 6.0 -> 7.0, 6.0, 7.0]</samp></pre></td></tr>
    * <tr><td><pre><code>new AxisAlignedBB(-2, -2, -2, 2, 2, 2).contract(4, -4,
    * 0)</code></pre></td><td><pre><samp>box[-8.0, 2.0, -2.0 -> -2.0, 8.0, 2.0]</samp></pre></td></tr>
    * </table>
    *
    * <h3>See Also:</h3>
    * <ul>
    * <li>{@link #expand(double, double, double)} - like this, except for expanding.</li>
    * <li>{@link #grow(double, double, double)} and {@link #grow(double)} - expands in all directions.</li>
    * <li>{@link #shrink(double)} - contracts in all directions (like {@link #grow(double)})</li>
    * </ul>
    *
    * @return A new modified bounding box.
    */
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


   public AxisAlignedBB expand(Vector3d var1) {
      return this.expand(var1.x, var1.y, var1.z);
   }

   /**
    * Creates a new {@link AxisAlignedBB} that has been expanded by the given amount, with positive changes increasing
    * max values and negative changes decreasing min values.

    * <h3>Samples:</h3>
    * <table>
    * <tr><th>Input</th><th>Result</th></tr>
    * <tr><td><pre><code>new AxisAlignedBB(0, 0, 0, 1, 1, 1).expand(2, 2, 2)</code></pre></td><td><pre><samp>box[0, 0,
    * 0 -> 3, 3, 3]</samp></pre></td><td>
    * <tr><td><pre><code>new AxisAlignedBB(0, 0, 0, 1, 1, 1).expand(-2, -2, -2)</code></pre></td><td><pre><samp>box[-2,
    * -2, -2 -> 1, 1, 1]</samp></pre></td><td>
    * <tr><td><pre><code>new AxisAlignedBB(5, 5, 5, 7, 7, 7).expand(0, 1, -1)</code></pre></td><td><pre><samp>box[5, 5,
    * 4, 7, 8, 7]</samp></pre></td><td>
    * </table>

    * <h3>See Also:</h3>
    * <ul>
    * <li>{@link #contract(double, double, double)} - like this, except for shrinking.</li>
    * <li>{@link #grow(double, double, double)} and {@link #grow(double)} - expands in all directions.</li>
    * <li>{@link #shrink(double)} - contracts in all directions (like {@link #grow(double)})</li>
    * </ul>

    * @return A modified bounding box that will always be equal or greater in volume to this bounding box.
    */
   public AxisAlignedBB expand(double x, double y, double z) {
      double var9 = this.minX;
      double var11 = this.minY;
      double var13 = this.minZ;
      double var15 = this.maxX;
      double var17 = this.maxY;
      double var19 = this.maxZ;
      if (!(x < 0.0)) {
         if (x > 0.0) {
            var15 += x;
         }
      } else {
         var9 += x;
      }

      if (!(y < 0.0)) {
         if (y > 0.0) {
            var17 += y;
         }
      } else {
         var11 += y;
      }

      if (!(z < 0.0)) {
         if (z > 0.0) {
            var19 += z;
         }
      } else {
         var13 += z;
      }

      return new AxisAlignedBB(var9, var11, var13, var15, var17, var19);
   }

   /**
    * Creates a new {@link AxisAlignedBB} that has been contracted by the given amount in both directions. Negative
    * values will shrink the AABB instead of expanding it.
    * <br/>
    * Side lengths will be increased by 2 times the value of the parameters, since both min and max are changed.
    * <br/>
    * If contracting and the amount to contract by is larger than the length of a side, then the side will wrap (still
    * creating a valid AABB - see last ample).
    *
    * <h3>Samples:</h3>
    * <table>
    * <tr><th>Input</th><th>Result</th></tr>
    * <tr><td><pre><code>new AxisAlignedBB(0, 0, 0, 1, 1, 1).grow(2, 2, 2)</code></pre></td><td><pre><samp>box[-2.0,
    * -2.0, -2.0 -> 3.0, 3.0, 3.0]</samp></pre></td></tr>
    * <tr><td><pre><code>new AxisAlignedBB(0, 0, 0, 6, 6, 6).grow(-2, -2, -2)</code></pre></td><td><pre><samp>box[2.0,
    * 2.0, 2.0 -> 4.0, 4.0, 4.0]</samp></pre></td></tr>
    * <tr><td><pre><code>new AxisAlignedBB(5, 5, 5, 7, 7, 7).grow(0, 1, -1)</code></pre></td><td><pre><samp>box[5.0,
    * 4.0, 6.0 -> 7.0, 8.0, 6.0]</samp></pre></td></tr>
    * <tr><td><pre><code>new AxisAlignedBB(1, 1, 1, 3, 3, 3).grow(-4, -2, -3)</code></pre></td><td><pre><samp>box[-1.0,
    * 1.0, 0.0 -> 5.0, 3.0, 4.0]</samp></pre></td></tr>
    * </table>
    *
    * <h3>See Also:</h3>
    * <ul>
    * <li>{@link #expand(double, double, double)} - expands in only one direction.</li>
    * <li>{@link #contract(double, double, double)} - contracts in only one direction.</li>
    * <lu>{@link #grow(double)} - version of this that expands in all directions from one parameter.</li>
    * <li>{@link #shrink(double)} - contracts in all directions</li>
    * </ul>
    *
    * @return A modified bounding box.
    */
   public AxisAlignedBB grow(double x, double y, double z) {
      double var9 = this.minX - x;
      double var11 = this.minY - y;
      double var13 = this.minZ - z;
      double var15 = this.maxX + x;
      double var17 = this.maxY + y;
      double var19 = this.maxZ + z;
      return new AxisAlignedBB(var9, var11, var13, var15, var17, var19);
   }

   /**
    * Creates a new {@link AxisAlignedBB} that is expanded by the given value in all directions. Equivalent to {@link
    * #grow(double, double, double)} with the given value for all 3 params. Negative values will shrink the AABB.
    * <br/>
    * Side lengths will be increased by 2 times the value of the parameter, since both min and max are changed.
    * <br/>
    * If contracting and the amount to contract by is larger than the length of a side, then the side will wrap (still
    * creating a valid AABB - see samples on {@link #grow(double, double, double)}).
    *
    * @return A modified AABB.
    */
   public AxisAlignedBB grow(double value) {
      return this.grow(value, value, value);
   }

   public AxisAlignedBB intersect(AxisAlignedBB other) {
      double var4 = Math.max(this.minX, other.minX);
      double var6 = Math.max(this.minY, other.minY);
      double var8 = Math.max(this.minZ, other.minZ);
      double var10 = Math.min(this.maxX, other.maxX);
      double var12 = Math.min(this.maxY, other.maxY);
      double var14 = Math.min(this.maxZ, other.maxZ);
      return new AxisAlignedBB(var4, var6, var8, var10, var12, var14);
   }

   public AxisAlignedBB union(AxisAlignedBB other) {
      double var4 = Math.min(this.minX, other.minX);
      double var6 = Math.min(this.minY, other.minY);
      double var8 = Math.min(this.minZ, other.minZ);
      double var10 = Math.max(this.maxX, other.maxX);
      double var12 = Math.max(this.maxY, other.maxY);
      double var14 = Math.max(this.maxZ, other.maxZ);
      return new AxisAlignedBB(var4, var6, var8, var10, var12, var14);
   }

   /**
    * Offsets the current bounding box by the specified amount.
    */
   public AxisAlignedBB offset(double x, double y, double z) {
      return new AxisAlignedBB(
         this.minX + x, this.minY + y, this.minZ + z, this.maxX + x, this.maxY + y, this.maxZ + z
      );
   }

   public AxisAlignedBB offset(BlockPos pos) {
      return new AxisAlignedBB(
         this.minX + (double)pos.getX(),
         this.minY + (double)pos.getY(),
         this.minZ + (double)pos.getZ(),
         this.maxX + (double)pos.getX(),
         this.maxY + (double)pos.getY(),
         this.maxZ + (double)pos.getZ()
      );
   }

   public AxisAlignedBB offset(Vector3d vec) {
      return this.offset(vec.x, vec.y, vec.z);
   }

   /**
    * Checks if the bounding box intersects with another.
    */
   public boolean intersects(AxisAlignedBB other) {
      return this.intersects(other.minX, other.minY, other.minZ, other.maxX, other.maxY, other.maxZ);
   }

   public boolean intersects(double x1, double y1, double z1, double x2, double y2, double z2)
   {
      return this.minX < x2 && this.maxX > x1 && this.minY < y2 && this.maxY > y1 && this.minZ < z2 && this.maxZ > z1;
   }

   public boolean intersects(Vector3d min, Vector3d max) {
      return this.intersects(
         Math.min(min.x, max.x),
         Math.min(min.y, max.y),
         Math.min(min.z, max.z),
         Math.max(min.x, max.x),
         Math.max(min.y, max.y),
         Math.max(min.z, max.z)
      );
   }

   /**
    * Returns if the supplied Vec3D is completely inside the bounding box
    */
   public boolean contains(Vector3d vec) {
      return this.contains(vec.x, vec.y, vec.z);
   }

   public boolean contains(double x, double y, double z) {
      return x >= this.minX
         && x < this.maxX
         && y >= this.minY
         && y < this.maxY
         && z >= this.minZ
         && z < this.maxZ;
   }

   public double getAverageEdgeLength() {
      double xSize = this.getXSize();
      double ySize = this.getYSize();
      double zSize = this.getZSize();
      return (xSize + ySize + zSize) / 3.0;
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

   public AxisAlignedBB shrink(double var1) {
      return this.grow(-var1);
   }

   public Optional<Vector3d> rayTrace(Vector3d var1, Vector3d var2) {
      double[] var5 = new double[]{1.0};
      double var6 = var2.x - var1.x;
      double var8 = var2.y - var1.y;
      double var10 = var2.z - var1.z;
      Direction var12 = calcSideHit(this, var1, var5, (Direction)null, var6, var8, var10);
      if (var12 != null) {
         double var13 = var5[0];
         return Optional.<Vector3d>of(var1.add(var13 * var6, var13 * var8, var13 * var10));
      } else {
         return Optional.<Vector3d>empty();
      }
   }

   @Nullable
   public static BlockRayTraceResult rayTrace(Iterable<AxisAlignedBB> var0, Vector3d var1, Vector3d var2, BlockPos var3) {
      double[] var6 = new double[]{1.0};
      Direction var7 = null;
      double var8 = var2.x - var1.x;
      double var10 = var2.y - var1.y;
      double var12 = var2.z - var1.z;

      for (AxisAlignedBB var17 : var0) {
         var7 = calcSideHit(var17.offset(var3), var1, var6, var7, var8, var10, var12);
      }

      if (var7 != null) {
         double var15 = var6[0];
         return new BlockRayTraceResult(var1.add(var15 * var8, var15 * var10, var15 * var12), var7, var3, false);
      } else {
         return null;
      }
   }

   @Nullable
   private static Direction calcSideHit(AxisAlignedBB aabb, Vector3d start, double[] minDistance, @Nullable Direction facing, double deltaX, double deltaY, double deltaZ)
   {
      if (deltaX > 1.0E-7D)
      {
         facing = checkSideForHit(minDistance, facing, deltaX, deltaY, deltaZ, aabb.minX, aabb.minY, aabb.maxY, aabb.minZ, aabb.maxZ, Direction.WEST, start.x, start.y, start.z);
      }
      else if (deltaX < -1.0E-7D)
      {
         facing = checkSideForHit(minDistance, facing, deltaX, deltaY, deltaZ, aabb.maxX, aabb.minY, aabb.maxY, aabb.minZ, aabb.maxZ, Direction.EAST, start.x, start.y, start.z);
      }

      if (deltaY > 1.0E-7D)
      {
         facing = checkSideForHit(minDistance, facing, deltaY, deltaZ, deltaX, aabb.minY, aabb.minZ, aabb.maxZ, aabb.minX, aabb.maxX, Direction.DOWN, start.y, start.z, start.x);
      }
      else if (deltaY < -1.0E-7D)
      {
         facing = checkSideForHit(minDistance, facing, deltaY, deltaZ, deltaX, aabb.maxY, aabb.minZ, aabb.maxZ, aabb.minX, aabb.maxX, Direction.UP, start.y, start.z, start.x);
      }

      if (deltaZ > 1.0E-7D)
      {
         facing = checkSideForHit(minDistance, facing, deltaZ, deltaX, deltaY, aabb.minZ, aabb.minX, aabb.maxX, aabb.minY, aabb.maxY, Direction.NORTH, start.z, start.x, start.y);
      }
      else if (deltaZ < -1.0E-7D)
      {
         facing = checkSideForHit(minDistance, facing, deltaZ, deltaX, deltaY, aabb.maxZ, aabb.minX, aabb.maxX, aabb.minY, aabb.maxY, Direction.SOUTH, start.z, start.x, start.y);
      }

      return facing;
   }



   @Nullable
   private static Direction checkSideForHit(double[] minDistance, @Nullable Direction prevDirection, double distanceSide, double distanceOtherA, double distanceOtherB, double minSide, double minOtherA, double maxOtherA, double minOtherB, double maxOtherB, Direction hitSide, double startSide, double startOtherA, double startOtherB)
   {
      double d0 = (minSide - startSide) / distanceSide;
      double d1 = startOtherA + d0 * distanceOtherA;
      double d2 = startOtherB + d0 * distanceOtherB;

      if (0.0D < d0 && d0 < minDistance[0] && minOtherA - 1.0E-7D < d1 && d1 < maxOtherA + 1.0E-7D && minOtherB - 1.0E-7D < d2 && d2 < maxOtherB + 1.0E-7D)
      {
         minDistance[0] = d0;
         return hitSide;
      }
      else
      {
         return prevDirection;
      }
   }

   @Override
   public String toString() {
      return "AABB["
         + this.minX
         + ", "
         + this.minY
         + ", "
         + this.minZ
         + "] -> ["
         + this.maxX
         + ", "
         + this.maxY
         + ", "
         + this.maxZ
         + "]";
   }

   public boolean hasNaN() {
      return Double.isNaN(this.minX)
         || Double.isNaN(this.minY)
         || Double.isNaN(this.minZ)
         || Double.isNaN(this.maxX)
         || Double.isNaN(this.maxY)
         || Double.isNaN(this.maxZ);
   }

   public Vector3d getCenter() {
      return new Vector3d(
         MathHelper.lerp(0.5, this.minX, this.maxX),
         MathHelper.lerp(0.5, this.minY, this.maxY),
         MathHelper.lerp(0.5, this.minZ, this.maxZ)
      );
   }

   public static AxisAlignedBB withSizeAtOrigin(double xSize, double ySize, double zSize) {
      return new AxisAlignedBB(-xSize / 2.0, -ySize / 2.0, -zSize / 2.0, xSize / 2.0, ySize / 2.0, zSize / 2.0);
   }
}
