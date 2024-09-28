package net.minecraft.util.math;

import mapped.*;
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

   public static AxisAlignedBB method19656(Class9764 var0) {
      return new AxisAlignedBB(
         (double)var0.field45678,
         (double)var0.field45679,
         (double)var0.field45680,
         (double)(var0.field45681 + 1),
         (double)(var0.field45682 + 1),
         (double)(var0.field45683 + 1)
      );
   }

   public static AxisAlignedBB method19657(Vector3d var0) {
      return new AxisAlignedBB(var0.x, var0.y, var0.z, var0.x + 1.0, var0.y + 1.0, var0.z + 1.0);
   }

   public double method19658(Direction.Axis var1) {
      return var1.method328(this.minX, this.minY, this.minZ);
   }

   public double method19659(Direction.Axis var1) {
      return var1.method328(this.maxX, this.maxY, this.maxZ);
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

   public AxisAlignedBB method19660(double var1, double var3, double var5) {
      double var9 = this.minX;
      double var11 = this.minY;
      double var13 = this.minZ;
      double var15 = this.maxX;
      double var17 = this.maxY;
      double var19 = this.maxZ;
      if (!(var1 < 0.0)) {
         if (var1 > 0.0) {
            var15 -= var1;
         }
      } else {
         var9 -= var1;
      }

      if (!(var3 < 0.0)) {
         if (var3 > 0.0) {
            var17 -= var3;
         }
      } else {
         var11 -= var3;
      }

      if (!(var5 < 0.0)) {
         if (var5 > 0.0) {
            var19 -= var5;
         }
      } else {
         var13 -= var5;
      }

      return new AxisAlignedBB(var9, var11, var13, var15, var17, var19);
   }

   public AxisAlignedBB contract(Vector3d var1) {
      return this.contract(var1.x, var1.y, var1.z);
   }

   public AxisAlignedBB contract(double var1, double var3, double var5) {
      double var9 = this.minX;
      double var11 = this.minY;
      double var13 = this.minZ;
      double var15 = this.maxX;
      double var17 = this.maxY;
      double var19 = this.maxZ;
      if (!(var1 < 0.0)) {
         if (var1 > 0.0) {
            var15 += var1;
         }
      } else {
         var9 += var1;
      }

      if (!(var3 < 0.0)) {
         if (var3 > 0.0) {
            var17 += var3;
         }
      } else {
         var11 += var3;
      }

      if (!(var5 < 0.0)) {
         if (var5 > 0.0) {
            var19 += var5;
         }
      } else {
         var13 += var5;
      }

      return new AxisAlignedBB(var9, var11, var13, var15, var17, var19);
   }

   public AxisAlignedBB method19663(double var1, double var3, double var5) {
      double var9 = this.minX - var1;
      double var11 = this.minY - var3;
      double var13 = this.minZ - var5;
      double var15 = this.maxX + var1;
      double var17 = this.maxY + var3;
      double var19 = this.maxZ + var5;
      return new AxisAlignedBB(var9, var11, var13, var15, var17, var19);
   }

   public AxisAlignedBB method19664(double var1) {
      return this.method19663(var1, var1, var1);
   }

   public AxisAlignedBB method19665(AxisAlignedBB var1) {
      double var4 = Math.max(this.minX, var1.minX);
      double var6 = Math.max(this.minY, var1.minY);
      double var8 = Math.max(this.minZ, var1.minZ);
      double var10 = Math.min(this.maxX, var1.maxX);
      double var12 = Math.min(this.maxY, var1.maxY);
      double var14 = Math.min(this.maxZ, var1.maxZ);
      return new AxisAlignedBB(var4, var6, var8, var10, var12, var14);
   }

   public AxisAlignedBB method19666(AxisAlignedBB var1) {
      double var4 = Math.min(this.minX, var1.minX);
      double var6 = Math.min(this.minY, var1.minY);
      double var8 = Math.min(this.minZ, var1.minZ);
      double var10 = Math.max(this.maxX, var1.maxX);
      double var12 = Math.max(this.maxY, var1.maxY);
      double var14 = Math.max(this.maxZ, var1.maxZ);
      return new AxisAlignedBB(var4, var6, var8, var10, var12, var14);
   }

   public AxisAlignedBB offset(double var1, double var3, double var5) {
      return new AxisAlignedBB(
         this.minX + var1, this.minY + var3, this.minZ + var5, this.maxX + var1, this.maxY + var3, this.maxZ + var5
      );
   }

   public AxisAlignedBB method19668(BlockPos var1) {
      return new AxisAlignedBB(
         this.minX + (double)var1.getX(),
         this.minY + (double)var1.getY(),
         this.minZ + (double)var1.getZ(),
         this.maxX + (double)var1.getX(),
         this.maxY + (double)var1.getY(),
         this.maxZ + (double)var1.getZ()
      );
   }

   public AxisAlignedBB offset(Vector3d var1) {
      return this.offset(var1.x, var1.y, var1.z);
   }

   public boolean method19670(AxisAlignedBB var1) {
      return this.method19671(var1.minX, var1.minY, var1.minZ, var1.maxX, var1.maxY, var1.maxZ);
   }

   public boolean method19671(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.minX < var7
         && this.maxX > var1
         && this.minY < var9
         && this.maxY > var3
         && this.minZ < var11
         && this.maxZ > var5;
   }

   public boolean method19672(Vector3d var1, Vector3d var2) {
      return this.method19671(
         Math.min(var1.x, var2.x),
         Math.min(var1.y, var2.y),
         Math.min(var1.z, var2.z),
         Math.max(var1.x, var2.x),
         Math.max(var1.y, var2.y),
         Math.max(var1.z, var2.z)
      );
   }

   public boolean method19673(Vector3d var1) {
      return this.method19674(var1.x, var1.y, var1.z);
   }

   public boolean method19674(double var1, double var3, double var5) {
      return var1 >= this.minX
         && var1 < this.maxX
         && var3 >= this.minY
         && var3 < this.maxY
         && var5 >= this.minZ
         && var5 < this.maxZ;
   }

   public double getAverageEdgeLength() {
      double var3 = this.method19676();
      double var5 = this.method19677();
      double var7 = this.method19678();
      return (var3 + var5 + var7) / 3.0;
   }

   public double method19676() {
      return this.maxX - this.minX;
   }

   public double method19677() {
      return this.maxY - this.minY;
   }

   public double method19678() {
      return this.maxZ - this.minZ;
   }

   public AxisAlignedBB shrink(double var1) {
      return this.method19664(-var1);
   }

   public Optional<Vector3d> method19680(Vector3d var1, Vector3d var2) {
      double[] var5 = new double[]{1.0};
      double var6 = var2.x - var1.x;
      double var8 = var2.y - var1.y;
      double var10 = var2.z - var1.z;
      Direction var12 = method19682(this, var1, var5, (Direction)null, var6, var8, var10);
      if (var12 != null) {
         double var13 = var5[0];
         return Optional.<Vector3d>of(var1.add(var13 * var6, var13 * var8, var13 * var10));
      } else {
         return Optional.<Vector3d>empty();
      }
   }

   @Nullable
   public static BlockRayTraceResult method19681(Iterable<AxisAlignedBB> var0, Vector3d var1, Vector3d var2, BlockPos var3) {
      double[] var6 = new double[]{1.0};
      Direction var7 = null;
      double var8 = var2.x - var1.x;
      double var10 = var2.y - var1.y;
      double var12 = var2.z - var1.z;

      for (AxisAlignedBB var17 : var0) {
         var7 = method19682(var17.method19668(var3), var1, var6, var7, var8, var10, var12);
      }

      if (var7 != null) {
         double var15 = var6[0];
         return new BlockRayTraceResult(var1.add(var15 * var8, var15 * var10, var15 * var12), var7, var3, false);
      } else {
         return null;
      }
   }

   @Nullable
   private static Direction method19682(AxisAlignedBB var0, Vector3d var1, double[] var2, Direction var3, double var4, double var6, double var8) {
      if (!(var4 > 1.0E-7)) {
         if (var4 < -1.0E-7) {
            var3 = method19683(
               var2,
               var3,
               var4,
               var6,
               var8,
               var0.maxX,
               var0.minY,
               var0.maxY,
               var0.minZ,
               var0.maxZ,
               Direction.EAST,
               var1.x,
               var1.y,
               var1.z
            );
         }
      } else {
         var3 = method19683(
            var2,
            var3,
            var4,
            var6,
            var8,
            var0.minX,
            var0.minY,
            var0.maxY,
            var0.minZ,
            var0.maxZ,
            Direction.WEST,
            var1.x,
            var1.y,
            var1.z
         );
      }

      if (!(var6 > 1.0E-7)) {
         if (var6 < -1.0E-7) {
            var3 = method19683(
               var2,
               var3,
               var6,
               var8,
               var4,
               var0.maxY,
               var0.minZ,
               var0.maxZ,
               var0.minX,
               var0.maxX,
               Direction.UP,
               var1.y,
               var1.z,
               var1.x
            );
         }
      } else {
         var3 = method19683(
            var2,
            var3,
            var6,
            var8,
            var4,
            var0.minY,
            var0.minZ,
            var0.maxZ,
            var0.minX,
            var0.maxX,
            Direction.DOWN,
            var1.y,
            var1.z,
            var1.x
         );
      }

      if (!(var8 > 1.0E-7)) {
         if (var8 < -1.0E-7) {
            var3 = method19683(
               var2,
               var3,
               var8,
               var4,
               var6,
               var0.maxZ,
               var0.minX,
               var0.maxX,
               var0.minY,
               var0.maxY,
               Direction.SOUTH,
               var1.z,
               var1.x,
               var1.y
            );
         }
      } else {
         var3 = method19683(
            var2,
            var3,
            var8,
            var4,
            var6,
            var0.minZ,
            var0.minX,
            var0.maxX,
            var0.minY,
            var0.maxY,
            Direction.NORTH,
            var1.z,
            var1.x,
            var1.y
         );
      }

      return var3;
   }

   @Nullable
   private static Direction method19683(
      double[] var0,
      Direction var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      Direction var18,
      double var19,
      double var21,
      double var23
   ) {
      double var27 = (var8 - var19) / var2;
      double var29 = var21 + var27 * var4;
      double var31 = var23 + var27 * var6;
      if (0.0 < var27 && var27 < var0[0] && var10 - 1.0E-7 < var29 && var29 < var12 + 1.0E-7 && var14 - 1.0E-7 < var31 && var31 < var16 + 1.0E-7) {
         var0[0] = var27;
         return var18;
      } else {
         return var1;
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

   public boolean method19684() {
      return Double.isNaN(this.minX)
         || Double.isNaN(this.minY)
         || Double.isNaN(this.minZ)
         || Double.isNaN(this.maxX)
         || Double.isNaN(this.maxY)
         || Double.isNaN(this.maxZ);
   }

   public Vector3d method19685() {
      return new Vector3d(
         MathHelper.lerp(0.5, this.minX, this.maxX),
         MathHelper.lerp(0.5, this.minY, this.maxY),
         MathHelper.lerp(0.5, this.minZ, this.maxZ)
      );
   }

   public static AxisAlignedBB method19686(double var0, double var2, double var4) {
      return new AxisAlignedBB(-var0 / 2.0, -var2 / 2.0, -var4 / 2.0, var0 / 2.0, var2 / 2.0, var4 / 2.0);
   }
}
