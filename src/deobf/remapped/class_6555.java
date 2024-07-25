package remapped;

import com.mojang.datafixers.util.Pair;
import java.util.Random;
import org.apache.commons.lang3.tuple.Triple;

public final class class_6555 {
   private static final float field_33412 = 3.0F + 2.0F * (float)Math.sqrt(2.0);
   private static final float field_33405 = (float)Math.cos(Math.PI / 8);
   private static final float field_33407 = (float)Math.sin(Math.PI / 8);
   private static final float field_33402 = 1.0F / (float)Math.sqrt(2.0);
   public float field_33414;
   public float field_33403;
   public float field_33413;
   public float field_33411;
   public float field_33409;
   public float field_33408;
   public float field_33415;
   public float field_33404;
   public float field_33410;

   public class_6555() {
   }

   public class_6555(Quaternion var1) {
      float var4 = var1.method_24653();
      float var5 = var1.method_24647();
      float var6 = var1.method_24648();
      float var7 = var1.method_24656();
      float var8 = 2.0F * var4 * var4;
      float var9 = 2.0F * var5 * var5;
      float var10 = 2.0F * var6 * var6;
      this.field_33414 = 1.0F - var9 - var10;
      this.field_33409 = 1.0F - var10 - var8;
      this.field_33410 = 1.0F - var8 - var9;
      float var11 = var4 * var5;
      float var12 = var5 * var6;
      float var13 = var6 * var4;
      float var14 = var4 * var7;
      float var15 = var5 * var7;
      float var16 = var6 * var7;
      this.field_33411 = 2.0F * (var11 + var16);
      this.field_33403 = 2.0F * (var11 - var16);
      this.field_33415 = 2.0F * (var13 - var15);
      this.field_33413 = 2.0F * (var13 + var15);
      this.field_33404 = 2.0F * (var12 + var14);
      this.field_33408 = 2.0F * (var12 - var14);
   }

   public static class_6555 method_29884(float var0, float var1, float var2) {
      class_6555 var5 = new class_6555();
      var5.field_33414 = var0;
      var5.field_33409 = var1;
      var5.field_33410 = var2;
      return var5;
   }

   public class_6555(class_8107 var1) {
      this.field_33414 = var1.field_41531;
      this.field_33403 = var1.field_41518;
      this.field_33413 = var1.field_41521;
      this.field_33411 = var1.field_41520;
      this.field_33409 = var1.field_41519;
      this.field_33408 = var1.field_41528;
      this.field_33415 = var1.field_41523;
      this.field_33404 = var1.field_41525;
      this.field_33410 = var1.field_41522;
   }

   public class_6555(class_6555 var1) {
      this.field_33414 = var1.field_33414;
      this.field_33403 = var1.field_33403;
      this.field_33413 = var1.field_33413;
      this.field_33411 = var1.field_33411;
      this.field_33409 = var1.field_33409;
      this.field_33408 = var1.field_33408;
      this.field_33415 = var1.field_33415;
      this.field_33404 = var1.field_33404;
      this.field_33410 = var1.field_33410;
   }

   private static Pair<Float, Float> method_29883(float var0, float var1, float var2) {
      float var5 = 2.0F * (var0 - var2);
      if (!(field_33412 * var1 * var1 < var5 * var5)) {
         return Pair.of(field_33407, field_33405);
      } else {
         float var6 = MathHelper.method_42836(var1 * var1 + var5 * var5);
         return Pair.of(var6 * var1, var6 * var5);
      }
   }

   private static Pair<Float, Float> method_29881(float var0, float var1) {
      float var4 = (float)Math.hypot((double)var0, (double)var1);
      float var5 = !(var4 > 1.0E-6F) ? 0.0F : var1;
      float var6 = Math.abs(var0) + Math.max(var4, 1.0E-6F);
      if (var0 < 0.0F) {
         float var7 = var5;
         var5 = var6;
         var6 = var7;
      }

      float var10 = MathHelper.method_42836(var6 * var6 + var5 * var5);
      var6 *= var10;
      var5 *= var10;
      return Pair.of(var5, var6);
   }

