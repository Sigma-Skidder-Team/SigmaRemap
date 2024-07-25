package remapped;

import java.util.Optional;
import javax.annotation.Nullable;

public class Box {
   public final double field_19941;
   public final double field_19937;
   public final double field_19938;
   public final double field_19940;
   public final double field_19939;
   public final double field_19942;

   public Box(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.field_19941 = Math.min(var1, var7);
      this.field_19937 = Math.min(var3, var9);
      this.field_19938 = Math.min(var5, var11);
      this.field_19940 = Math.max(var1, var7);
      this.field_19939 = Math.max(var3, var9);
      this.field_19942 = Math.max(var5, var11);
   }

   public Box(BlockPos var1) {
      this(
         (double)var1.getX(),
         (double)var1.method_12165(),
         (double)var1.method_12185(),
         (double)(var1.getX() + 1),
         (double)(var1.method_12165() + 1),
         (double)(var1.method_12185() + 1)
      );
   }

   public Box(BlockPos var1, BlockPos var2) {
      this(
         (double)var1.getX(),
         (double)var1.method_12165(),
         (double)var1.method_12185(),
         (double)var2.getX(),
         (double)var2.method_12165(),
         (double)var2.method_12185()
      );
   }

   public Box(class_1343 var1, class_1343 var2) {
      this(var1.field_7336, var1.field_7333, var1.field_7334, var2.field_7336, var2.field_7333, var2.field_7334);
   }

   public static Box method_18912(class_9616 var0) {
      return new Box(
         (double)var0.field_48996,
         (double)var0.field_48995,
         (double)var0.field_48992,
         (double)(var0.field_48991 + 1),
         (double)(var0.field_48993 + 1),
         (double)(var0.field_48994 + 1)
      );
   }

   public static Box method_18911(class_1343 var0) {
      return new Box(var0.field_7336, var0.field_7333, var0.field_7334, var0.field_7336 + 1.0, var0.field_7333 + 1.0, var0.field_7334 + 1.0);
   }

   public double method_18915(class_9249 var1) {
      return var1.method_42630(this.field_19941, this.field_19937, this.field_19938);
   }

