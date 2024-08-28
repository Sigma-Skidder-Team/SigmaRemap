package mapped;

import java.util.Optional;
import javax.annotation.Nullable;

public class Class6488 {
   public final double field28449;
   public final double field28450;
   public final double field28451;
   public final double field28452;
   public final double field28453;
   public final double field28454;

   public Class6488(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.field28449 = Math.min(var1, var7);
      this.field28450 = Math.min(var3, var9);
      this.field28451 = Math.min(var5, var11);
      this.field28452 = Math.max(var1, var7);
      this.field28453 = Math.max(var3, var9);
      this.field28454 = Math.max(var5, var11);
   }

   public Class6488(BlockPos var1) {
      this(
         (double)var1.method8304(),
         (double)var1.getY(),
         (double)var1.method8306(),
         (double)(var1.method8304() + 1),
         (double)(var1.getY() + 1),
         (double)(var1.method8306() + 1)
      );
   }

   public Class6488(BlockPos var1, BlockPos var2) {
      this(
         (double)var1.method8304(),
         (double)var1.getY(),
         (double)var1.method8306(),
         (double)var2.method8304(),
         (double)var2.getY(),
         (double)var2.method8306()
      );
   }

   public Class6488(Vector3d var1, Vector3d var2) {
      this(var1.field18048, var1.field18049, var1.field18050, var2.field18048, var2.field18049, var2.field18050);
   }

   public static Class6488 method19656(Class9764 var0) {
      return new Class6488(
         (double)var0.field45678,
         (double)var0.field45679,
         (double)var0.field45680,
         (double)(var0.field45681 + 1),
         (double)(var0.field45682 + 1),
         (double)(var0.field45683 + 1)
      );
   }

   public static Class6488 method19657(Vector3d var0) {
      return new Class6488(var0.field18048, var0.field18049, var0.field18050, var0.field18048 + 1.0, var0.field18049 + 1.0, var0.field18050 + 1.0);
   }

   public double method19658(Class113 var1) {
      return var1.method328(this.field28449, this.field28450, this.field28451);
   }