   private static Quaternion method_29900(class_6555 var0) {
      class_6555 var3 = new class_6555();
      Quaternion var4 = Quaternion.IDENTITY.method_24651();
      if (var0.field_33403 * var0.field_33403 + var0.field_33411 * var0.field_33411 > 1.0E-6F) {
         Pair var5 = method_29883(var0.field_33414, 0.5F * (var0.field_33403 + var0.field_33411), var0.field_33409);
         Float var6 = (Float)var5.getFirst();
         Float var7 = (Float)var5.getSecond();
         Quaternion var8 = new Quaternion(0.0F, 0.0F, var6, var7);
         float var9 = var7 * var7 - var6 * var6;
         float var10 = -2.0F * var6 * var7;
         float var11 = var7 * var7 + var6 * var6;
         var4.method_24658(var8);
         var3.method_29888();
         var3.field_33414 = var9;
         var3.field_33409 = var9;
         var3.field_33411 = -var10;
         var3.field_33403 = var10;
         var3.field_33410 = var11;
         var0.method_29891(var3);
         var3.method_29899();
         var3.method_29891(var0);
         var0.method_29901(var3);
      }

      if (var0.field_33413 * var0.field_33413 + var0.field_33415 * var0.field_33415 > 1.0E-6F) {
         Pair var12 = method_29883(var0.field_33414, 0.5F * (var0.field_33413 + var0.field_33415), var0.field_33410);
         float var14 = -(Float)var12.getFirst();
         Float var16 = (Float)var12.getSecond();
         Quaternion var18 = new Quaternion(0.0F, var14, 0.0F, var16);
         float var20 = var16 * var16 - var14 * var14;
         float var22 = -2.0F * var14 * var16;
         float var24 = var16 * var16 + var14 * var14;
         var4.method_24658(var18);
         var3.method_29888();
         var3.field_33414 = var20;
         var3.field_33410 = var20;
         var3.field_33415 = var22;
         var3.field_33413 = -var22;
         var3.field_33409 = var24;
         var0.method_29891(var3);
         var3.method_29899();
         var3.method_29891(var0);
         var0.method_29901(var3);
      }

      if (var0.field_33408 * var0.field_33408 + var0.field_33404 * var0.field_33404 > 1.0E-6F) {
         Pair var13 = method_29883(var0.field_33409, 0.5F * (var0.field_33408 + var0.field_33404), var0.field_33410);
         Float var15 = (Float)var13.getFirst();
         Float var17 = (Float)var13.getSecond();
         Quaternion var19 = new Quaternion(var15, 0.0F, 0.0F, var17);
         float var21 = var17 * var17 - var15 * var15;
         float var23 = -2.0F * var15 * var17;
         float var25 = var17 * var17 + var15 * var15;
         var4.method_24658(var19);
         var3.method_29888();
         var3.field_33409 = var21;
         var3.field_33410 = var21;
         var3.field_33404 = -var23;
         var3.field_33408 = var23;
         var3.field_33414 = var25;
         var0.method_29891(var3);
         var3.method_29899();
         var3.method_29891(var0);
         var0.method_29901(var3);
      }

      return var4;
   }

   public void method_29899() {
      float var3 = this.field_33403;
      this.field_33403 = this.field_33411;
      this.field_33411 = var3;
      var3 = this.field_33413;
      this.field_33413 = this.field_33415;
      this.field_33415 = var3;
      var3 = this.field_33408;
      this.field_33408 = this.field_33404;
      this.field_33404 = var3;
   }