   public double method_18917(class_9249 var1) {
      return var1.method_42630(this.field_19940, this.field_19939, this.field_19942);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof Box) {
            Box var4 = (Box)var1;
            if (Double.compare(var4.field_19941, this.field_19941) == 0) {
               if (Double.compare(var4.field_19937, this.field_19937) == 0) {
                  if (Double.compare(var4.field_19938, this.field_19938) == 0) {
                     if (Double.compare(var4.field_19940, this.field_19940) == 0) {
                        return Double.compare(var4.field_19939, this.field_19939) == 0 ? Double.compare(var4.field_19942, this.field_19942) == 0 : false;
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
      long var3 = Double.doubleToLongBits(this.field_19941);
      int var5 = (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.field_19937);
      var5 = 31 * var5 + (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.field_19938);
      var5 = 31 * var5 + (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.field_19940);
      var5 = 31 * var5 + (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.field_19939);
      var5 = 31 * var5 + (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.field_19942);
      return 31 * var5 + (int)(var3 ^ var3 >>> 32);
   }

   public Box method_18900(double var1, double var3, double var5) {
      double var9 = this.field_19941;
      double var11 = this.field_19937;
      double var13 = this.field_19938;
      double var15 = this.field_19940;
      double var17 = this.field_19939;
      double var19 = this.field_19942;
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

      return new Box(var9, var11, var13, var15, var17, var19);
   }

   public Box method_18929(class_1343 var1) {
      return this.method_18928(var1.field_7336, var1.field_7333, var1.field_7334);
   }

   public Box method_18928(double var1, double var3, double var5) {
      double var9 = this.field_19941;
      double var11 = this.field_19937;
      double var13 = this.field_19938;
      double var15 = this.field_19940;
      double var17 = this.field_19939;
      double var19 = this.field_19942;
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

      return new Box(var9, var11, var13, var15, var17, var19);
   }

   public Box method_18899(double var1, double var3, double var5) {
      double var9 = this.field_19941 - var1;
      double var11 = this.field_19937 - var3;
      double var13 = this.field_19938 - var5;
      double var15 = this.field_19940 + var1;
      double var17 = this.field_19939 + var3;
      double var19 = this.field_19942 + var5;
      return new Box(var9, var11, var13, var15, var17, var19);
   }

   public Box grow(double var1) {
      return this.method_18899(var1, var1, var1);
   }

   public Box method_18914(Box var1) {
      double var4 = Math.max(this.field_19941, var1.field_19941);
      double var6 = Math.max(this.field_19937, var1.field_19937);
      double var8 = Math.max(this.field_19938, var1.field_19938);
      double var10 = Math.min(this.field_19940, var1.field_19940);
      double var12 = Math.min(this.field_19939, var1.field_19939);
      double var14 = Math.min(this.field_19942, var1.field_19942);
      return new Box(var4, var6, var8, var10, var12, var14);
   }

   public Box method_18905(Box var1) {
      double var4 = Math.min(this.field_19941, var1.field_19941);
      double var6 = Math.min(this.field_19937, var1.field_19937);
      double var8 = Math.min(this.field_19938, var1.field_19938);
      double var10 = Math.max(this.field_19940, var1.field_19940);
      double var12 = Math.max(this.field_19939, var1.field_19939);
      double var14 = Math.max(this.field_19942, var1.field_19942);
      return new Box(var4, var6, var8, var10, var12, var14);
   }

   public Box method_18918(double var1, double var3, double var5) {
      return new Box(
         this.field_19941 + var1, this.field_19937 + var3, this.field_19938 + var5, this.field_19940 + var1, this.field_19939 + var3, this.field_19942 + var5
      );
   }

   public Box method_18919(BlockPos var1) {
      return new Box(
         this.field_19941 + (double)var1.getX(),
         this.field_19937 + (double)var1.method_12165(),
         this.field_19938 + (double)var1.method_12185(),
         this.field_19940 + (double)var1.getX(),
         this.field_19939 + (double)var1.method_12165(),
         this.field_19942 + (double)var1.method_12185()
      );
   }

   public Box method_18920(class_1343 var1) {
      return this.method_18918(var1.field_7336, var1.field_7333, var1.field_7334);
   }

   public boolean method_18909(Box var1) {
      return this.method_18907(var1.field_19941, var1.field_19937, var1.field_19938, var1.field_19940, var1.field_19939, var1.field_19942);
   }

   public boolean method_18907(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.field_19941 < var7
         && this.field_19940 > var1
         && this.field_19937 < var9
         && this.field_19939 > var3
         && this.field_19938 < var11
         && this.field_19942 > var5;
   }

   public boolean method_18908(class_1343 var1, class_1343 var2) {
      return this.method_18907(
         Math.min(var1.field_7336, var2.field_7336),
         Math.min(var1.field_7333, var2.field_7333),
         Math.min(var1.field_7334, var2.field_7334),
         Math.max(var1.field_7336, var2.field_7336),
         Math.max(var1.field_7333, var2.field_7333),
         Math.max(var1.field_7334, var2.field_7334)
      );
   }

   public boolean method_18903(class_1343 var1) {
      return this.method_18902(var1.field_7336, var1.field_7333, var1.field_7334);
   }

   public boolean method_18902(double var1, double var3, double var5) {
      return var1 >= this.field_19941
         && var1 < this.field_19940
         && var3 >= this.field_19937
         && var3 < this.field_19939
         && var5 >= this.field_19938
         && var5 < this.field_19942;
   }

   public double method_18906() {
      double var3 = this.method_18910();
      double var5 = this.method_18901();
      double var7 = this.method_18921();
      return (var3 + var5 + var7) / 3.0;
   }

   public double method_18910() {
      return this.field_19940 - this.field_19941;
   }

   public double method_18901() {
      return this.field_19939 - this.field_19937;
   }

   public double method_18921() {
      return this.field_19942 - this.field_19938;
   }

   public Box method_18924(double var1) {
      return this.grow(-var1);
   }

   public Optional<class_1343> method_18923(class_1343 var1, class_1343 var2) {
      double[] var5 = new double[]{1.0};
      double var6 = var2.field_7336 - var1.field_7336;
      double var8 = var2.field_7333 - var1.field_7333;
      double var10 = var2.field_7334 - var1.field_7334;
      Direction var12 = method_18904(this, var1, var5, (Direction)null, var6, var8, var10);
      if (var12 != null) {
         double var13 = var5[0];
         return Optional.<class_1343>of(var1.method_6214(var13 * var6, var13 * var8, var13 * var10));
      } else {
         return Optional.<class_1343>empty();
      }
   }

   @Nullable
   public static class_9529 method_18922(Iterable<Box> var0, class_1343 var1, class_1343 var2, BlockPos var3) {
      double[] var6 = new double[]{1.0};
      Direction var7 = null;
      double var8 = var2.field_7336 - var1.field_7336;
      double var10 = var2.field_7333 - var1.field_7333;
      double var12 = var2.field_7334 - var1.field_7334;

      for (Box var17 : var0) {
         var7 = method_18904(var17.method_18919(var3), var1, var6, var7, var8, var10, var12);
      }

      if (var7 != null) {
         double var15 = var6[0];
         return new class_9529(var1.method_6214(var15 * var8, var15 * var10, var15 * var12), var7, var3, false);
      } else {
         return null;
      }
   }

   @Nullable
   private static Direction method_18904(Box var0, class_1343 var1, double[] var2, Direction var3, double var4, double var6, double var8) {
      if (!(var4 > 1.0E-7)) {
         if (var4 < -1.0E-7) {
            var3 = method_18916(
               var2,
               var3,
               var4,
               var6,
               var8,
               var0.field_19940,
               var0.field_19937,
               var0.field_19939,
               var0.field_19938,
               var0.field_19942,
               Direction.field_804,
               var1.field_7336,
               var1.field_7333,
               var1.field_7334
            );
         }
      } else {
         var3 = method_18916(
            var2,
            var3,
            var4,
            var6,
            var8,
            var0.field_19941,
            var0.field_19937,
            var0.field_19939,
            var0.field_19938,
            var0.field_19942,
            Direction.field_809,
            var1.field_7336,
            var1.field_7333,
            var1.field_7334
         );
      }

      if (!(var6 > 1.0E-7)) {
         if (var6 < -1.0E-7) {
            var3 = method_18916(
               var2,
               var3,
               var6,
               var8,
               var4,
               var0.field_19939,
               var0.field_19938,
               var0.field_19942,
               var0.field_19941,
               var0.field_19940,
               Direction.field_817,
               var1.field_7333,
               var1.field_7334,
               var1.field_7336
            );
         }
      } else {
         var3 = method_18916(
            var2,
            var3,
            var6,
            var8,
            var4,
            var0.field_19937,
            var0.field_19938,
            var0.field_19942,
            var0.field_19941,
            var0.field_19940,
            Direction.field_802,
            var1.field_7333,
            var1.field_7334,
            var1.field_7336
         );
      }

      if (!(var8 > 1.0E-7)) {
         if (var8 < -1.0E-7) {
            var3 = method_18916(
               var2,
               var3,
               var8,
               var4,
               var6,
               var0.field_19942,
               var0.field_19941,
               var0.field_19940,
               var0.field_19937,
               var0.field_19939,
               Direction.field_800,
               var1.field_7334,
               var1.field_7336,
               var1.field_7333
            );
         }
      } else {
         var3 = method_18916(
            var2,
            var3,
            var8,
            var4,
            var6,
            var0.field_19938,
            var0.field_19941,
            var0.field_19940,
            var0.field_19937,
            var0.field_19939,
            Direction.field_818,
            var1.field_7334,
            var1.field_7336,
            var1.field_7333
         );
      }

      return var3;
   }

   @Nullable
   private static Direction method_18916(
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
         + this.field_19941
         + ", "
         + this.field_19937
         + ", "
         + this.field_19938
         + "] -> ["
         + this.field_19940
         + ", "
         + this.field_19939
         + ", "
         + this.field_19942
         + "]";
   }

   public boolean method_18925() {
      return Double.isNaN(this.field_19941)
         || Double.isNaN(this.field_19937)
         || Double.isNaN(this.field_19938)
         || Double.isNaN(this.field_19940)
         || Double.isNaN(this.field_19939)
         || Double.isNaN(this.field_19942);
   }

   public class_1343 method_18926() {
      return new class_1343(
         MathHelper.lerp(0.5, this.field_19941, this.field_19940),
         MathHelper.lerp(0.5, this.field_19937, this.field_19939),
         MathHelper.lerp(0.5, this.field_19938, this.field_19942)
      );
   }

   public static Box method_18913(double var0, double var2, double var4) {
      return new Box(-var0 / 2.0, -var2 / 2.0, -var4 / 2.0, var0 / 2.0, var2 / 2.0, var4 / 2.0);
   }
}