   public double method19659(Class113 var1) {
      return var1.method328(this.field28452, this.field28453, this.field28454);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof Class6488) {
            Class6488 var4 = (Class6488)var1;
            if (Double.compare(var4.field28449, this.field28449) == 0) {
               if (Double.compare(var4.field28450, this.field28450) == 0) {
                  if (Double.compare(var4.field28451, this.field28451) == 0) {
                     if (Double.compare(var4.field28452, this.field28452) == 0) {
                        return Double.compare(var4.field28453, this.field28453) == 0 ? Double.compare(var4.field28454, this.field28454) == 0 : false;
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
      long var3 = Double.doubleToLongBits(this.field28449);
      int var5 = (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.field28450);
      var5 = 31 * var5 + (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.field28451);
      var5 = 31 * var5 + (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.field28452);
      var5 = 31 * var5 + (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.field28453);
      var5 = 31 * var5 + (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.field28454);
      return 31 * var5 + (int)(var3 ^ var3 >>> 32);
   }

   public Class6488 method19660(double var1, double var3, double var5) {
      double var9 = this.field28449;
      double var11 = this.field28450;
      double var13 = this.field28451;
      double var15 = this.field28452;
      double var17 = this.field28453;
      double var19 = this.field28454;
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

      return new Class6488(var9, var11, var13, var15, var17, var19);
   }

   public Class6488 method19661(Vector3d var1) {
      return this.method19662(var1.field18048, var1.field18049, var1.field18050);
   }

   public Class6488 method19662(double var1, double var3, double var5) {
      double var9 = this.field28449;
      double var11 = this.field28450;
      double var13 = this.field28451;
      double var15 = this.field28452;
      double var17 = this.field28453;
      double var19 = this.field28454;
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

      return new Class6488(var9, var11, var13, var15, var17, var19);
   }

   public Class6488 method19663(double var1, double var3, double var5) {
      double var9 = this.field28449 - var1;
      double var11 = this.field28450 - var3;
      double var13 = this.field28451 - var5;
      double var15 = this.field28452 + var1;
      double var17 = this.field28453 + var3;
      double var19 = this.field28454 + var5;
      return new Class6488(var9, var11, var13, var15, var17, var19);
   }

   public Class6488 method19664(double var1) {
      return this.method19663(var1, var1, var1);
   }

   public Class6488 method19665(Class6488 var1) {
      double var4 = Math.max(this.field28449, var1.field28449);
      double var6 = Math.max(this.field28450, var1.field28450);
      double var8 = Math.max(this.field28451, var1.field28451);
      double var10 = Math.min(this.field28452, var1.field28452);
      double var12 = Math.min(this.field28453, var1.field28453);
      double var14 = Math.min(this.field28454, var1.field28454);
      return new Class6488(var4, var6, var8, var10, var12, var14);
   }

   public Class6488 method19666(Class6488 var1) {
      double var4 = Math.min(this.field28449, var1.field28449);
      double var6 = Math.min(this.field28450, var1.field28450);
      double var8 = Math.min(this.field28451, var1.field28451);
      double var10 = Math.max(this.field28452, var1.field28452);
      double var12 = Math.max(this.field28453, var1.field28453);
      double var14 = Math.max(this.field28454, var1.field28454);
      return new Class6488(var4, var6, var8, var10, var12, var14);
   }

   public Class6488 method19667(double var1, double var3, double var5) {
      return new Class6488(
         this.field28449 + var1, this.field28450 + var3, this.field28451 + var5, this.field28452 + var1, this.field28453 + var3, this.field28454 + var5
      );
   }

   public Class6488 method19668(BlockPos var1) {
      return new Class6488(
         this.field28449 + (double)var1.method8304(),
         this.field28450 + (double)var1.getY(),
         this.field28451 + (double)var1.method8306(),
         this.field28452 + (double)var1.method8304(),
         this.field28453 + (double)var1.getY(),
         this.field28454 + (double)var1.method8306()
      );
   }

   public Class6488 method19669(Vector3d var1) {
      return this.method19667(var1.field18048, var1.field18049, var1.field18050);
   }

   public boolean method19670(Class6488 var1) {
      return this.method19671(var1.field28449, var1.field28450, var1.field28451, var1.field28452, var1.field28453, var1.field28454);
   }

   public boolean method19671(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.field28449 < var7
         && this.field28452 > var1
         && this.field28450 < var9
         && this.field28453 > var3
         && this.field28451 < var11
         && this.field28454 > var5;
   }

   public boolean method19672(Vector3d var1, Vector3d var2) {
      return this.method19671(
         Math.min(var1.field18048, var2.field18048),
         Math.min(var1.field18049, var2.field18049),
         Math.min(var1.field18050, var2.field18050),
         Math.max(var1.field18048, var2.field18048),
         Math.max(var1.field18049, var2.field18049),
         Math.max(var1.field18050, var2.field18050)
      );
   }

   public boolean method19673(Vector3d var1) {
      return this.method19674(var1.field18048, var1.field18049, var1.field18050);
   }

   public boolean method19674(double var1, double var3, double var5) {
      return var1 >= this.field28449
         && var1 < this.field28452
         && var3 >= this.field28450
         && var3 < this.field28453
         && var5 >= this.field28451
         && var5 < this.field28454;
   }

   public double method19675() {
      double var3 = this.method19676();
      double var5 = this.method19677();
      double var7 = this.method19678();
      return (var3 + var5 + var7) / 3.0;
   }

   public double method19676() {
      return this.field28452 - this.field28449;
   }

   public double method19677() {
      return this.field28453 - this.field28450;
   }

   public double method19678() {
      return this.field28454 - this.field28451;
   }

   public Class6488 method19679(double var1) {
      return this.method19664(-var1);
   }

   public Optional<Vector3d> method19680(Vector3d var1, Vector3d var2) {
      double[] var5 = new double[]{1.0};
      double var6 = var2.field18048 - var1.field18048;
      double var8 = var2.field18049 - var1.field18049;
      double var10 = var2.field18050 - var1.field18050;
      Direction var12 = method19682(this, var1, var5, (Direction)null, var6, var8, var10);
      if (var12 != null) {
         double var13 = var5[0];
         return Optional.<Vector3d>of(var1.method11339(var13 * var6, var13 * var8, var13 * var10));
      } else {
         return Optional.<Vector3d>empty();
      }
   }

   @Nullable
   public static Class8711 method19681(Iterable<Class6488> var0, Vector3d var1, Vector3d var2, BlockPos var3) {
      double[] var6 = new double[]{1.0};
      Direction var7 = null;
      double var8 = var2.field18048 - var1.field18048;
      double var10 = var2.field18049 - var1.field18049;
      double var12 = var2.field18050 - var1.field18050;

      for (Class6488 var17 : var0) {
         var7 = method19682(var17.method19668(var3), var1, var6, var7, var8, var10, var12);
      }

      if (var7 != null) {
         double var15 = var6[0];
         return new Class8711(var1.method11339(var15 * var8, var15 * var10, var15 * var12), var7, var3, false);
      } else {
         return null;
      }
   }

   @Nullable
   private static Direction method19682(Class6488 var0, Vector3d var1, double[] var2, Direction var3, double var4, double var6, double var8) {
      if (!(var4 > 1.0E-7)) {
         if (var4 < -1.0E-7) {
            var3 = method19683(
               var2,
               var3,
               var4,
               var6,
               var8,
               var0.field28452,
               var0.field28450,
               var0.field28453,
               var0.field28451,
               var0.field28454,
               Direction.EAST,
               var1.field18048,
               var1.field18049,
               var1.field18050
            );
         }
      } else {
         var3 = method19683(
            var2,
            var3,
            var4,
            var6,
            var8,
            var0.field28449,
            var0.field28450,
            var0.field28453,
            var0.field28451,
            var0.field28454,
            Direction.WEST,
            var1.field18048,
            var1.field18049,
            var1.field18050
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
               var0.field28453,
               var0.field28451,
               var0.field28454,
               var0.field28449,
               var0.field28452,
               Direction.field673,
               var1.field18049,
               var1.field18050,
               var1.field18048
            );
         }
      } else {
         var3 = method19683(
            var2,
            var3,
            var6,
            var8,
            var4,
            var0.field28450,
            var0.field28451,
            var0.field28454,
            var0.field28449,
            var0.field28452,
            Direction.field672,
            var1.field18049,
            var1.field18050,
            var1.field18048
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
               var0.field28454,
               var0.field28449,
               var0.field28452,
               var0.field28450,
               var0.field28453,
               Direction.SOUTH,
               var1.field18050,
               var1.field18048,
               var1.field18049
            );
         }
      } else {
         var3 = method19683(
            var2,
            var3,
            var8,
            var4,
            var6,
            var0.field28451,
            var0.field28449,
            var0.field28452,
            var0.field28450,
            var0.field28453,
            Direction.NORTH,
            var1.field18050,
            var1.field18048,
            var1.field18049
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
         + this.field28449
         + ", "
         + this.field28450
         + ", "
         + this.field28451
         + "] -> ["
         + this.field28452
         + ", "
         + this.field28453
         + ", "
         + this.field28454
         + "]";
   }

   public boolean method19684() {
      return Double.isNaN(this.field28449)
         || Double.isNaN(this.field28450)
         || Double.isNaN(this.field28451)
         || Double.isNaN(this.field28452)
         || Double.isNaN(this.field28453)
         || Double.isNaN(this.field28454);
   }

   public Vector3d method19685() {
      return new Vector3d(
         MathHelper.method37822(0.5, this.field28449, this.field28452),
         MathHelper.method37822(0.5, this.field28450, this.field28453),
         MathHelper.method37822(0.5, this.field28451, this.field28454)
      );
   }

   public static Class6488 method19686(double var0, double var2, double var4) {
      return new Class6488(-var0 / 2.0, -var2 / 2.0, -var4 / 2.0, var0 / 2.0, var2 / 2.0, var4 / 2.0);
   }
}