   public Triple<Quaternion, class_2426, Quaternion> method_29894() {
      Quaternion var3 = Quaternion.IDENTITY.method_24651();
      Quaternion var4 = Quaternion.IDENTITY.method_24651();
      class_6555 var5 = this.method_29882();
      var5.method_29899();
      var5.method_29891(this);

      for (int var6 = 0; var6 < 5; var6++) {
         var4.method_24658(method_29900(var5));
      }

      var4.method_24659();
      class_6555 var31 = new class_6555(this);
      var31.method_29891(new class_6555(var4));
      float var7 = 1.0F;
      Pair var8 = method_29881(var31.field_33414, var31.field_33411);
      Float var9 = (Float)var8.getFirst();
      Float var10 = (Float)var8.getSecond();
      float var11 = var10 * var10 - var9 * var9;
      float var12 = -2.0F * var9 * var10;
      float var13 = var10 * var10 + var9 * var9;
      Quaternion var14 = new Quaternion(0.0F, 0.0F, var9, var10);
      var3.method_24658(var14);
      class_6555 var15 = new class_6555();
      var15.method_29888();
      var15.field_33414 = var11;
      var15.field_33409 = var11;
      var15.field_33411 = var12;
      var15.field_33403 = -var12;
      var15.field_33410 = var13;
      var7 *= var13;
      var15.method_29891(var31);
      var8 = method_29881(var15.field_33414, var15.field_33415);
      float var16 = -(Float)var8.getFirst();
      Float var17 = (Float)var8.getSecond();
      float var18 = var17 * var17 - var16 * var16;
      float var19 = -2.0F * var16 * var17;
      float var20 = var17 * var17 + var16 * var16;
      Quaternion var21 = new Quaternion(0.0F, var16, 0.0F, var17);
      var3.method_24658(var21);
      class_6555 var22 = new class_6555();
      var22.method_29888();
      var22.field_33414 = var18;
      var22.field_33410 = var18;
      var22.field_33415 = -var19;
      var22.field_33413 = var19;
      var22.field_33409 = var20;
      var7 *= var20;
      var22.method_29891(var15);
      var8 = method_29881(var22.field_33409, var22.field_33404);
      Float var23 = (Float)var8.getFirst();
      Float var24 = (Float)var8.getSecond();
      float var25 = var24 * var24 - var23 * var23;
      float var26 = -2.0F * var23 * var24;
      float var27 = var24 * var24 + var23 * var23;
      Quaternion var28 = new Quaternion(var23, 0.0F, 0.0F, var24);
      var3.method_24658(var28);
      class_6555 var29 = new class_6555();
      var29.method_29888();
      var29.field_33409 = var25;
      var29.field_33410 = var25;
      var29.field_33404 = var26;
      var29.field_33408 = -var26;
      var29.field_33414 = var27;
      var7 *= var27;
      var29.method_29891(var22);
      var7 = 1.0F / var7;
      var3.method_24657((float)Math.sqrt((double)var7));
      class_2426 var30 = new class_2426(var29.field_33414 * var7, var29.field_33409 * var7, var29.field_33410 * var7);
      return Triple.of(var3, var30, var4);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class_6555 var4 = (class_6555)var1;
         return Float.compare(var4.field_33414, this.field_33414) == 0
            && Float.compare(var4.field_33403, this.field_33403) == 0
            && Float.compare(var4.field_33413, this.field_33413) == 0
            && Float.compare(var4.field_33411, this.field_33411) == 0
            && Float.compare(var4.field_33409, this.field_33409) == 0
            && Float.compare(var4.field_33408, this.field_33408) == 0
            && Float.compare(var4.field_33415, this.field_33415) == 0
            && Float.compare(var4.field_33404, this.field_33404) == 0
            && Float.compare(var4.field_33410, this.field_33410) == 0;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_33414 == 0.0F ? 0 : Float.floatToIntBits(this.field_33414);
      var3 = 31 * var3 + (this.field_33403 == 0.0F ? 0 : Float.floatToIntBits(this.field_33403));
      var3 = 31 * var3 + (this.field_33413 == 0.0F ? 0 : Float.floatToIntBits(this.field_33413));
      var3 = 31 * var3 + (this.field_33411 == 0.0F ? 0 : Float.floatToIntBits(this.field_33411));
      var3 = 31 * var3 + (this.field_33409 == 0.0F ? 0 : Float.floatToIntBits(this.field_33409));
      var3 = 31 * var3 + (this.field_33408 == 0.0F ? 0 : Float.floatToIntBits(this.field_33408));
      var3 = 31 * var3 + (this.field_33415 == 0.0F ? 0 : Float.floatToIntBits(this.field_33415));
      var3 = 31 * var3 + (this.field_33404 == 0.0F ? 0 : Float.floatToIntBits(this.field_33404));
      return 31 * var3 + (this.field_33410 == 0.0F ? 0 : Float.floatToIntBits(this.field_33410));
   }

   public void method_29901(class_6555 var1) {
      this.field_33414 = var1.field_33414;
      this.field_33403 = var1.field_33403;
      this.field_33413 = var1.field_33413;
      this.field_33411 = var1.field_33411;
      this.field_33409 = var1.field_33409;
      this.field_33408 = var1.field_33408;
      this.field_33415 = var1.field_33415;
      this.field_33404 = var1.field_33404;
      this.field_33410 = var1.field_33410;
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();
      var3.append("Matrix3f:\n");
      var3.append(this.field_33414);
      var3.append(" ");
      var3.append(this.field_33403);
      var3.append(" ");
      var3.append(this.field_33413);
      var3.append("\n");
      var3.append(this.field_33411);
      var3.append(" ");
      var3.append(this.field_33409);
      var3.append(" ");
      var3.append(this.field_33408);
      var3.append("\n");
      var3.append(this.field_33415);
      var3.append(" ");
      var3.append(this.field_33404);
      var3.append(" ");
      var3.append(this.field_33410);
      var3.append("\n");
      return var3.toString();
   }

   public void method_29888() {
      this.field_33414 = 1.0F;
      this.field_33403 = 0.0F;
      this.field_33413 = 0.0F;
      this.field_33411 = 0.0F;
      this.field_33409 = 1.0F;
      this.field_33408 = 0.0F;
      this.field_33415 = 0.0F;
      this.field_33404 = 0.0F;
      this.field_33410 = 1.0F;
   }

   public float method_29893() {
      float var3 = this.field_33409 * this.field_33410 - this.field_33408 * this.field_33404;
      float var4 = -(this.field_33411 * this.field_33410 - this.field_33408 * this.field_33415);
      float var5 = this.field_33411 * this.field_33404 - this.field_33409 * this.field_33415;
      float var6 = -(this.field_33403 * this.field_33410 - this.field_33413 * this.field_33404);
      float var7 = this.field_33414 * this.field_33410 - this.field_33413 * this.field_33415;
      float var8 = -(this.field_33414 * this.field_33404 - this.field_33403 * this.field_33415);
      float var9 = this.field_33403 * this.field_33408 - this.field_33413 * this.field_33409;
      float var10 = -(this.field_33414 * this.field_33408 - this.field_33413 * this.field_33411);
      float var11 = this.field_33414 * this.field_33409 - this.field_33403 * this.field_33411;
      float var12 = this.field_33414 * var3 + this.field_33403 * var4 + this.field_33413 * var5;
      this.field_33414 = var3;
      this.field_33411 = var4;
      this.field_33415 = var5;
      this.field_33403 = var6;
      this.field_33409 = var7;
      this.field_33404 = var8;
      this.field_33413 = var9;
      this.field_33408 = var10;
      this.field_33410 = var11;
      return var12;
   }

   public boolean method_29886() {
      float var3 = this.method_29893();
      if (!(Math.abs(var3) > 1.0E-6F)) {
         return false;
      } else {
         this.method_29889(var3);
         return true;
      }
   }

   public void method_29885(int var1, int var2, float var3) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var2 != 0) {
               if (var2 != 1) {
                  this.field_33410 = var3;
               } else {
                  this.field_33404 = var3;
               }
            } else {
               this.field_33415 = var3;
            }
         } else if (var2 != 0) {
            if (var2 != 1) {
               this.field_33408 = var3;
            } else {
               this.field_33409 = var3;
            }
         } else {
            this.field_33411 = var3;
         }
      } else if (var2 != 0) {
         if (var2 != 1) {
            this.field_33413 = var3;
         } else {
            this.field_33403 = var3;
         }
      } else {
         this.field_33414 = var3;
      }
   }

   public void method_29891(class_6555 var1) {
      float var4 = this.field_33414 * var1.field_33414 + this.field_33403 * var1.field_33411 + this.field_33413 * var1.field_33415;
      float var5 = this.field_33414 * var1.field_33403 + this.field_33403 * var1.field_33409 + this.field_33413 * var1.field_33404;
      float var6 = this.field_33414 * var1.field_33413 + this.field_33403 * var1.field_33408 + this.field_33413 * var1.field_33410;
      float var7 = this.field_33411 * var1.field_33414 + this.field_33409 * var1.field_33411 + this.field_33408 * var1.field_33415;
      float var8 = this.field_33411 * var1.field_33403 + this.field_33409 * var1.field_33409 + this.field_33408 * var1.field_33404;
      float var9 = this.field_33411 * var1.field_33413 + this.field_33409 * var1.field_33408 + this.field_33408 * var1.field_33410;
      float var10 = this.field_33415 * var1.field_33414 + this.field_33404 * var1.field_33411 + this.field_33410 * var1.field_33415;
      float var11 = this.field_33415 * var1.field_33403 + this.field_33404 * var1.field_33409 + this.field_33410 * var1.field_33404;
      float var12 = this.field_33415 * var1.field_33413 + this.field_33404 * var1.field_33408 + this.field_33410 * var1.field_33410;
      this.field_33414 = var4;
      this.field_33403 = var5;
      this.field_33413 = var6;
      this.field_33411 = var7;
      this.field_33409 = var8;
      this.field_33408 = var9;
      this.field_33415 = var10;
      this.field_33404 = var11;
      this.field_33410 = var12;
   }

   public void method_29890(Quaternion var1) {
      float var4 = var1.method_24653();
      float var5 = var1.method_24647();
      float var6 = var1.method_24648();
      float var7 = var1.method_24656();
      float var8 = 2.0F * var4 * var4;
      float var9 = 2.0F * var5 * var5;
      float var10 = 2.0F * var6 * var6;
      float var11 = var4 * var5;
      float var12 = var5 * var6;
      float var13 = var6 * var4;
      float var14 = var4 * var7;
      float var15 = var5 * var7;
      float var16 = var6 * var7;
      float var17 = 1.0F - var9 - var10;
      float var18 = 2.0F * (var11 - var16);
      float var19 = 2.0F * (var13 + var15);
      float var20 = 2.0F * (var11 + var16);
      float var21 = 1.0F - var10 - var8;
      float var22 = 2.0F * (var12 - var14);
      float var23 = 2.0F * (var13 - var15);
      float var24 = 2.0F * (var12 + var14);
      float var25 = 1.0F - var8 - var9;
      float var26 = this.field_33414 * var17 + this.field_33403 * var20 + this.field_33413 * var23;
      float var27 = this.field_33414 * var18 + this.field_33403 * var21 + this.field_33413 * var24;
      float var28 = this.field_33414 * var19 + this.field_33403 * var22 + this.field_33413 * var25;
      float var29 = this.field_33411 * var17 + this.field_33409 * var20 + this.field_33408 * var23;
      float var30 = this.field_33411 * var18 + this.field_33409 * var21 + this.field_33408 * var24;
      float var31 = this.field_33411 * var19 + this.field_33409 * var22 + this.field_33408 * var25;
      float var32 = this.field_33415 * var17 + this.field_33404 * var20 + this.field_33410 * var23;
      float var33 = this.field_33415 * var18 + this.field_33404 * var21 + this.field_33410 * var24;
      float var34 = this.field_33415 * var19 + this.field_33404 * var22 + this.field_33410 * var25;
      this.field_33414 = var26;
      this.field_33403 = var27;
      this.field_33413 = var28;
      this.field_33411 = var29;
      this.field_33409 = var30;
      this.field_33408 = var31;
      this.field_33415 = var32;
      this.field_33404 = var33;
      this.field_33410 = var34;
   }

   public void method_29889(float var1) {
      this.field_33414 *= var1;
      this.field_33403 *= var1;
      this.field_33413 *= var1;
      this.field_33411 *= var1;
      this.field_33409 *= var1;
      this.field_33408 *= var1;
      this.field_33415 *= var1;
      this.field_33404 *= var1;
      this.field_33410 *= var1;
   }

   public class_6555 method_29882() {
      return new class_6555(this);
   }

   public float method_29896(float var1, float var2, float var3) {
      return this.field_33414 * var1 + this.field_33403 * var2 + this.field_33413 * var3;
   }

   public float method_29897(float var1, float var2, float var3) {
      return this.field_33411 * var1 + this.field_33409 * var2 + this.field_33408 * var3;
   }

   public float method_29887(float var1, float var2, float var3) {
      return this.field_33415 * var1 + this.field_33404 * var2 + this.field_33410 * var3;
   }

   public void method_29895(Random var1) {
      this.field_33414 = var1.nextFloat();
      this.field_33403 = var1.nextFloat();
      this.field_33413 = var1.nextFloat();
      this.field_33411 = var1.nextFloat();
      this.field_33409 = var1.nextFloat();
      this.field_33408 = var1.nextFloat();
      this.field_33415 = var1.nextFloat();
      this.field_33404 = var1.nextFloat();
      this.field_33410 = var1.nextFloat();
   }

   public void method_29892(class_6555 var1) {
      class_6555 var4 = var1.method_29882();
      var4.method_29891(this);
      this.method_29901(var4);
   }
}
